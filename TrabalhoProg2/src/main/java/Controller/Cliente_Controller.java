/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import View.JFAddCliente;
import models.Cliente;

/**
 *
 * @author breno
 */
public class Cliente_Controller {
    private Cliente cliente;
    private JFAddCliente addCliente;

    public Cliente_Controller( JFAddCliente addCliente, Cliente cliente) {
        this.cliente = cliente;
        this.addCliente = addCliente;
    }

    
    
    
    void exibirTela() {
        addCliente.exibirTela();
    }
    
    
    
}
