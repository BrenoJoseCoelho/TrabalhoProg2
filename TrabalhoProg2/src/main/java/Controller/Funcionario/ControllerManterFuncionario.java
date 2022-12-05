/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller.Funcionario;

import DAO.FuncionarioDAO;
import Repositorio.FuncionarioRepositorio;
import View.JFFuncionarioList;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import models.Funcionario;

/**
 *
 * @author breno
 */
public class ControllerManterFuncionario {
    private JFFuncionarioList telaFuncionario;
    private Funcionario funcionarioModel;

    private ControllerCadastroFuncionario controllerCadastrarFuncionario;

    public ControllerManterFuncionario(JFFuncionarioList telaFuncionario) {
        this.telaFuncionario = telaFuncionario;

        inicializarAcaoBotoes();
    }

    public void inicializarAcaoBotoes() {
        telaFuncionario.AcaoCadastrarFuncionario(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                controllerCadastrarFuncionario.exibir();
            }
        });

        telaFuncionario.AcaoListFuncionario(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                listarClientes();
            }
        });

        telaFuncionario.AcaoLimparTela(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                telaFuncionario.limparTela();
            }
        });

        //  telaCliente.AcaoTelaInicial(new ActionListener() {
        //    @Override
        //     public void actionPerformed(ActionEvent e) {
        //         controladorListarPacientes.exibir();
        //     }
        //  });
       // telaCliente.AcaoRemoverCliente(new ActionListener() {
      //      @Override
      //      public void actionPerformed(ActionEvent e) {
    //            controladorListarPacientes.exibir();
         //   }
    //    });

    }

    public void exibir() {
        telaFuncionario.exibirTela();
    }

    public void exibirTelaCadastrarCliente() {
        controllerCadastrarFuncionario.exibir();
    }

    public void listarClientes() {
        FuncionarioRepositorio funcionarioRepositorio = new FuncionarioDAO();

        telaFuncionario.populaDadosListaFuncionarios(funcionarioRepositorio.getTodosFuncionarios());

    }
}
