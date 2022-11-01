/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import DAO.FuncionarioDAO;
import Exception.CampoVazioException;
import Exception.CpfIgualException;
import Repositorio.FuncionarioRepositorio;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import models.Funcionario;

/**
 *
 * @author LRodrigues
 */
public class JFAddFuncionario extends javax.swing.JFrame {

    /**
     * Creates new form JFAddFunc
     */
    public JFAddFuncionario() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtAddNovoFunc = new javax.swing.JLabel();
        txtNomeFuncionario = new javax.swing.JLabel();
        txtCPFFuncionario = new javax.swing.JLabel();
        txtCargoFuncionario = new javax.swing.JLabel();
        txtEmailFuncionario = new javax.swing.JLabel();
        jTextFieldNomeFuncionario = new javax.swing.JTextField();
        jTextFieldCPF = new javax.swing.JTextField();
        jTextFieldCargoFuncionario = new javax.swing.JTextField();
        jTextFieldEmailFuncionario = new javax.swing.JTextField();
        btnSalvarFuncionario = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtAddNovoFunc.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtAddNovoFunc.setText("ADICIONAR FUNCIONÁRIO");

        txtNomeFuncionario.setText("Nome:");

        txtCPFFuncionario.setText("CPF:");

        txtCargoFuncionario.setText("Cargo:");

        txtEmailFuncionario.setText("Email:");

        btnSalvarFuncionario.setText("Salvar ");
        btnSalvarFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarFuncionarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(155, 155, 155)
                        .addComponent(txtAddNovoFunc))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(179, 179, 179)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtEmailFuncionario)
                            .addComponent(txtCargoFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNomeFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldNomeFuncionario, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE)
                            .addComponent(txtCPFFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldCPF)
                            .addComponent(jTextFieldCargoFuncionario)
                            .addComponent(jTextFieldEmailFuncionario)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(232, 232, 232)
                        .addComponent(btnSalvarFuncionario)))
                .addContainerGap(164, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(txtAddNovoFunc)
                .addGap(18, 18, 18)
                .addComponent(txtNomeFuncionario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldNomeFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtCPFFuncionario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtCargoFuncionario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldCargoFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtEmailFuncionario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldEmailFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(btnSalvarFuncionario)
                .addContainerGap(54, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalvarFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarFuncionarioActionPerformed
    try {
            salvarFuncionario();
            
        } catch (CampoVazioException | CpfIgualException ex) {
            Logger.getLogger(JFAddFuncionario.class.getName()).log(Level.SEVERE, null, ex);
        }

 
    }//GEN-LAST:event_btnSalvarFuncionarioActionPerformed
    
      public void salvarFuncionario() throws CampoVazioException, CpfIgualException {
        try{
        FuncionarioRepositorio funcionarioRepositorio =  new FuncionarioDAO();
        Funcionario func = returnFunc();
        funcionarioRepositorio.salvarFuncionario(func);
        
        mostrarMsg(" Funcionario Adicionado com sucesso! \n [ Login: "+func.getEmail()+
                ", Senha: "+func.getCpf() +" ] - " + func.toString());
        
        }catch( CampoVazioException | CpfIgualException e){
            mostrarMsg(e.getMessage());
        }
        
       
//        limparTela();
    }
    
      public void mostrarMsg(String msg) {
        JOptionPane.showMessageDialog(null, msg);
    }

    public Funcionario returnFunc() throws  CpfIgualException, CampoVazioException {
        String nome = jTextFieldNomeFuncionario.getText();
        String cpf = jTextFieldCPF.getText();
        String email = jTextFieldEmailFuncionario.getText();
        String cargo = jTextFieldCargoFuncionario.getText();

        Funcionario f = new Funcionario();
        f.setNome(nome);
        f.setCpf(cpf);
        f.setEmail(email);
        f.setCargo(cargo);
      
        return f;
    }  
      
    
        public void limparTela() {
        jTextFieldCPF.setText("");
        jTextFieldCargoFuncionario.setText("");
        jTextFieldEmailFuncionario.setText("");
        jTextFieldNomeFuncionario.setText("");
    }
    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSalvarFuncionario;
    private javax.swing.JTextField jTextFieldCPF;
    private javax.swing.JTextField jTextFieldCargoFuncionario;
    private javax.swing.JTextField jTextFieldEmailFuncionario;
    private javax.swing.JTextField jTextFieldNomeFuncionario;
    private javax.swing.JLabel txtAddNovoFunc;
    private javax.swing.JLabel txtCPFFuncionario;
    private javax.swing.JLabel txtCargoFuncionario;
    private javax.swing.JLabel txtEmailFuncionario;
    private javax.swing.JLabel txtNomeFuncionario;
    // End of variables declaration//GEN-END:variables
}
