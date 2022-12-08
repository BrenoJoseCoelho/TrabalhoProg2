/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import DAO.ClienteDAO;
import DAO.FuncionarioDAO;
import Exception.CampoVazioException;
import Exception.CpfIgualException;
import Exception.SomenteNumerosExceptionCPF;

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

    public void setNome(String nome) throws CampoVazioException {
          if(nome.isBlank()){
            throw new CampoVazioException();
        }
        this.nome = nome;
    }

    public void setCpf(String cpf) throws CpfIgualException, SomenteNumerosExceptionCPF, CampoVazioException {
        
         if(!cpf.matches("[0-9.]+")){
            throw  new SomenteNumerosExceptionCPF();
        }
        
        if(cpf.isBlank()){
            throw new CampoVazioException();
                    
        }
        
        ClienteDAO clienteDAO = new ClienteDAO();
            for(Cliente c :clienteDAO.buscarTodosClientes()){
                if(c.getCpf().equals(cpf)){
                 throw new CpfIgualException();
                     }}
        
        this.cpf = cpf;
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
