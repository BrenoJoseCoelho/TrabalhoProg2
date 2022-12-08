/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import DAO.FornecedorDAO;
import DAO.FuncionarioDAO;
import Exception.CampoVazioException;
import Exception.CnpjIgualException;
import Exception.CpfIgualException;
import Exception.SomenteNumerosExceptionCNPJ;
import Exception.SomenteNumerosExceptionCPF;
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


    public void setCNPJ(String CNPJ) throws CnpjIgualException, SomenteNumerosExceptionCNPJ, CampoVazioException {
      
        FornecedorDAO  fornDAO = new FornecedorDAO();
        for(Fornecedor forn : fornDAO.buscarTodosFornecedores()){
          if(forn.getCnpj().equals(CNPJ)){
             throw new CnpjIgualException();
            }}
        
         if(!CNPJ.matches("[0-9.]+")){
            throw  new SomenteNumerosExceptionCNPJ();
        }
           if(this.CNPJ.isBlank()){
            throw new CampoVazioException();
        } 
        this.CNPJ = CNPJ;
    }
    
    public void setEmpresa(String empresa) throws CampoVazioException {
            
        if(empresa.isBlank()){
            throw new CampoVazioException();
        }
    
        
      this.empresa = empresa;
    }

    public void setNome(String nome) throws CampoVazioException {
        if(nome.isBlank()){
            throw new CampoVazioException();
        }
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
