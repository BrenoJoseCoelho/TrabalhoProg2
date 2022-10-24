/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Repositorio.EstoqueRepositorio;
import Repositorio.LivroNovoRepositorio;
import Repositorio.LivroUsadoRepositorio;
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
     //private static List<Estoque> e =  new ArrayList<>();
    
  

    @Override
    public void attQuantidade(Estoque estoque) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

  

    @Override
    public void listaEstoque(Estoque estoque) {
        getTodosLivros();
    }

    @Override
    public List<Livro> getTodosLivros() {
 
           return livros;
    }

    @Override
    public void addEstoque(Estoque estoque) {
        
        LivroNovoRepositorio livroNovoRepositorio = new LivroNovoListDAO();
        LivroUsadoRepositorio livroUsadoRepositorio =  new LivroUsadoListDAO();
        livroNovoRepositorio.addLivroNovo((LivroNovo) livros);
        livroUsadoRepositorio.addLivroUsado((LivroUsado) livros);
  }

    @Override
    public void removeEstoque(Estoque estoque) {
  
        
    }

}    
    

