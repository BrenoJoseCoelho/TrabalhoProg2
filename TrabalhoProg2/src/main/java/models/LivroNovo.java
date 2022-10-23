
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

    public LivroNovo(float preco, String autor, String titulo, String editora, String local, String edicao, String isbn) {
        super(preco, autor, titulo, editora, local, edicao, isbn);
       
    }



    
}
