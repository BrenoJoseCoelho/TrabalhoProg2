/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import DAO.FornecedorDAO;
import DAO.FuncionarioDAO;
import Repositorio.FuncionarioRepositorio;
import View.JFAddFuncionario;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
        
        adicionarAcaoBotoes();
    }
    
      public void adicionarAcaoBotoes(){
        addFuncionario.adicionarAcaoBtnSalvarFuncionario(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                novoFuncionario();
              
            }
        });
    }

  
    
    public void novoFuncionario(){
        String cpf = addFuncionario.getCPF();
        String nome = addFuncionario.getNome();
         String email = addFuncionario.getEmail();
         String cargo = addFuncionario.getCargo();

        Funcionario funcionario = new Funcionario(nome, cpf, cargo, email);
        FuncionarioRepositorio funcionarioRepositorio = new FuncionarioDAO();
        funcionarioRepositorio.salvarFuncionario(funcionario);
        addFuncionario.exibirMensagem("Funcionario cadastrado com sucesso");
        addFuncionario.limparTela();
        fecharTela();
        

    }
    
    public void fecharTela(){
        addFuncionario.fecharTela();
    }
    
    public void exibirTela(){
        addFuncionario.exibirTela();
    }
    
    
}
