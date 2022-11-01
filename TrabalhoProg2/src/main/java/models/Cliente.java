/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author breno
 */
public class Cliente implements Comparable<Cliente>{
    
    protected String nome;
    protected String cpf;

    public Cliente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }
    public Cliente(){
        
    }
     

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    @Override
    public String toString() {
        return "Cliente: " + "nome: " + nome + ", cpf: " + cpf;
    }

    @Override
    public int compareTo(Cliente o) {
  
        if(nome == o.getNome()){
                return 1;
        }else{
                return -1;
            }
   
    
    }

 
}
