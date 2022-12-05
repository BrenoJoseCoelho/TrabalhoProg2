/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import View.JFGeralVendas;
import View.JFVenda;
import models.Venda;

/**
 *
 * @author breno
 */
public class Venda_controller {
    private Venda venda;
    private JFGeralVendas fGeralVendas;

    public Venda_controller(JFGeralVendas fGeralVendas, Venda venda ) {
        this.venda = venda;
        this.fGeralVendas = fGeralVendas;
    }

  

    public void exibirTela() {
        fGeralVendas.exbirTela();
    }

    
    
    
    
}
