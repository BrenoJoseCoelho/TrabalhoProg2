/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import DAO.FornecedorDAO;
import DAO.FuncionarioDAO;
import Exception.CampoVazioException;
import Exception.CpfIgualException;
import Exception.EmailInválidoException;
import Exception.SomenteNumerosExceptionCPF;
import Repositorio.FuncionarioRepositorio;
import View.JFAddFuncionario;
import View.JFFuncionarioList;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import models.Funcionario;

/**
 *
 * @author breno
 */
public class AddFuncionarioController {
    
    private Funcionario funcionario;
    private JFAddFuncionario addFuncionario;
    private JFFuncionarioList funcionarioList;

    public AddFuncionarioController(JFAddFuncionario addFuncionario, Funcionario funcionario) {
        this.funcionario = funcionario;
        this.addFuncionario = addFuncionario;
        this.funcionarioList = new JFFuncionarioList();
        
        adicionarAcaoBotoes();
    }
    
      public void adicionarAcaoBotoes(){
        addFuncionario.adicionarAcaoBtnSalvarFuncionario(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    novoFuncionario();
                } catch(CampoVazioException | CpfIgualException | SomenteNumerosExceptionCPF | EmailInválidoException ex){
   
                mostraMsg(ex.getMessage());
            
                }
              
            }
        });
    }

  
    
    public void novoFuncionario() throws CpfIgualException, CampoVazioException, 
            SomenteNumerosExceptionCPF, EmailInválidoException{
        
         String cpf = addFuncionario.getCPF();
         String nome = addFuncionario.getNome();
         String email = addFuncionario.getEmail();
         String cargo = addFuncionario.getCargo();

        Funcionario funcionario = new Funcionario(nome, cpf, cargo, email);
        funcionario.setNome(nome);
        funcionario.setCargo(cargo);
        funcionario.setCpf(cpf);
        funcionario.setEmail(email);
        FuncionarioRepositorio funcionarioRepositorio = new FuncionarioDAO();
        funcionarioRepositorio.salvarFuncionario(funcionario);
        mostraMsg("Funcionario cadastrado com sucesso");
        
         fecharTela();
         ManterFuncionarioController manterFuncionario_Controller
                = new ManterFuncionarioController(new JFFuncionarioList(), null);
        manterFuncionario_Controller.exibir();
        
       
    }
    
    public void fecharTela(){
        addFuncionario.fecharTela();
    }
    
    public void exibirTela(){
        addFuncionario.exibirTela();
    }
    public void mostraMsg(String s){
      addFuncionario.exibirMensagem(s);
    }
    
}
