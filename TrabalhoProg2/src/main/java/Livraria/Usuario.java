/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Livraria;

import Livraria.Funcionarios.FuncionarioEstoque;
import Livraria.Funcionarios.FuncionarioVenda;

/**
 *
 * @author LRodrigues
 */
    public interface Usuario {
        
        
        
        
       void addCliente(Cliente cliente);
       void addFuncionario(FuncionarioVenda funcionario);
       void addFuncionario(FuncionarioEstoque funcionario);
       
       
       Usuario login(String login);
       Usuario senha(String senha);
}
