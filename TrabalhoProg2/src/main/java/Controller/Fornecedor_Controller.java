/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import View.JFAddFornecedor;
import models.Fornecedor;

/**
 *s
 * @author breno
 */
public class Fornecedor_Controller {

    private JFAddFornecedor addFornecedor;
    private Fornecedor fornecedor;

    public Fornecedor_Controller(JFAddFornecedor addFornecedor, Fornecedor fornecedor) {
        this.addFornecedor = addFornecedor;
        this.fornecedor = fornecedor;
    }
    
    public void exibirTela(){
        addFornecedor.exibirTela();
    }
    
    
    
}
