/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Repositorio;

import java.util.List;
import models.Cliente;
import models.Funcionario;

/**
 *
 * @author breno
 */
public interface FuncionarioRepositorio {
    
    void salvarCliente(Cliente c);
    void salvarFuncionario(Funcionario func);
    Funcionario buscarCliente(String cpf);
    List<Funcionario> buscarTodosClientes();
    Funcionario retornarCpfFuncionario(String cpf);
    Funcionario retornarEmailFuncionario(String Email);
}
