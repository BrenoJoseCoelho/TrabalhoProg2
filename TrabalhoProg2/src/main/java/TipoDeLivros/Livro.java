/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TipoDeLivros;

import Livraria.Interfaces.VendaLivro;

/**
 *
 * @author LRodrigues
 */
public abstract class Livro {
    
    private String autor;
    private String titulo;
    private String editora;
    private String local;
    private String edicao;
    private String isbn;
    private float precoCompra;
    

    public Livro(String autor, String titulo, String editora, String local,
            String edicao, String isbn, float precoCompra) {
        this.autor = autor;
        this.titulo = titulo;
        this.editora = editora;
        this.local = local;
        this.edicao = edicao;
        this.isbn = isbn;
         this.precoCompra = precoCompra;
    }
    
    public abstract void addLivro(Livro livro);
    public abstract Livro buscarAutor(String autor);
    public abstract Livro buscarTitulo(String titulo);
    public abstract Livro buscarLivroEditora(String editora);
    public abstract Livro buscarISBN(String isbn);
    public abstract Livro buscarPreco(float preco);
    public abstract void removeLivro(Livro livro);

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

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public float getPreco() {
        return precoCompra;
    }

    public void setPreco(float precoCompra) {
        this.precoCompra = precoCompra;
    }

    @Override
    public String toString() {
        return "Livro{" + "Autor:" + autor + ", Titulo=" + titulo + ", editora=" + editora 
                + ", local=" + local + ", edicao=" + edicao + ", isbn=" + isbn + ", Preco de Compra = " + precoCompra + '}';
    }

 
    
    
}
