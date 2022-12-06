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
     
    }


    public void startButton(){

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
//     public void acaoTelaIniciar(){
//       TelaInicialController inicialController =
//                 new TelaInicialController(new JFTelaInicial());
//         inicialController.exibirTela(); 
//     }
     
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
        
        
     public void entrarLogin()throws CampoVazioException {
          
        if(LogarSystem(loginLivraria.retunrnCampologin(), loginLivraria.retunrnCampoSenha())){
            TelaInicialController telaInicialController =
                 new TelaInicialController(new JFTelaInicial());
                     fecharTela();
                     telaInicialController.exibirTela();
                       loginLivraria.mostrarMensagem("Login Realizado!");
                           
        }else 
            if(!(loginLivraria.retunrnCampologin())
                .equals(loginLivraria.retunrnCampologin()) 
                    || loginLivraria.retunrnCampologin().isEmpty()) { 
                        loginLivraria.mostrarMensagem("Login Inválido, verifique as suas Credencias!");
                 }else 
                    if(!(loginLivraria.retunrnCampoSenha())
                        .equals(loginLivraria.retunrnCampoSenha()) 
                            || loginLivraria.retunrnCampoSenha().isEmpty()){
                            loginLivraria.mostrarMensagem("Senha Inválida, verifique as suas Credencias!");
        }  
      
     }
     
     public void fecharTela(){
         loginLivraria.fecharTela();
     }
     
     public void acaoBotaoEntrar(){
         loginLivraria.addAcaoEntrar(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                  try {
                        entrarLogin();
                       } catch (CampoVazioException exception) {
                              loginLivraria.mostrarMensagem(exception.getMessage());
             }}});}
    
     public void exibirTela(){
         loginLivraria.exbirTela();
     }
   
    
}
