/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import View.JFAddCliente;
import View.JFAddFornecedor;
import View.JFAddFuncionario;
import View.JFClienteList;
import View.JFFornecedorList;
import View.JFFuncionarioList;
import View.JFGeralVendas;
import View.JFTelaInicial;
import View.Livro.JFLivroList;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author LRodrigues
 */
public class TelaInicialController {
    
    private JFTelaInicial telaInicial;
    private JFLivroList fLivroList;
    private ListLivroController livroController;

    
    public TelaInicialController(JFTelaInicial telaInicial) {
        
       this.telaInicial = new JFTelaInicial();
       startButton();
      
    }
    
    public void startButton(){
     
        telaInicial.adicionarAcaoBotaoEstoqueLivro(e -> 
        {
            acaoMenuEstoque();
            fecharTela();
        });
        
        telaInicial.adicionarAcaoBotaoSair(e -> {
            acaoSair();
        });
        telaInicial.adicionarAcaoBotaoFuncionario(e -> {
            acaoMenuFuncionario();
        });
        telaInicial.adicionarAcaoBotaoVenda(e -> {
            acaoMenuVenda();
        });
        telaInicial.adicionarAcaoBotaoFornecedor(e -> {
            acaoMenuFornecedor();
        });
        telaInicial.adicionarAcaoBotaoCliente(e -> {
            acaoMenuCliente();
        });
   }
    
    
     public void acaoMenuEstoque(){
        
     ListLivroController listLivroController =
            new ListLivroController(new JFLivroList());
     listLivroController.exbirTela();
    }
     
     public void acaoSair(){
         fecharTela();
    }       
     public void acaoMenuFuncionario(){
        ManterFuncionario_Controller manterFuncionario_Controller =
                 new ManterFuncionario_Controller(new JFFuncionarioList(), null);
        manterFuncionario_Controller.exibir();
        }
     
     public void acaoMenuVenda(){     
        ManterVenda_Controller manterVenda_controller = 
                 new ManterVenda_Controller (new JFGeralVendas());
        manterVenda_controller.exibirTela();
        }
     
     public void acaoMenuFornecedor(){   
         
      ManterFornecedor_Controller fornecedor_Controller =
              new ManterFornecedor_Controller(new JFFornecedorList(), null);
     fornecedor_Controller.exibir();
     
     }
     
     public void acaoMenuCliente(){
         ClienteListController clienteListController = 
                 new ClienteListController(new JFClienteList()); 
                 clienteListController.exibirTela();
                 fecharTela();
     }
     
     public void exibirTela(){
     telaInicial.exibirTela();
     }
     
     public void fecharTela(){
         telaInicial.sairTela();
     }

}
