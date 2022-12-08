/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import DAO.FuncionarioDAO;
import Exception.CampoVazioException;
import Exception.CpfIgualException;
import Exception.EmailInválidoException;
import Exception.SomenteNumerosExceptionCPF;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author breno
 */
public class Funcionario implements AutenticacaoLogin {
    
    protected String nome;
    protected String cpf;
    protected String cargo;
    protected String email;
    static protected List<Venda> vendas = new ArrayList<>();
    protected List<Funcionario> func = new ArrayList<>();
    
    public Funcionario(String nome, String cpf, String cargo, String email) {
        this.nome = nome;
        this.cpf = cpf;
        this.cargo = cargo;
        this.email = email;
        this.func = new ArrayList<>();
    }

    public Funcionario() {
        
    }
    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) throws CampoVazioException{
        if(cargo.isBlank()){
            throw new CampoVazioException();
        }
        this.cargo = cargo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email)throws CampoVazioException, EmailInválidoException{
        
//        if(!email.matches("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
//                +"[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$"))
        if(!email.matches("^(.+)@(\\S+)$")){
            throw new EmailInválidoException();
        }
        if(email.isBlank()){
            throw new CampoVazioException();
        }
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) throws CampoVazioException{
        if(nome.isBlank()){
            throw new CampoVazioException();
        }
        this.nome = nome;
    }

    public void setCpf(String cpf) throws CpfIgualException, CampoVazioException, SomenteNumerosExceptionCPF {
       
        if(!cpf.matches("[0-9.]+")){
            throw  new SomenteNumerosExceptionCPF();
        }
        
        if(cpf.isBlank()){
            throw new CampoVazioException();
                    
        }
      FuncionarioDAO  funcionarioDAO = new FuncionarioDAO();
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
        return " Nome: " + nome + ", CPF: " + cpf + ", Cargo: " + cargo + ", Email: " + email +".";
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

      public void removeFunc(Funcionario funcio){
        this.func.remove(funcio);
    }
    public List<Funcionario> getFuncionario() {
        return this.func;
    }
    
   
}
