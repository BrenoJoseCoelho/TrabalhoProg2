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
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import models.Fornecedor;

/**
 *s
 * @author breno
 */

public class Fornecedor_Controller{
     private Fornecedor modelFornecedor;
    private JFAddFornecedor telaFornecedor;
    
            
    public Fornecedor_Controller(JFAddFornecedor telaFornecedor, Fornecedor modelFornecedor){
        this.modelFornecedor = modelFornecedor;
        this.telaFornecedor = telaFornecedor;
        
        adicionarAcaoBotoes();
    }
    
    public void adicionarAcaoBotoes(){
        telaFornecedor.adicionarAcaoBtnSalvarFornecedor(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    novoFornecedor();
                      mostrarMsg("Fornecedor cadastrado com sucesso!");
                } catch (CnpjIgualException | SomenteNumerosExceptionCNPJ| CampoVazioException ex) {
                      mostrarMsg(ex.getMessage());  
                }
            }
        });
    }

    public void exibir(){
        telaFornecedor.exibirTela();
    }
    
    public void novoFornecedor() throws CnpjIgualException, SomenteNumerosExceptionCNPJ, CampoVazioException {
   
        String cnpj = telaFornecedor.getCNPJ();
        String nome = telaFornecedor.getNome();
         String empresa = telaFornecedor.getEmpresa();
         
         

        Fornecedor fornecedor = new Fornecedor(empresa, nome, cnpj);
     
        fornecedor.setEmpresa(empresa);
        fornecedor.setNome(nome);
           fornecedor.setCNPJ(cnpj);
        
        FornecedorRepositorio fornecedorRepositorio = new FornecedorDAO();
        fornecedorRepositorio.salvarFornecedor(fornecedor);
     
        telaFornecedor.limparTela();

    }

    public void mostrarMsg(String a){
        telaFornecedor.exibirMensagem(a);
    }
    
}
