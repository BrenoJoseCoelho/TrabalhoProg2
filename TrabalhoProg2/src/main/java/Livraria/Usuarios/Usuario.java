/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Livraria.Usuarios;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author LRodrigues
 */
public class Usuario {
    private String login;
    private String senha;
    List<FuncionarioEstoque> ListFuncEstoque;
    List<FuncionarioVenda> ListFuncVenda;
    List<Cliente> ListCliente;
 

    public Usuario(String login, String senha) {
        this.login = login;
        this.senha = senha;
        ListFuncEstoque = new ArrayList<>();
        ListFuncVenda = new ArrayList<>();
        ListCliente = new ArrayList<>();
    }
  
    
     
    public List<FuncionarioEstoque> getListFuncEstoque() {
        return ListFuncEstoque;
    }

    public void setListFuncEstoque(List<FuncionarioEstoque> ListFuncEstoque) {
        this.ListFuncEstoque = ListFuncEstoque;
    }

    public List<FuncionarioVenda> getListFuncVenda() {
        return ListFuncVenda;
    }

    public void setListFuncVenda(List<FuncionarioVenda> ListFuncVenda) {
        this.ListFuncVenda = ListFuncVenda;
    }

    public List<Cliente> getListCliente() {
        return ListCliente;
    }

    public void setListCliente(List<Cliente> ListCliente) {
        this.ListCliente = ListCliente;
    }
 

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }


        
}
