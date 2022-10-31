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
public class Venda {
    
    private String dataVenda;
    private String observacao;
    private Cliente clientes;
    private Funcionario funcionarios;
    private LivroUsado livrou;
     private LivroNovo livron;


   

    public Venda(String dataVenda, String observacao, Cliente cliente, Funcionario funcionario, LivroUsado livrou,LivroNovo livron) {
        this.dataVenda = dataVenda;
        this.observacao = observacao;
        this.clientes = cliente;
        this.funcionarios = funcionario;
        this.livron = livron;
        this.livrou = livrou;
    }

    public String getDataVenda() {
        return dataVenda;
    }
    
    public String livrosVenda(){
    
    String livrousa = livrou.toString();
    String livronov = livron.toString();
    
    return "Livro Usado: "+ livrou + " Livro Novo: "+ livron;
    }

   

    public String getObservacao() {
        return observacao;
    }

    public double totalVenda(){
    
      double livronovo = livron.getPreco();
      double livrousado = livrou.getPreco();
      
      double total = livronovo + livrousado;
      
      return total;
      
    }
 

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    @Override
    public String toString() {
        return "Valor total da Venda: " + totalVenda() +" Data da Venda: " + dataVenda + ", observacao: " + observacao + ", Cliente: " + clientes.nome + ", funcionarios: " + funcionarios.nome + ", livro: " + livrosVenda() +"\n";
    }
    

}
