/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import DAO.FuncionarioDAO;
import Repositorio.FuncionarioRepositorio;
import View.JFAddFuncionario;
import View.JFFuncionarioList;
import View.JFTelaInicial;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import models.Funcionario;

/**
 *
 * @author breno
 */
public class ManterFuncionarioController {
    
    private JFFuncionarioList telaFuncionario;

    private Funcionario FuncionarioModel;


    public ManterFuncionarioController(JFFuncionarioList telaFuncionario, Funcionario FuncionarioModel) {
        this.telaFuncionario = telaFuncionario;
        this.FuncionarioModel = FuncionarioModel;
        inicializarAcaoBotoes();
        popularFuncionario();
        exibir();
    }

    public void inicializarAcaoBotoes() {
        telaFuncionario.adicionarAcaoBtnAddFuncionario(e ->  exibirTelaCadastrarFuncionario());



        telaFuncionario.adicionarAcaobtnListFuncionario(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                listarFuncionario();
            }
        });


        telaFuncionario.adicionarAcaobtnLimparTela(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                telaFuncionario.limparTela();
            }
        });


          telaFuncionario.adicionarAcaobtnPaginaInicial(new ActionListener() {

            @Override
             public void actionPerformed(ActionEvent e) {
                TelaInicialController telaInicialController
                        = new TelaInicialController(new JFTelaInicial());
                telaInicialController.fecharTela();
                telaInicialController.exibirTela();
                telaFuncionario.fecharTela();
             }
          });

         telaFuncionario.adicionarAcaobtnRemoverFuncionario(new ActionListener() {
              @Override
              public void actionPerformed(ActionEvent e) {
                   removerFuncionario();
           }
            });



    }

    public void exibir() {
        telaFuncionario.exibirTela();
    }

    public void removerFuncionario(){
        Funcionario funcionario = telaFuncionario.getFuncionario();
        
        FuncionarioRepositorio fornecedorRepositorio = new FuncionarioDAO();
        fornecedorRepositorio.removerFuncionario(funcionario);

        telaFuncionario.fecharTela();
        ManterFuncionarioController manterFuncionario_Controller
                = new ManterFuncionarioController(new JFFuncionarioList(), null);
        manterFuncionario_Controller.exibir();
        
    }
    
    public void popularFuncionario(){
    FuncionarioRepositorio funcionarioRepositorio = new FuncionarioDAO();
        List<Funcionario> funcionarios = funcionarioRepositorio.getTodosFuncionarios();
        telaFuncionario.initComboFuncionario(funcionarios);
    }
    
    public void exibirTelaCadastrarFuncionario(){
        new AddFuncionarioController(new JFAddFuncionario(), null).exibirTela();
        telaFuncionario.fecharTela();
       
    }

    public void listarFuncionario() {
        FuncionarioRepositorio funcionarioRepositorio = new FuncionarioDAO();

        telaFuncionario.populaDadosListaFuncionario(funcionarioRepositorio.getTodosFuncionarios());

    }
    
}
