/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import DAO.ClienteDAO;
import Repositorio.ClienteRepositorio;
import View.JFAddCliente;
import View.JFClienteList;
import View.JFTelaInicial;
import View.Livro.JFAddLivro;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Collections;
import java.util.List;
import models.Cliente;

/**
 *
 * @author LRodrigues
 */
public class ClienteListController {
    private JFClienteList clienteList;
   private List<Cliente> clientes;
    private ClienteListController clienteListController;
    
    public ClienteListController(JFClienteList clienteList) {
    this.clientes = clientes;
    this.clienteList = new JFClienteList();
    iniciarAcoes();
    exibirTela();
    
    }
    
    
    public void iniciarAcoes(){
        acaoAddCliente();
        acaoListCliente();
        acaoLimparTela();
        acaoRemoverCliente();
        acaoTelaInicial();
        iniciarComboBox();        
    }
    
    
    public void acaoAddCliente(){
        clienteList.acaoAddCliente(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Cliente_Controller cliente_Controller =  
                        new Cliente_Controller(null, new JFAddCliente(), null);
                clienteList.fecharTela();
                cliente_Controller.fecharTela();                
                cliente_Controller.exibirTela();      
    }});}
    
    public void acaoListCliente(){
        clienteList.acaoListCliente(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                   listandoCliente();
    }});}
    

    public void acaoRemoverCliente(){
        clienteList.acaoRemoverCliente(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
//             clienteList.removerCliente();
             removerCliente();
             clienteList.fecharTela();
             ClienteListController clienteListController =
                     new ClienteListController(new JFClienteList());
                     clienteListController.exibirTela();                   
    }});}

    
    public void acaoTelaInicial(){
        clienteList.acaoAcessarTelaInicial(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
             TelaInicialController telaInicialController =
                     new TelaInicialController(new JFTelaInicial());
             telaInicialController.exibirTela();
             clienteList.fecharTela();
    }});}
    
    public void acaoLimparTela(){
        clienteList.acaoLimparTela(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               clienteList.limparTela();
    }});}
    
    public void removerCliente(){
         ClienteRepositorio clienteRepositorio = new ClienteDAO();
         Cliente c = new Cliente();
         c = clienteList.removerCliente();
         clienteRepositorio.removeCliente(c);
    }

    
    public void exibirTela(){
        clienteList.exibirTela();
    }
    
    public void iniciarComboBox(){
         ClienteRepositorio cr = new ClienteDAO();
        clientes = cr.buscarTodosClientes();
        clienteList.initComboCliente(clientes);
    }
    
        
    public void listandoCliente(){
      ClienteRepositorio clienteRepositorio = new ClienteDAO();
        clientes = clienteRepositorio.buscarTodosClientes();
            clienteList.listarCliente(clientes);
    }
    

    
     
    
}
