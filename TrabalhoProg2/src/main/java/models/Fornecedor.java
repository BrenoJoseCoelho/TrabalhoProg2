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
public class Fornecedor {
    
    private String empresa;
    private String nome;
    private String CNPJ;
    private List<Fornecedor> fornecedores = new ArrayList<>();

    public Fornecedor(String empresa, String nome, String cnpj) {
        this.empresa = empresa;
        this.nome = nome;
        this.CNPJ = cnpj;
    }
    

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmpresa() {
        return empresa;
    }

    public String getNome() {
        return nome;
    }

    public String getCnpj() {
        return CNPJ;
    }

    @Override
    public String toString() {
        return "Fornecedor{" + "empresa=" + empresa + ", nome=" + nome + ", cnpj=" + CNPJ + '}';
    }
    
    
}
