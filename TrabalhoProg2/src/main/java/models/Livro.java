/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import DAO.LivroNovoListDAO;
import DAO.LivroUsadoListDAO;
import Exception.IsbnExistenteException;

/**
 *
 * @author LRodrigues
 */
public abstract class Livro implements Comparable<Livro>{
    
    private String autor;
    private String titulo;
    private String editora;
    private String local;
    private String edicao;
    protected String isbn;
    private double preco;
 
 
    
    public Livro(double preco, String autor, String titulo, String editora, String local,
            String edicao, String isbn ) {
        this.autor = autor;
        this.titulo = titulo;
        this.editora = editora;
        this.local = local;
        this.edicao = edicao;
        this.isbn = isbn;
        this.preco = preco;
       
    }
   
    

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
    

    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getEdicao() {
        return edicao;
    }

    public void setEdicao(String edicao) {
        this.edicao = edicao;
    }
    
    public void setIsbn(String isbn) throws IsbnExistenteException {
        
      LivroNovoListDAO livroNovoDAO = new LivroNovoListDAO();
      LivroUsadoListDAO livroUsadoDAO = new LivroUsadoListDAO();
      
      for(Livro book : livroNovoDAO.getTodosLivrosNovos()){
           if(book.getIsbn().equals(isbn)){
                throw new  IsbnExistenteException();
           }         
      }
      for(Livro book1 : livroUsadoDAO.getTodosLivrosUsados()){
            if(book1.getIsbn().equals(isbn)){
                throw new  IsbnExistenteException();
           }         
      }
      this.isbn = isbn; 
    }
    
    public String getIsbn() {
        return isbn;
    }
    
    
    @Override
    public int compareTo(Livro o) {
        return this.isbn.compareTo(o.getIsbn());
    }
    
 
    @Override
    public String toString() {
        return "Livro{" + "Autor:" + autor + ", Titulo=" + titulo + ", editora=" + editora 
                + ", local=" + local + ", edicao=" + edicao + ", isbn=" + isbn + '}';
    }

 
    
    
}
