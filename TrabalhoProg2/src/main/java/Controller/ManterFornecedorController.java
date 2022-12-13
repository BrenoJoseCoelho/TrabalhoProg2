/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import DAO.FornecedorDAO;
import Repositorio.FornecedorRepositorio;
import View.JFAddFornecedor;
import View.JFFornecedorList;
import View.JFTelaInicial;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Set;
import models.Fornecedor;

/**
 *
 * @author breno
 */
public class ManterFornecedorController {

    private JFFornecedorList telaFornecedor;

    private Fornecedor fornecedorModel;

    public ManterFornecedorController(JFFornecedorList telaFornecedor, Fornecedor fornecedorModel) {
        this.telaFornecedor = telaFornecedor;
        this.fornecedorModel = fornecedorModel;
        inicializarAcaoBotoes();
        populaFornecedor();
    }

    public void inicializarAcaoBotoes() {

        telaFornecedor.adicionarAcaoBtnAddFornecedor(e -> exibirTelaCadastrarFornecedor());

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

        telaFornecedor.adicionarAcaobtnPaginaInicial(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                TelaInicialController telaInicialController
                        = new TelaInicialController(new JFTelaInicial());
                telaInicialController.exibirTela();
                telaFornecedor.fecharTela();
            }
        });

        telaFornecedor.adicionarAcaobtnRemoverFornecedor(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                removerFornecedor();
            }
        });

    }

    public void exibir() {
        telaFornecedor.exibirTela();
    }

    public void removerFornecedor() {

        Fornecedor fornecedor = telaFornecedor.getFornecedor();

        FornecedorRepositorio fornecedorRepositorio = new FornecedorDAO();
        fornecedorRepositorio.removerFornecedor(fornecedor);

        telaFornecedor.fecharTela();
        ManterFornecedorController manterFornecedor_Controller
                = new ManterFornecedorController(new JFFornecedorList(), null);
        manterFornecedor_Controller.exibir();
        telaFornecedor.fecharTela();

    }

    public void populaFornecedor() {
        FornecedorRepositorio fornecedorRepositorio = new FornecedorDAO();
        Set<Fornecedor> fornecedor = fornecedorRepositorio.buscarTodosFornecedores();

        telaFornecedor.popularFornecedor(fornecedor);
    }

    public void exibirTelaCadastrarFornecedor() {
        new AddFornecedorController(new JFAddFornecedor(), null).exibir();
        fecharTela();
    }

    public void listarFornecedor() {
        FornecedorRepositorio fornecedorRepositorio = new FornecedorDAO();

        telaFornecedor.populaDadosListaFornecedor(fornecedorRepositorio.buscarTodosFornecedores());

    }
    
    public void fecharTela(){
         telaFornecedor.fecharTela();
     }

}
