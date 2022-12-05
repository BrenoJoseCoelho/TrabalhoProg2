/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import View.JFAddFuncionario;
import models.Funcionario;

/**
 *
 * @author breno
 */
public class Funcionario_Controller {
    
    private Funcionario funcionario;
    private JFAddFuncionario addFuncionario;

    public Funcionario_Controller(JFAddFuncionario addFuncionario, Funcionario funcionario) {
        this.funcionario = funcionario;
        this.addFuncionario = addFuncionario;
    }
    
    
    public void exibirTela(){
        addFuncionario.exibirTela();
    }
    
    
}
