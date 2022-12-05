/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller.Cliente;

import DAO.ClienteDAO;
import Repositorio.ClienteRepositorio;
import View.JFClienteList;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Collections;
import models.Cliente;

/**
 *
 * @author breno
 */
public class ControllerManterCliente {

    private JFClienteList telaCliente;
    private Cliente clienteModel;

    private ControllerCadastroCliente controllerCadastrarCliente;

    public ControllerManterCliente(JFClienteList telaCliente) {
        this.telaCliente = telaCliente;

        inicializarAcaoBotoes();
        exibir();
    }

    public void inicializarAcaoBotoes() {
        telaCliente.AcaoCadastrarCliente(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                controllerCadastrarCliente.exibir();
            }
        });

        telaCliente.AcaoListCliente(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                listarClientes();
            }
        });

        telaCliente.AcaoLimparTela(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                telaCliente.limparTela();
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
        telaCliente.exibirTela();
    }

    public void exibirTelaCadastrarCliente() {
        controllerCadastrarCliente.exibir();
    }

    public void listarClientes() {
        ClienteRepositorio clienteRepositorio = new ClienteDAO();

        telaCliente.populaDadosListClientes(clienteRepositorio.buscarTodosClientes());

    }
}
