/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller.Venda;

import View.JFGeralVendas;
import View.JFVenda;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author breno
 */
public class ControllerMenuVendas {
    
    private JFGeralVendas telaGeralVendas;

    private ControllerNovaVenda controllerNovaVenda;
    private ControllerRelatorioVendas controllerRelatroioVenda;

    public ControllerMenuVendas(JFGeralVendas telaGeralVendas) {
        this.telaGeralVendas = telaGeralVendas;
        
        inicializarAcaoBotoes();
        inicializarTelaNovaVenda();
        exibirTelaManterPaciente();
    }
    
    public void inicializarAcaoBotoes() {
        telaGeralVendas.adicionarAcaobtnNovaVenda(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                controllerNovaVenda.exibir();
            }
        });

        telaGeralVendas.adicionarAcaobtnRelatorioVenda(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controllerRelatroioVenda.exibir();
            }
        });

    }
    
    public void inicializarTelaNovaVenda() {
        controllerNovaVenda = new ControllerNovaVenda(new JFVenda());
    }
    
    public void exibirTelaManterPaciente() {
        telaGeralVendas.exibirTela();
    }
    
}
