/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import DAO.FuncionarioDAO;
import Exception.CampoVazioException;
import Repositorio.FuncionarioRepositorio;
import View.App.JFTelaLoginLivraria;
import View.JFCadastrarLogin;
import View.JFTelaInicial;
import models.AutenticacaoLogin;
import models.Funcionario;

/**
 *
 * @author LRodrigues
 */
public class TelaLoginController {
    private JFTelaLoginLivraria loginLivraria;
    private JFCadastrarLogin cadastrarLogin;
      private static AutenticacaoLogin loginSucess;

    public TelaLoginController(JFTelaLoginLivraria loginLivraria) {
        this.loginLivraria = loginLivraria;
        this.cadastrarLogin = cadastrarLogin;
        startButton();
        exibirTela();
    }

    public TelaLoginController() {
    }
    
    
    public void startButton(){
    loginLivraria.addAcaoCadastrar(e -> {
        acaoCadastrarUser();
                
    });
    loginLivraria.addAcaoEntrar(e -> {
        acaoBotaoEntrar();
    });
    }
    
    
    public void acaoCadastrarUser(){
        TelaCadastroLoginController cadastroLoginController =
                new TelaCadastroLoginController(new JFCadastrarLogin());
        cadastrarLogin.exbirTela();
    
    }
     public void acaoTelaIniciar(){
       TelaInicialController inicialController =
                 new TelaInicialController(new JFTelaInicial());
         inicialController.exibirTela(); 
     }
     
       public static AutenticacaoLogin getUsuarioLogado(){
          return loginSucess;
    }    
   
     public boolean LogarSystem(String login, String senha){
         //Instaciando construtor da classe FuncionarioDAO
        FuncionarioRepositorio funcionarioRepositorio = new FuncionarioDAO();
        Funcionario f1 = funcionarioRepositorio.retornarEmailFuncionario(login);
         //Estrutura condicional para caso o funcionario for encontraado
        if(f1 != null){
            if(f1.Logar(login, senha)){ loginSucess = f1;
                return true;
            }
        }
          return false;
     }
     
     
     public void acaoBotaoEntrar(){
         
        try {
            loginLivraria.entrar();
                 
        } catch (CampoVazioException ex) {
           loginLivraria.mostrarMensagem(ex.getMessage());
        }
     }
    
     public void exibirTela(){
         loginLivraria.exbirTela();
     }
   
    
}
