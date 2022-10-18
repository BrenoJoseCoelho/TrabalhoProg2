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
    private String status;
    private String observacao;
    private Cliente clientes;
    private Funcionario funcionarios;
    private List<Livro> livros;

    public Venda(String dataVenda, String status, String observacao, Cliente cliente, Funcionario funcionario) {
        this.dataVenda = dataVenda;
        this.status = status;
        this.observacao = observacao;
        this.clientes = cliente;
        this.funcionarios = funcionario;
        this.livros = new ArrayList<Livro>();
    }

    public String getDataVenda() {
        return dataVenda;
    }

    public String getStatus() {
        return status;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }
    
    
    
}
