/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Repositorio.FuncionarioRepositorio;
import java.util.ArrayList;
import java.util.List;
import models.Funcionario;

/**
 *
 * @author breno
 */
public class FuncionarioDAO implements FuncionarioRepositorio {
    
    private static List<Funcionario> funcionarios = new ArrayList<>();



    @Override
    public Funcionario retornarCpfFuncionario(String cpf) {
       for(Funcionario func: funcionarios){
            if(func.getCpf().equals(cpf))
                return func;
        }
        return null;
    }

    @Override
    public void salvarFuncionario(Funcionario func) {
            funcionarios.add(func);
    }

    @Override
    public Funcionario retornarEmailFuncionario(String email) {
          for(Funcionario func: funcionarios){
            if(func.getEmail().equals(email))
                return func;
          }
        return null;
          }

    @Override
    public List<Funcionario> getTodosFuncionarios() {
   return funcionarios;
    }
    
    
    }

