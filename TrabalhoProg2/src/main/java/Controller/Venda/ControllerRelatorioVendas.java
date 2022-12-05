/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller.Venda;

import View.JFRelatorioVenda;

import View.JFAddCliente;
import models.Cliente;

/**
 *
 * @author breno
 */
<<<<<<< Updated upstream:TrabalhoProg2/src/main/java/Controller/Cliente_Controller.java
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
    
    
=======
public class ControllerRelatorioVendas {
    
    private JFRelatorioVenda telaRelatorio;
>>>>>>> Stashed changes:TrabalhoProg2/src/main/java/Controller/Venda/ControllerRelatorioVendas.java
    
    public void exibir() {
        telaRelatorio.exibirTela();
    }
}
