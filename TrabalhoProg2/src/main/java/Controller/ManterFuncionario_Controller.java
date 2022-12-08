/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import DAO.FuncionarioDAO;
import Repositorio.FuncionarioRepositorio;
import View.JFAddFuncionario;
import View.JFFuncionarioList;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import models.Funcionario;

/**
 *
 * @author breno
 */
public class ManterFuncionario_Controller {
    
    private JFFuncionarioList telaFuncionario;

    private Funcionario FuncionarioModel;

    private Funcionario_Controller controllerCadastrarFuncionario;

    public ManterFuncionario_Controller(JFFuncionarioList telaFuncionario) {
        this.telaFuncionario = telaFuncionario;
        this.telaFuncionario = new JFFuncionarioList();
        inicializarAcaoBotoes();
        exibir();
    }

    public void inicializarAcaoBotoes() {
        telaFuncionario.adicionarAcaoBtnAddFuncionario(e ->  exibirTelaCadastrarFuncionario());
//        telaFuncionario.adicionarAcaoBtnAddFuncionario(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//
//                exibirTelaCadastrarFuncionario();
//            }
//        });


        telaFuncionario.adicionarAcaobtnListFuncionario(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                listarFuncionario();
            }
        });


        telaFuncionario.adicionarAcaobtnLimparTela(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                telaFuncionario.limparTela();
            }
        });


        //  telaFornecedor.adicionarAcaobtnPaginaInicial(new ActionListener() {

        //    @Override
        //     public void actionPerformed(ActionEvent e) {
        //         controladorListarPacientes.exibir();
        //     }
        //  });

        // telaFornecedor.adicionarAcaobtnRemoverFuncionario(new ActionListener() {
        //      @Override
        //      public void actionPerformed(ActionEvent e) {
        //            controladorListarPacientes.exibir();
        //   }
        //    });



    }

    public void exibir() {
        telaFuncionario.exibirTela();
    }

    public void exibirTelaCadastrarFuncionario(){
        new Funcionario_Controller(new JFAddFuncionario(), null).exibirTela();
        telaFuncionario.fecharTela();
       
    }

    public void listarFuncionario() {
        FuncionarioRepositorio funcionarioRepositorio = new FuncionarioDAO();

        telaFuncionario.populaDadosListaFuncionario(funcionarioRepositorio.getTodosFuncionarios());

    }
    
}
