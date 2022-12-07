/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import DAO.ClienteDAO;
import Exception.CampoVazioException;
import Exception.CpfIgualException;
import Repositorio.ClienteRepositorio;
import View.JFAddCliente;
import View.JFClienteList;
import View.Livro.JFLivroList;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Map;
import models.Cliente;

/**
 *
 * @author breno
 */
    public class Cliente_Controller {
    private Cliente cliente;
    private JFAddCliente addCliente;
    private JFLivroList livroList;
    private JFClienteList clienteList;

    public Cliente_Controller( JFClienteList clienteList, JFAddCliente addCliente, Cliente cliente) {
        this.cliente = cliente;
        this.addCliente = new JFAddCliente();
        this.clienteList = new JFClienteList();
        acaoSalvarCliente();
        exibirTela();
    }

    
    public void acaoSalvarCliente(){
        addCliente.addAcaoSalvarCliente(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
             try{
        Map<String, String> dados = addCliente.getCampos();
        //criar a instância de Paciente
        Cliente cliente = new Cliente(dados.get("nome"), dados.get("CPF"));
        //salvar no BD
        salvarCliente(cliente);
        //Mostrar mensagem de sucesso
       addCliente.apresentarMensagem("Cliente Adicionado com Sucesso!");
       }catch(CampoVazioException | CpfIgualException ex){
              addCliente.apresentarMensagem(ex.getMessage());
                }
        
        //abri nova tela
         ClienteListController clienteListController = 
                 new ClienteListController(new JFClienteList()); 
                 clienteListController.exibirTela();
        //limpar tela        
        limparTela();
        
        fecharTela();
            }
        });
    }
    
    void exibirTela() {
        addCliente.exibirTela();
    }
    public void limparTela(){
    addCliente.limparTela();

    }
    public void fecharTela(){
        addCliente.fecharTela();
    }

    
     public void salvarCliente(Cliente cliente) throws CpfIgualException, CampoVazioException{
       ClienteRepositorio clienteRepositorio = new ClienteDAO();
       clienteRepositorio.salvarCliente(cliente);
    }
    
    
}
