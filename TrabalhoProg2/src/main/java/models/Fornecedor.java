/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author breno
 */
public class Fornecedor {
    
    private String empresa;
    private String nome;
    private String CNPJ;

    public Fornecedor(String empresa, String nome, String cnpj) {
        this.empresa = empresa;
        this.nome = nome;
        this.CNPJ = cnpj;
    }

    public Fornecedor() {
       
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
    public int hashCode() {
        int hash = 5;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Fornecedor other = (Fornecedor) obj;
        if (!Objects.equals(this.empresa, other.empresa)) {
            return false;
        }
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        return Objects.equals(this.CNPJ, other.CNPJ);
    }
    
    
    
    @Override
    public String toString() {
        return " Empresa: " + empresa + ", Nome: " + nome + ", CNPJ: " + CNPJ+".";
    }


    
    
}
