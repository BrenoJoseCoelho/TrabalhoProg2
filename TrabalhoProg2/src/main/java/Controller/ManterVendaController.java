/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import View.JFGeralVendas;
import View.JFRelatorioVenda;
import View.JFVenda;

/**
 *
 * @author breno
 */
public class ManterVendaController {

    private JFGeralVendas telaGeralVendas;

    public ManterVendaController(JFGeralVendas telaGeralVendas) {

        this.telaGeralVendas = new JFGeralVendas();
        startButton();

    }

    public void startButton() {

        telaGeralVendas.adicionarAcaoBotaoNovaVenda(e
                -> {
            acaoNovaVenda();
        });

        telaGeralVendas.adicionarAcaoBotaoRelatorioVenda(e -> {
            acaoRelatorioVenda();
        });
    }

    public void acaoNovaVenda() {

        VendaController vendaController
                = new VendaController(new JFVenda(), null);
        vendaController.exibirTela();
    }

    public void acaoRelatorioVenda() {
        RelatorioVendaController relatorioVenda_Controller
                = new RelatorioVendaController(new JFRelatorioVenda(), null);
        relatorioVenda_Controller.exibirTela();
    }

    public void exibirTela() {
        telaGeralVendas.exbirTela();

    }

}
