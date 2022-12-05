/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import View.JFAddCliente;
import View.JFAddFornecedor;
import View.JFAddFuncionario;
import View.JFGeralVendas;
import View.JFTelaInicial;
import View.Livro.JFLivroList;

/**
 *
 * @author LRodrigues
 */
public class TelaInicialController {
    
    private JFTelaInicial telaInicial;

    public TelaInicialController(JFTelaInicial telaInicial) {
        this.telaInicial = telaInicial;
        startButton();
    }
    
    public void startButton(){
        telaInicial.adicionarAcaoBotaoEstoqueLivro(e -> {
            acaoMenuEstoque();
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
                new ListLivroController(new JFLivroList(), null, null);
        listLivroController.exbirTela();
    }
     public void acaoSair(){
         telaInicial.dispose();
    }       
     public void acaoMenuFuncionario(){
        Funcionario_Controller funcionario_Controller =
                 new Funcionario_Controller(new JFAddFuncionario(), null);
        funcionario_Controller.exibirTela();
        }
     
     public void acaoMenuVenda(){     
        Venda_controller venda_controller = 
                 new Venda_controller (new JFGeralVendas(), null);
        venda_controller.exibirTela();
        }
     
     public void acaoMenuFornecedor(){   
      Fornecedor_Controller fornecedor_Controller =
              new Fornecedor_Controller(new JFAddFornecedor(), null);
     fornecedor_Controller.exibirTela();
     
     }
     
     public void acaoMenuCliente(){
         Cliente_Controller cliente_Controller = 
                 new Cliente_Controller(new JFAddCliente(), null); 
                 cliente_Controller.exibirTela();
     }
     
     public void exibirTela(){
     telaInicial.exibirTela();
     }
     

}
