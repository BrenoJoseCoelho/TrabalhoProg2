/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View.App;

import Controller.TelaCadastroLoginController;
import Controller.TelaInicialController;
import Controller.TelaLoginController;
import DAO.FuncionarioDAO;
import Exception.CampoVazioException;
import Repositorio.FuncionarioRepositorio;
import View.JFCadastrarLogin;
import View.JFTelaInicial;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import models.AutenticacaoLogin;
import models.Funcionario;

/**
 *
 * @author LRodrigues
 */
public class JFTelaLoginLivraria extends javax.swing.JFrame {
      private static AutenticacaoLogin loginSucess;
     // JFTelaInicial fTelaInicial = new JFTelaInicial();
       TelaInicialController telaInicialController = new TelaInicialController(new JFTelaInicial());
     
    
    /**
     * Creates new form TelaLoginLivraria
     */
    public JFTelaLoginLivraria() {
        initComponents();
        dadosDefault();
    }
    public void dadosDefault(){
    FuncionarioRepositorio funcionarioRepositorio = new FuncionarioDAO();
   

    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitleLivraria = new javax.swing.JLabel();
        lblLogin = new javax.swing.JLabel();
        lblSenha = new javax.swing.JLabel();
        txtSenha = new javax.swing.JPasswordField();
        txtLogin = new javax.swing.JTextField();
        btnEntrar = new javax.swing.JButton();
        btnCadastrar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        lblTitleLivraria.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        lblTitleLivraria.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitleLivraria.setText("LIVRARIA");

        lblLogin.setText("Login:");

        lblSenha.setText("Senha:");

        btnEntrar.setText("Entrar");

        btnCadastrar.setText("Cadastrar-se");

        jLabel1.setText("Ainda não tem cadastro?");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(lblTitleLivraria, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(12, 12, 12))
            .addGroup(layout.createSequentialGroup()
                .addGap(143, 143, 143)
                .addComponent(btnEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(lblSenha)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtLogin, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtSenha)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnCadastrar)
                                .addGap(43, 43, 43)))
                        .addGap(60, 60, 60))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(lblLogin)
                        .addContainerGap(299, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitleLivraria, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblLogin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblSenha)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(btnCadastrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    // méttodo de mostar mensagem na tela
    public void mostrarMensagem(String msg) {
        JOptionPane.showMessageDialog(null, msg);
    }
    
    public void addAcaoEntrar(ActionListener acao){ 
    btnEntrar.addActionListener(acao);
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
    
    public void entrar() throws CampoVazioException{
        
      String login = this.txtLogin.getText();     
      String senha = this.txtSenha.getText();
    
        
        if(LogarSystem(login, senha)){
        telaInicialController.exibirTela();
             fecharTela();
              
           
        }else if(!(login).equals(txtLogin.getText()) || txtLogin.getText().isEmpty()) { 
             mostrarMensagem("Login Inválido, verifique as suas Credencias!");
        }else if(!(senha).equals(txtSenha.getText()) || txtSenha.getText().isEmpty()){
              mostrarMensagem("Senha Inválida, verifique as suas Credencias!");
        }  
        mostrarMensagem("Login Realizado!");
    }
    
        
    public void addAcaoCadastrar(ActionListener acao){ 
        btnCadastrar.addActionListener(acao);
    }
    
    public void fecharTela(){
    this.dispose();
    }
    
     public void exbirTela(){
        setVisible(true);
    }
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
            TelaLoginController loginController 
                = new TelaLoginController(new JFTelaLoginLivraria());
                 loginController.exibirTela();
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnEntrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblLogin;
    private javax.swing.JLabel lblSenha;
    private javax.swing.JLabel lblTitleLivraria;
    private javax.swing.JTextField txtLogin;
    private javax.swing.JPasswordField txtSenha;
    // End of variables declaration//GEN-END:variables
}
