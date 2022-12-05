/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller.Fornecedor;

import DAO.FornecedorDAO;
import Repositorio.FornecedorRepositorio;
import View.JFAddFornecedor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import models.Fornecedor;

/**
 *
 * @author breno
 */
public class ControllerCadastroFornecedor {
    
    private Fornecedor modelFornecedor;
    private JFAddFornecedor telaFornecedor;
    
    public ControllerCadastroFornecedor() {
        modelFornecedor = new Fornecedor();
        telaFornecedor = new JFAddFornecedor();
        
        adicionarAcaoBotoes();
    }
    
    public void adicionarAcaoBotoes() {
        telaFornecedor.adicionarAcaobtnSalvarFornecedor(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                novoFornecedor();
            }
        });
    }

    public void exibir() {
        telaFornecedor.exibirTela();
    }
    
    public void novoFornecedor() {
        String cnpj = telaFornecedor.getCNPJ();
        String nome = telaFornecedor.getNome();
         String empresa = telaFornecedor.getEmpresa();

        Fornecedor fornecedor = new Fornecedor(empresa, nome, cnpj);
        FornecedorRepositorio fornecedorRepositorio = new FornecedorDAO();
        fornecedorRepositorio.salvarFornecedor(fornecedor);
        telaFornecedor.exibirMensagem("Fornecedor cadastrado com sucesso");
        telaFornecedor.limparTela();

    }
    
}
