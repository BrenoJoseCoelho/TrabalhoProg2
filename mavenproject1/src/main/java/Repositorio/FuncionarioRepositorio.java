/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Repositorio;

import java.util.List;
import models.Funcionario;

/**
 *
 * @author breno
 */
public interface FuncionarioRepositorio {
    
    public void salvarCliente(Funcionario c);
    public Funcionario buscarCliente(String cpf);
    public List<Funcionario> buscarTodosClientes();
    
}
