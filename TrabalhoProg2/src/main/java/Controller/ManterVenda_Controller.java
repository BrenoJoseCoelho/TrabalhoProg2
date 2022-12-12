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
public class ManterVenda_Controller {

    private JFGeralVendas telaGeralVendas;

    public ManterVenda_Controller(JFGeralVendas telaGeralVendas) {

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

        Venda_controller vendaController
                = new Venda_controller(new JFVenda(), null);
        vendaController.exibirTela();
    }

    public void acaoRelatorioVenda() {
        RelatorioVenda_Controller relatorioVenda_Controller
                = new RelatorioVenda_Controller(new JFRelatorioVenda(), null);
        relatorioVenda_Controller.exibirTela();
    }

    public void exibirTela() {
        telaGeralVendas.exbirTela();

    }

}
