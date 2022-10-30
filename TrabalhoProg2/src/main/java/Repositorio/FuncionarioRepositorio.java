/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Repositorio;

import java.util.List;
import models.Funcionario;
import models.LivroUsado;

/**
 *
 * @author breno
 */
public interface FuncionarioRepositorio {
    
    void salvarFuncionario(Funcionario func);
    Funcionario retornarCpfFuncionario(String cpf);
    Funcionario retornarEmailFuncionario(String Email);
    void removerFuncionario(Funcionario f);
    List<Funcionario> getTodosFuncionarios();        
}
