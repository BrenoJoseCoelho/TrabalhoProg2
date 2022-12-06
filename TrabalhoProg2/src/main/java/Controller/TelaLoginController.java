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
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
//    loginLivraria.addAcaoCadastrar(e -> {
//        acaoCadastrarUser();
//                
//    });
    acaoCadastrarUser();
    acaoBotaoEntrar();
    }
    
    
    public void acaoCadastrarUser(){
        loginLivraria.addAcaoCadastrar(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               TelaCadastroLoginController cadastroLoginController =
                new TelaCadastroLoginController(new JFCadastrarLogin());
                cadastroLoginController.exibirTela();
            }
        });
       
    
    }
     public void acaoTelaIniciar(){
       TelaInicialController inicialController =
                 new TelaInicialController(new JFTelaInicial());
         inicialController.exibirTela(); 
     }
     
       public static AutenticacaoLogin getUsuarioLogado(){
          return loginSucess;
    }    
   
     
     
     
     public void acaoBotaoEntrar() throws CampoVazioException{
         loginLivraria.addAcaoEntrar(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                  try {
                      loginLivraria.retunrnCamposlogin();
                      
                      loginLivraria.entrar();
                       } catch (CampoVazioException ex) {
                              loginLivraria.mostrarMensagem(ex.getMessage());
             }
             }
         });
     
     }
    
     public void exibirTela(){
         loginLivraria.exbirTela();
     }
   
    
}
