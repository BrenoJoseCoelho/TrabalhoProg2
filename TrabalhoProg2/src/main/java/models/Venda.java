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
    private Livro livros;


   

    public Venda(String dataVenda, String observacao, Cliente cliente, Funcionario funcionario, Livro livro) {
        this.dataVenda = dataVenda;
        this.observacao = observacao;
        this.clientes = cliente;
        this.funcionarios = funcionario;
        this.livros = livro;
    }

    public String getDataVenda() {
        return dataVenda;
    }

   

    public String getObservacao() {
        return observacao;
    }

 

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    @Override
    public String toString() {
        return "Data da Venda: " + dataVenda + ", observacao: " + observacao + ", Cliente: " + clientes.nome + ", funcionarios: " + funcionarios.nome + ", livro: " + livros +"\n";
    }
    

}
