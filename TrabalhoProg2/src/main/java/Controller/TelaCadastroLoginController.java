/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import DAO.FuncionarioDAO;
import Exception.CampoVazioException;
import Exception.CpfIgualException;
import Repositorio.FuncionarioRepositorio;
import View.App.JFTelaLoginLivraria;
import View.JFAddFuncionario;
import View.JFCadastrarLogin;
import java.util.logging.Level;
import java.util.logging.Logger;
import models.Funcionario;

/**
 *
 * @author LRodrigues
 */
public class TelaCadastroLoginController {
    private JFCadastrarLogin cadastrarLogin;

    public TelaCadastroLoginController(JFCadastrarLogin cadastrarLogin) {
        this.cadastrarLogin = cadastrarLogin;
        iniciarAcoes();
     
    }
    
    
    public void iniciarAcoes (){
        cadastrarLogin.addAcaoSalvarFunc(e -> {
        acaoSalvaFunc();
        });
    }
    
    
      public void salvarFuncionario() throws CampoVazioException, CpfIgualException {
        try{
        FuncionarioRepositorio funcionarioRepositorio =  new FuncionarioDAO();
        Funcionario func = cadastrarLogin.returnFunc();
        funcionarioRepositorio.salvarFuncionario(func); 
        cadastrarLogin.mostrarMsg(" Funcionario Adicionado com sucesso! "
                + "\n [ Login: "+func.getEmail()+", "
                        + "Senha: "+func.getCpf() +" ] - " + func.toString());
        
        TelaLoginController telaLoginController 
                = new TelaLoginController(new JFTelaLoginLivraria());
                telaLoginController.exibirTela();
                    fecharTela();
        
        }catch( CampoVazioException | CpfIgualException e){
            cadastrarLogin.mostrarMsg(e.getMessage());
        }
    
        limparTela();
    }
      
      public void acaoSalvaFunc(){
             try {
            salvarFuncionario();
            
        } catch (CampoVazioException | CpfIgualException ex) {
            Logger.getLogger(JFAddFuncionario.class.getName()).log(Level.SEVERE, null, ex);
        }
      }  
      
        public void fecharTela(){
            cadastrarLogin.fecharTela();
        }  
        
        public void exibirTela(){
           cadastrarLogin.exbirTela();
        }
        
        public void limparTela(){
            cadastrarLogin.limparTela();
        }
       
      
            
        
}
