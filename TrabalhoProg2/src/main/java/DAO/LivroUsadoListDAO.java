/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Repositorio.EstoqueRepositorio;
import Repositorio.LivroUsadoRepositorio;
import java.util.ArrayList;
import java.util.List;
import models.Livro;
import models.LivroNovo;
import models.LivroUsado;

/**
 *
 * @author LRodrigues
 */
public class LivroUsadoListDAO implements LivroUsadoRepositorio{

    private static List<LivroUsado> livrosUsados = new ArrayList<>();
    
       @Override
    public void addLivroUsado(LivroUsado lu) {
        livrosUsados.add(lu);
      
    }

    @Override
    public void removerLivroUsado(LivroUsado lu) {
      livrosUsados.remove(lu);

    }

    @Override
    public List<LivroUsado> getTodosLivrosUsados() {
            return livrosUsados;
    }

    @Override
    public LivroUsado BuscarLivroUsado(String ISBN) {
       for(LivroUsado books:livrosUsados){
        if(books.getIsbn().equals(books)){
        return books;
          }   }
        return null;
    }

    @Override
    public Livro buscarAutorLivroUsado(String autor) {
        for(LivroUsado book: livrosUsados){
         if(book.getAutor().equals(book)){
         return book;
         }
          }   
        return null;
    }
   

    @Override
    public Livro buscarTituloLivroUsado(String titulo) {
       for(LivroUsado book: livrosUsados){
         if(book.getTitulo().equals(titulo)){
         return book;
         }
          }   
        return null;
    }

    @Override
    public Livro buscarLivroEditoraLivroUsado(String editora) {
        for(LivroUsado book: livrosUsados){
         if(book.getEditora().equals(editora)){
         return book;
         }
          }   
        return null;
    }

 


    
}
