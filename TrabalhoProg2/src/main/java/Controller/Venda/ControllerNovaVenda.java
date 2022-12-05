/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller.Venda;

import View.JFVenda;

/**
 *
 * @author breno
 */
public class ControllerNovaVenda {
    
    private JFVenda telaVenda;

    public ControllerNovaVenda(JFVenda telaVenda) {
        this.telaVenda = telaVenda;
        
        exibir();
    }
    
    
    public void exibir() {
        telaVenda.setVisible(true);
    }
    
}
