/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import DAO.FuncionarioDAO;
import Exception.CpfIgualException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author breno
 */
public class Funcionario implements AutenticacaoLogin {
    
    private String nome;
    private String cpf;
    private String cargo;
    private String email;
    static protected List<Venda> vendas = new ArrayList<>();
    
    public Funcionario(String nome, String cpf, String cargo, String email) {
        this.nome = nome;
        this.cpf = cpf;
        this.cargo = cargo;
        this.email = email;
    }
    

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) throws CpfIgualException {
      FuncionarioDAO  funcionarioDAO= new FuncionarioDAO();
        for(Funcionario func : funcionarioDAO.getTodosFuncionarios()){
          if(func.getCpf().equals(cpf)){
             throw new CpfIgualException();
            }
                
        }
        this.cpf = cpf;
    }
    
    public String getCpf() {
        return cpf;
    }
    
    
    @Override
    public String toString() {
        return "Funcionario - " + "Nome:" + nome + ", CPF: " + cpf + ", Cargo: " + cargo + ", Email: " + email;
    }
    
      

    @Override
    public boolean Logar(String login, String senha) {
        if(login.equals(this.getEmail()) && senha.equals(this.cpf))
            return true;
        else
            return false;
    }

    @Override
    public List<String> getPermissoes() {
        List<String> permissoes = new ArrayList<>();
          permissoes.add("Visualizar Disponibilidade");
          permissoes.add("Realizar Venda");
        return permissoes;
        
    }

   
    
   
}
