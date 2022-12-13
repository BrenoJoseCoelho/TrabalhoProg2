/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import DAO.VendaDAO;
import Repositorio.VendaRepositorio;
import View.JFRelatorioVenda;
import models.Venda;

/**
 *
 * @author breno
 */
public class RelatorioVendaController {

    private Venda venda;
    private JFRelatorioVenda frelatorioVenda;

    public RelatorioVendaController(JFRelatorioVenda frelatorioVenda, Venda venda) {
        this.venda = venda;
        this.frelatorioVenda = frelatorioVenda;
        startButton();
    }

    public void startButton() {

        frelatorioVenda.adicionarAcaoBotaoLimparTela(e
                -> {
            limparTela();
        });

        frelatorioVenda.adicionarAcaoBotaoListaVendas(e -> {
            listarVendas();
        });

        frelatorioVenda.adicionarAcaoBotaoPesquisaData(e -> {
            listarPorData();
        });
    }

    public void listarVendas() {
        VendaRepositorio vendaRepositorio = new VendaDAO();

        frelatorioVenda.populaDadosListaVendas(vendaRepositorio.listarTodasVendas());

    }

    public void limparTela() {
        frelatorioVenda.limparTela();
    }

    public void listarPorData() {
        limparTela();
        String data = frelatorioVenda.getData();
        VendaRepositorio vendaRepositorio = new VendaDAO();
        frelatorioVenda.populaDadosListaVendasData(vendaRepositorio.relatorioVendaData(data));

    }

    public void exibirTela() {
        frelatorioVenda.exibirTela();
    }
}
