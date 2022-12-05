/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller.Fornecedor;

import DAO.FornecedorDAO;
import Repositorio.FornecedorRepositorio;
import View.JFFornecedorList;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import models.Fornecedor;

/**
 *
 * @author breno
 */
public class ControllerManterFornecedor {
    private JFFornecedorList telaFornecedor;
    private Fornecedor fornecedorModel;

    private ControllerCadastroFornecedor controllerCadastrarFornecedor;

    public ControllerManterFornecedor(JFFornecedorList telaFornecedor) {
        this.telaFornecedor = telaFornecedor;

        inicializarAcaoBotoes();
    }

    public void inicializarAcaoBotoes() {
        telaFornecedor.AcaoCadastrarFornecedor(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                controllerCadastrarFornecedor.exibir();
            }
        });

        telaFornecedor.AcaoListFornecedor(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                listarClientes();
            }
        });

        telaFornecedor.AcaoLimparTela(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                telaFornecedor.limparTela();
            }
        });

        //  telaFornecedor.AcaoTelaInicial(new ActionListener() {
        //    @Override
        //     public void actionPerformed(ActionEvent e) {
        //         controladorListarPacientes.exibir();
        //     }
        //  });
       // telaFornecedor.AcaoRemoverCliente(new ActionListener() {
      //      @Override
      //      public void actionPerformed(ActionEvent e) {
    //            controladorListarPacientes.exibir();
         //   }
    //    });

    }

    public void exibir() {
        telaFornecedor.exibirTela();
    }

    public void exibirTelaCadastrarCliente() {
        controllerCadastrarFornecedor.exibir();
    }

    public void listarClientes() {
        FornecedorRepositorio fornecedorRepositorio = new FornecedorDAO();

        telaFornecedor.populaDadosListaFornecedor(fornecedorRepositorio.buscarTodosFornecedores());

    }
}
