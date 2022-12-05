/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View.App;

import DAO.FuncionarioDAO;
import Exception.CampoVazioException;
import Repositorio.FuncionarioRepositorio;
import View.JFCadastrarLogin;
import View.JFTelaInicial;
import javax.swing.JOptionPane;
import models.AutenticacaoLogin;
import models.Funcionario;

/**
 *
 * @author LRodrigues
 */
public class JFTelaLoginLivraria extends javax.swing.JFrame {
      private static AutenticacaoLogin loginSucess;
    
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
        btnEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntrarActionPerformed(evt);
            }
        });

        btnCadastrar.setText("Cadastrar-se");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

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
    
    private void btnEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrarActionPerformed
       
        try {
            entrar();      
        } catch (CampoVazioException ex) {
            mostrarMensagem(ex.getMessage());
        }
        
        
       
    }//GEN-LAST:event_btnEntrarActionPerformed
    
    public void entrar() throws CampoVazioException{
        
      String login = this.txtLogin.getText();     
      String senha = this.txtSenha.getText();
        
        if(LogarSystem(login, senha)){
            openTelaInicial(); 
        }else if(!(login).equals(txtLogin.getText()) || txtLogin.getText().isEmpty()) { 
             mostrarMensagem("Login Inválido, verifique as suas Credencias!");
        }else if(!(senha).equals(txtSenha.getText()) || txtSenha.getText().isEmpty()){
              mostrarMensagem("Senha Inválida, verifique as suas Credencias!");
        }  
        mostrarMensagem("Login Realizado!");
    }
    
    
    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
         JFCadastrarLogin cadastrarLogin = new JFCadastrarLogin();
         cadastrarLogin.setVisible(true);
          this.dispose();
    }//GEN-LAST:event_btnCadastrarActionPerformed
    
    
     
    public static AutenticacaoLogin getUsuarioLogado(){
          return loginSucess;
    }    
   
    
    public boolean LogarSystem(String login, String senha){
         //Instaciando construtor da classe FuncionarioDAO
        FuncionarioRepositorio funcionarioRepositorio = new FuncionarioDAO();
        Funcionario f1 = funcionarioRepositorio.retornarEmailFuncionario(login);
        //funcionario1 = funcionarioRepositorio.retornarCpfFuncionario(senha);
   
        //Estrutura condicional para caso o funcionario for encontraado
        if(f1 != null){
            if(f1.Logar(login, senha)){ loginSucess = f1;
                return true;
            }
        }
          return false;
     }
    
     //métodos de abrir Tela
//    public void OpenTelaAfterLogin(){
//        if(loginSucess instanceof Funcionario){
//            JFTelaFuncionario telaFuncionario = new JFTelaFuncionario();
//            telaFuncionario.setVisible(true);     
//        }      
//        this.dispose();
//        }
   
    public void openTelaInicial(){
        JFTelaInicial fTelaInicial = new JFTelaInicial();
         fTelaInicial.setVisible(true );
         this.dispose();
    }
    
     public void exbirTela(){
        setVisible(true);
    }
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JFTelaLoginLivraria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFTelaLoginLivraria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFTelaLoginLivraria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFTelaLoginLivraria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new JFTelaLoginLivraria().setVisible(true);
            }
        });
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
