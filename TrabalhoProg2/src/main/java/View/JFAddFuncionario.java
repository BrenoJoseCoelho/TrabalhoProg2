/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;
 import DAO.FuncionarioDAO;
import Repositorio.FuncionarioRepositorio;
import javax.swing.JOptionPane;
import models.Fornecedor;
import models.Funcionario;
/**
 *
 * @author levan
 */
public class JFAddFuncionario extends javax.swing.JFrame {

    /**
     * Creates new form JFAddFuncionario
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

        canvas1 = new java.awt.Canvas();
        txtNomeFuncionario = new javax.swing.JLabel();
        txtCPFFuncionario = new javax.swing.JLabel();
        txtCargoFuncionario = new javax.swing.JLabel();
        txtEmailFuncionario = new javax.swing.JLabel();
        btnSalvarFuncionario = new javax.swing.JButton();
        txtAddNovoFuncionario = new javax.swing.JLabel();
        jTextFieldNomeFuncionario = new javax.swing.JTextField();
        jTextFieldCPF = new javax.swing.JTextField();
        jTextFieldCargoFuncionario = new javax.swing.JTextField();
        jTextFieldEmailFuncionario = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Adicionar novo funcionário");
        setBackground(new java.awt.Color(204, 255, 204));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        txtNomeFuncionario.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtNomeFuncionario.setText("Nome:");

        txtCPFFuncionario.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtCPFFuncionario.setText("CPF:");

        txtCargoFuncionario.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtCargoFuncionario.setText("Cargo:");

        txtEmailFuncionario.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtEmailFuncionario.setText("Email:");

        btnSalvarFuncionario.setBackground(new java.awt.Color(204, 204, 204));
        btnSalvarFuncionario.setForeground(new java.awt.Color(0, 0, 0));
        btnSalvarFuncionario.setText("Salvar ");
        btnSalvarFuncionario.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(102, 102, 102), new java.awt.Color(102, 102, 102), new java.awt.Color(102, 102, 102), new java.awt.Color(102, 102, 102)));
        btnSalvarFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarFuncionarioActionPerformed(evt);
            }
        });

        txtAddNovoFuncionario.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        txtAddNovoFuncionario.setText("Adicionar novo Funcionario:");

        jTextFieldNomeFuncionario.setBackground(new java.awt.Color(204, 204, 204));
        jTextFieldNomeFuncionario.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(102, 102, 102), new java.awt.Color(102, 102, 102), new java.awt.Color(102, 102, 102), new java.awt.Color(102, 102, 102)));
        jTextFieldNomeFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNomeFuncionarioActionPerformed(evt);
            }
        });

        jTextFieldCPF.setBackground(new java.awt.Color(204, 204, 204));
        jTextFieldCPF.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(102, 102, 102), new java.awt.Color(102, 102, 102), new java.awt.Color(102, 102, 102), new java.awt.Color(102, 102, 102)));
        jTextFieldCPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCPFActionPerformed(evt);
            }
        });

        jTextFieldCargoFuncionario.setBackground(new java.awt.Color(204, 204, 204));
        jTextFieldCargoFuncionario.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(102, 102, 102), new java.awt.Color(102, 102, 102), new java.awt.Color(102, 102, 102), new java.awt.Color(102, 102, 102)));

        jTextFieldEmailFuncionario.setBackground(new java.awt.Color(204, 204, 204));
        jTextFieldEmailFuncionario.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(102, 102, 102), new java.awt.Color(102, 102, 102), new java.awt.Color(102, 102, 102), new java.awt.Color(102, 102, 102)));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 109, Short.MAX_VALUE)
                .addComponent(txtAddNovoFuncionario)
                .addGap(85, 85, 85))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(170, 170, 170)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtCPFFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNomeFuncionario)
                            .addComponent(txtEmailFuncionario)
                            .addComponent(jTextFieldNomeFuncionario)
                            .addComponent(jTextFieldCPF)
                            .addComponent(jTextFieldCargoFuncionario, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                            .addComponent(jTextFieldEmailFuncionario)
                            .addComponent(txtCargoFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(218, 218, 218)
                        .addComponent(btnSalvarFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(txtAddNovoFuncionario)
                .addGap(31, 31, 31)
                .addComponent(txtNomeFuncionario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextFieldNomeFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(txtCPFFuncionario)
                .addGap(4, 4, 4)
                .addComponent(jTextFieldCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtCargoFuncionario)
                .addGap(4, 4, 4)
                .addComponent(jTextFieldCargoFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtEmailFuncionario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldEmailFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(btnSalvarFuncionario)
                .addContainerGap(109, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalvarFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarFuncionarioActionPerformed
        String nome = jTextFieldNomeFuncionario.getText();
        
        String cpf = jTextFieldCPF.getText();
        
        String email = jTextFieldEmailFuncionario.getText();
        
        String cargo = jTextFieldCargoFuncionario.getText();
        
        Funcionario funcionario = new Funcionario(nome, cpf, cargo, email);
        
        salvarFuncionario(funcionario);
        
        apresentarMensagem(funcionario.toString());
        
        limparTela();
       
    }//GEN-LAST:event_btnSalvarFuncionarioActionPerformed

    private void jTextFieldNomeFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNomeFuncionarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNomeFuncionarioActionPerformed

    private void jTextFieldCPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCPFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCPFActionPerformed

    public void salvarFuncionario(Funcionario funcionario){
        FuncionarioRepositorio funcionarioRepositorio = new FuncionarioDAO();
        funcionarioRepositorio.salvarFuncionario(funcionario);
    }
    public void limparTela(){
        jTextFieldCPF.setText("");
        jTextFieldCargoFuncionario.setText("");
        jTextFieldEmailFuncionario.setText("");
        jTextFieldNomeFuncionario.setText("");
    }
    
    public void apresentarMensagem(String msg){
        JOptionPane.showMessageDialog(null, msg);
    }
    
    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(JFAddFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFAddFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFAddFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFAddFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFAddFuncionario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSalvarFuncionario;
    private java.awt.Canvas canvas1;
    private javax.swing.JTextField jTextFieldCPF;
    private javax.swing.JTextField jTextFieldCargoFuncionario;
    private javax.swing.JTextField jTextFieldEmailFuncionario;
    private javax.swing.JTextField jTextFieldNomeFuncionario;
    private javax.swing.JLabel txtAddNovoFuncionario;
    private javax.swing.JLabel txtCPFFuncionario;
    private javax.swing.JLabel txtCargoFuncionario;
    private javax.swing.JLabel txtEmailFuncionario;
    private javax.swing.JLabel txtNomeFuncionario;
    // End of variables declaration//GEN-END:variables
}
