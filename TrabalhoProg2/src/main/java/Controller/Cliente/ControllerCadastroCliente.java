/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller.Cliente;

import DAO.ClienteDAO;
import Repositorio.ClienteRepositorio;
import View.JFAddCliente;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import models.Cliente;

/**
 *
 * @author breno
 */
public class ControllerCadastroCliente {

    private Cliente modelCliente;
    private JFAddCliente telaCliente;

    public ControllerCadastroCliente() {
        modelCliente = new Cliente();
        telaCliente = new JFAddCliente();

        adicionarAcaoBotoes();
    }

    public void adicionarAcaoBotoes() {
        telaCliente.adicionarAcaoBtnSalvarCliente(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                novoCliente();
            }
        });
    }

    public void exibir() {
        telaCliente.exibirTela();
    }

    public void novoCliente() {
        String cpf = telaCliente.getCPF();
        String nome = telaCliente.getNome();

        Cliente cliente = new Cliente(nome, cpf);
        ClienteRepositorio clienteRepositorio = new ClienteDAO();
        clienteRepositorio.salvarCliente(cliente);
        telaCliente.exibirMensagem("Cliente cadastrado com Sucesso");
        telaCliente.limparTela();

    }

}
