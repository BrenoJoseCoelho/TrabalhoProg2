
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TipoDeLivros;

import Livraria.Interfaces.VendaLivro;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author LRodrigues
 */
public class LivroFisico extends Livro  {
    
    private List<Livro> livros;

    public LivroFisico(List<Livro> livros) {
          this.livros = new ArrayList<Livro>();
    }
     
    
    @Override
    public void addLivro(Livro livro) {
        livros.add(livro);
    }

    @Override
    public Livro buscarAutor(String autor) {
          for(Livro book: livros){
         if(book.getAutor().equals(book))
         return book;
    
          }   
        return null;
    }

    @Override
    public Livro buscarTitulo(String titulo) {
         for(Livro book: livros){
         if(book.getTitulo().equals(titulo))
         return book;
     
          }   
        return null;
    }

    @Override
    public Livro buscarLivroEditora(String editora) {
       
         for(Livro book: livros){
         if(book.getEditora().equals(editora))
         return book;
     
          }   
        return null;
    }

    @Override
    public Livro buscarISBN(String isbn) {
        for(Livro book: livros){
        if(book.getIsbn().equals(isbn))
        return book;
     
          }   
        return null;
    }

    @Override
    public Livro buscarPreco(float preco) {
        for(Livro book: livros){
        if(book.getPreco() > 0 )
        return book;
          }  
        return null;
    }

    @Override
    public void removeLivro(Livro livro) {
        livros.remove(livro);
    }
    
}
