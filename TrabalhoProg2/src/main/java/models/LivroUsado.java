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
    
    private String tempoUSo;

    public LivroUsado(String tempoUSo) {
        this.tempoUSo = tempoUSo;
    }
    
    public LivroUsado(){
        
    }
    public LivroUsado(String autor, String titulo, String editora, String local, String edicao, String isbn, double preco) {
        super(autor, titulo, editora, local, edicao, isbn, preco);
        this.tempoUSo = tempoUSo;
    }

    public String getTempoUSo() {
        return tempoUSo;
    }

    public void setTempoUSo(String tempoUSo) {
        this.tempoUSo = tempoUSo;
    }

    
      @Override
    public String toString() {
        return super.toString() + "Tempo de Uso: " + tempoUSo;
    }
  
    
    
        
  
 
    
}

 



 
    
    
  

 



 
