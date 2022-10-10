/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Livraria;

import TipoDeLivros.Livro;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 01295230208
 */
public class Estoque {
   private List<Livro> livros;
   
   public Estoque(){
     this.livros = new ArrayList<>();
    }   
   
    public void addLivro(Livro umLivro){
        this.livros.add(umLivro);
    }
}
