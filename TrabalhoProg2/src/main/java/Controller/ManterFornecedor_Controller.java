/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

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
public class ManterFornecedor_Controller {
    
       

   private JFFornecedorList telaFornecedor;

    private Fornecedor fornecedorModel;

    private Fornecedor_Controller controllerCadastrarFornecedor;

    public ManterFornecedor_Controller(JFFornecedorList telaFornecedor) {
        this.telaFornecedor = telaFornecedor;

        inicializarAcaoBotoes();
    }

    public void inicializarAcaoBotoes() {

        telaFornecedor.adicionarAcaoBtnAddFornecedor(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                controllerCadastrarFornecedor.exibir();
            }
        });


        telaFornecedor.adicionarAcaobtnListFornecedor(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                listarFornecedor();
            }
        });


        telaFornecedor.adicionarAcaobtnLimparTela(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                telaFornecedor.limparTela();
            }
        });


        //  telaFornecedor.adicionarAcaobtnPaginaInicial(new ActionListener() {

        //    @Override
        //     public void actionPerformed(ActionEvent e) {
        //         controladorListarPacientes.exibir();
        //     }
        //  });

        // telaFornecedor.adicionarAcaobtnRemoverFornecedor(new ActionListener() {
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

    public void listarFornecedor() {
        FornecedorRepositorio fornecedorRepositorio = new FornecedorDAO();

        telaFornecedor.populaDadosListaFornecedor(fornecedorRepositorio.buscarTodosFornecedores());

    }

}
