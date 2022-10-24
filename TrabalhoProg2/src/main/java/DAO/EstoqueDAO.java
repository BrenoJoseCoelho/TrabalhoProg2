/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Repositorio.EstoqueRepositorio;
import java.util.ArrayList;
import java.util.List;
import models.Estoque;
import models.Livro;
import models.LivroNovo;
import models.LivroUsado;

/**
 *
 * @author LRodrigues
 */
public class EstoqueDAO implements EstoqueRepositorio{
    
     private static List<Livro> livros = new ArrayList<>();
  
    
    @Override
    public void addEstoque(Estoque estoque) {
      estoque.addLivro((Livro) livros);
    }

    @Override
    public void attQuantidade(Estoque estoque) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void removeEstoque(Estoque estoque) {
        estoque.removeLivro((Livro) livros);
    }

    @Override
    public void listaEstoque(Estoque estoque) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Livro> getTodosLivros() {
 
           return livros;
    }

}    
    

