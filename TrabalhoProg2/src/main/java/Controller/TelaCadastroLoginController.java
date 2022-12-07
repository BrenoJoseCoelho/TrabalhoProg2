/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import DAO.FuncionarioDAO;
import Exception.CampoVazioException;
import Exception.CpfIgualException;
import Exception.SomenteNumerosExceptionCPF;
import Repositorio.FuncionarioRepositorio;
import View.App.JFTelaLoginLivraria;
import View.JFCadastrarLogin;
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
    
    
      public void salvarFuncionario() {
        try{
        FuncionarioRepositorio funcionarioRepositorio =  new FuncionarioDAO();
        Funcionario func = cadastrarLogin.returnFunc();
        funcionarioRepositorio.salvarFuncionario(func); 
        mostrarMsg(" Funcionario Adicionado com sucesso! "
                + "\n [ Login: "+func.getEmail()+", "
                        + "Senha: "+func.getCpf() +" ] - " + func.toString());
        
        TelaLoginController telaLoginController 
                = new TelaLoginController(new JFTelaLoginLivraria());
                telaLoginController.exibirTela();
                    fecharTela();
        
        }catch(CampoVazioException | CpfIgualException | SomenteNumerosExceptionCPF ex){
   
            mostrarMsg(ex.getMessage());
        }
    
        limparTela();
    }
      
      public void acaoSalvaFunc(){
//             try {
            salvarFuncionario();
//            
//        } catch (CampoVazioException | CpfIgualException | SomenteNumerosException ex) {
//            if(ex instanceof SomenteNumerosException){
//                mostrarMsg("Campo CPF "+ ex.getMessage());
//            }    
//            
//            mostrarMsg(ex.getMessage());
//        }
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
       
      
       public void mostrarMsg(String msg){
           cadastrarLogin.mostrarMsg(msg);
       }
               
       
}
