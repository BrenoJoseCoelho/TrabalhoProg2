
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;


import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author LRodrigues
 */
public class LivroNovo extends Livro  {
    
    private List<Livro> livros;
  

    public LivroNovo(String autor, String titulo, String editora, String local, String edicao, String isbn, double preco) {
        super(autor, titulo, editora, local, edicao, isbn, preco);
        this.livros = new ArrayList<>();
    }
    
    public LivroNovo(){
        
    }
    
    @Override
    public String toString() {
        return super.toString();
    }

    
 


    
}
