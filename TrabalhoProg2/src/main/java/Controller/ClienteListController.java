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

/**
 *
 * @author LRodrigues
 */
public class ClienteListController {
    private JFClienteList clienteList;
   
    private ClienteListController clienteListController;
    
    public ClienteListController(JFClienteList clienteList) {
 
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
                
                
                
            }
        });
    }
    
    public void acaoListCliente(){
        clienteList.acaoListCliente(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                    clienteList.listarCliente();
            }
        });
    }
    
    public void acaoRemoverCliente(){
        clienteList.acaoRemoverCliente(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
             clienteList.removerCliente();
             clienteList.fecharTela();
             ClienteListController clienteListController =
                     new ClienteListController(new JFClienteList());
                     clienteListController.exibirTela();
                     
            }
        });
        
    }
    public void exibirTela(){
        clienteList.exibirTela();
    }
    
    public void acaoTelaInicial(){
        clienteList.acaoAcessarTelaInicial(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
             TelaInicialController telaInicialController =
                     new TelaInicialController(new JFTelaInicial());
             telaInicialController.exibirTela();
             clienteList.fecharTela();
            }
        });
    }
    
    public void acaoLimparTela(){
        clienteList.acaoLimparTela(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               clienteList.limparTela();
            }
        });
    }
    
}
