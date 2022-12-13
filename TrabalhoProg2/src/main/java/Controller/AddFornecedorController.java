/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import DAO.FornecedorDAO;
import Exception.CampoVazioException;
import Exception.CnpjIgualException;
import Exception.CpfIgualException;
import Exception.EmailInválidoException;
import Exception.SomenteNumerosExceptionCNPJ;
import Exception.SomenteNumerosExceptionCPF;
import Repositorio.FornecedorRepositorio;
import View.JFAddFornecedor;
import View.JFFornecedorList;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import models.Fornecedor;

/**
 * s
 *
 * @author breno
 */
public class AddFornecedorController {

    private Fornecedor modelFornecedor;
    private JFAddFornecedor telaAddFornecedor;
    

    public AddFornecedorController(JFAddFornecedor telaFornecedor, Fornecedor modelFornecedor) {
        this.modelFornecedor = modelFornecedor;
        this.telaAddFornecedor = telaFornecedor;

        adicionarAcaoBotoes();
    }

    public void adicionarAcaoBotoes() {
        telaAddFornecedor.adicionarAcaoBtnSalvarFornecedor(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    novoFornecedor();
                    mostrarMsg("Fornecedor cadastrado com sucesso!");
                } catch (CnpjIgualException | SomenteNumerosExceptionCNPJ | CampoVazioException ex) {
                    mostrarMsg(ex.getMessage());
                }
            }
        });
    }

    public void exibir() {
        telaAddFornecedor.exibirTela();
    }

    public void novoFornecedor() throws CnpjIgualException, SomenteNumerosExceptionCNPJ, CampoVazioException {

        String cnpj = telaAddFornecedor.getCNPJ();
        String nome = telaAddFornecedor.getNome();
        String empresa = telaAddFornecedor.getEmpresa();

        Fornecedor fornecedor = new Fornecedor(empresa, nome, cnpj);

        fornecedor.setEmpresa(empresa);
        fornecedor.setNome(nome);
        fornecedor.setCNPJ(cnpj);

        FornecedorRepositorio fornecedorRepositorio = new FornecedorDAO();
        fornecedorRepositorio.salvarFornecedor(fornecedor);

        telaAddFornecedor.fecharTela();

        ManterFornecedorController manterFornecedor_Controller
                = new ManterFornecedorController(new JFFornecedorList(), null);
        manterFornecedor_Controller.exibir();
    }

    public void mostrarMsg(String a) {
        telaAddFornecedor.exibirMensagem(a);
    }

}
