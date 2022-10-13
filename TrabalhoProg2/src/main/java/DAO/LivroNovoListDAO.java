/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Repositorio.LivroNovoRepositorio;
import java.util.ArrayList;
import java.util.List;
import models.Livro;
import models.LivroNovo;

/**
 *
 * @author LRodrigues
 */
public class LivroNovoListDAO implements LivroNovoRepositorio{

      private static List<LivroNovo> livrosNovos = new ArrayList<>();
      

    @Override
    public void addLivroNovo(LivroNovo ln) {
        livrosNovos.add(ln);
    }

    @Override
    public void removerLivroNovo(LivroNovo ln) {
      livrosNovos.remove(ln);
    }

    @Override
    public List<LivroNovo> getTodosLivrosNovos() {
            return livrosNovos;
    }

    @Override
    public LivroNovo BuscarLivroNovo(String ISBN) {
       for(LivroNovo books:livrosNovos){
        if(books.getIsbn().equals(books));
        return books;
          }   
        return null;
    }

    @Override
    public Livro buscarAutorLivroNovo(String autor) {
        for(Livro book: livrosNovos){
         if(book.getAutor().equals(book))
         return book;
    
          }   
        return null;
    }
   

    @Override
    public Livro buscarTituloLivroNovo(String titulo) {
       for(Livro book: livrosNovos){
         if(book.getTitulo().equals(titulo))
         return book;
          }   
        return null;
    }

    @Override
    public Livro buscarLivroEditoraLivroNovo(String editora) {
        for(Livro book: livrosNovos){
         if(book.getEditora().equals(editora))
         return book;
     
          }   
        return null;
    }
    


    
    }
    
    
    

