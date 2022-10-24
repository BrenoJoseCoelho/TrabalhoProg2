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
public class LivroUsado extends Livro   {
    
    private String tempoUso []= {"Até 6 meses!","Até 1 ano!","Acima de 1 ano!"} ;

    public LivroUsado(String autor, String titulo, String editora, String local, String edicao, String isbn, double preco) {
        super(autor, titulo, editora, local, edicao, isbn, preco);
    }

    public LivroUsado(String tempoUso, String autor, String titulo, String editora, String local, String edicao, String isbn, double preco) {
        super(autor, titulo, editora, local, edicao, isbn, preco);
        
        this.tempoUso =  this.tempoUso;

 
    }
 
    public String[] getTempoUso() {
        return tempoUso;
    }

 



 
    
    
  

 



 
}
