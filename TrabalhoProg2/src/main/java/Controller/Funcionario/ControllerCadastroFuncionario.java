/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller.Funcionario;

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
public class ControllerCadastroFuncionario {
    
    private Funcionario modelFuncionario;
    private JFAddFuncionario telaFuncionario;
    
     public ControllerCadastroFuncionario() {
        modelFuncionario = new Funcionario();
        telaFuncionario = new JFAddFuncionario();

        adicionarAcaoBotoes();
    }

    public void adicionarAcaoBotoes() {
        telaFuncionario.adicionarAcaoBtnSalvarCliente(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                novoFuncionario();
            }
        });
    }

    public void exibir() {
        telaFuncionario.exibirTela();
    }

    public void novoFuncionario() {
        String cpf = telaFuncionario.getCPF();
        String nome = telaFuncionario.getNome();
        String cargo = telaFuncionario.getCargo();
        String email = telaFuncionario.getEmail();

        Funcionario funcionario = new Funcionario(nome, cpf, cargo, email);
        FuncionarioRepositorio clienteRepositorio = new FuncionarioDAO();
        clienteRepositorio.salvarFuncionario(funcionario);
        telaFuncionario.exibirMensagem("Funcionario cadastrado com sucesso");
        telaFuncionario.limparTela();

    }

    
}
