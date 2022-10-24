/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;
import Repositorio.FornecedorRepositorio;
import DAO.FornecedorDAO;
import javax.swing.JOptionPane;
import models.Fornecedor;
/**
 *
 * @author levan
 */
public class JFAddFornecedor extends javax.swing.JFrame {

    /**
     * Creates new form JFFornecedor
     */
    public JFAddFornecedor() {
        initComponents();
        
    }
    
    

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtEmpresa = new javax.swing.JLabel();
        txtNomeFOrnecedor = new javax.swing.JLabel();
        txtCNPJFornecedor = new javax.swing.JLabel();
        jtfEmpresa = new javax.swing.JTextField();
        jtfNomeFornecedor = new javax.swing.JTextField();
        jtfCNPJfornecedor = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        btnSalvarFornecedor = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(204, 0, 51));

        txtEmpresa.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtEmpresa.setText("Empresa:");

        txtNomeFOrnecedor.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtNomeFOrnecedor.setText("Nome Fornecedor:");

        txtCNPJFornecedor.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtCNPJFornecedor.setText("CNPJ:");

        jtfEmpresa.setBackground(new java.awt.Color(204, 204, 204));
        jtfEmpresa.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(102, 102, 102), new java.awt.Color(102, 102, 102), new java.awt.Color(102, 102, 102), new java.awt.Color(102, 102, 102)));

        jtfNomeFornecedor.setBackground(new java.awt.Color(204, 204, 204));
        jtfNomeFornecedor.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(102, 102, 102), new java.awt.Color(102, 102, 102), new java.awt.Color(102, 102, 102), new java.awt.Color(102, 102, 102)));
        jtfNomeFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfNomeFornecedorActionPerformed(evt);
            }
        });

        jtfCNPJfornecedor.setBackground(new java.awt.Color(204, 204, 204));
        jtfCNPJfornecedor.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(102, 102, 102), new java.awt.Color(102, 102, 102), new java.awt.Color(102, 102, 102), new java.awt.Color(102, 102, 102)));

        jLabel4.setBackground(new java.awt.Color(51, 255, 51));
        jLabel4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel4.setText("               Adicionar Novo Fornecedor:");

        btnSalvarFornecedor.setBackground(new java.awt.Color(204, 204, 204));
        btnSalvarFornecedor.setForeground(new java.awt.Color(0, 0, 0));
        btnSalvarFornecedor.setText("Salvar");
        btnSalvarFornecedor.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(102, 102, 102), new java.awt.Color(102, 102, 102), new java.awt.Color(102, 102, 102), new java.awt.Color(102, 102, 102)));
        btnSalvarFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarFornecedorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(128, 128, 128)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtCNPJFornecedor)
                            .addComponent(txtNomeFOrnecedor)
                            .addComponent(txtEmpresa)
                            .addComponent(jtfNomeFornecedor, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
                            .addComponent(jtfEmpresa)
                            .addComponent(jtfCNPJfornecedor)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(167, 167, 167)
                        .addComponent(btnSalvarFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtEmpresa)
                .addGap(4, 4, 4)
                .addComponent(jtfEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(txtNomeFOrnecedor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtfNomeFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtCNPJFornecedor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtfCNPJfornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addComponent(btnSalvarFornecedor)
                .addGap(43, 43, 43))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtfNomeFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfNomeFornecedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfNomeFornecedorActionPerformed

    private void btnSalvarFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarFornecedorActionPerformed
       String nome = jtfNomeFornecedor.getText();
        
       String empresa = jtfEmpresa.getText();
        
       String CNPJ = jtfCNPJfornecedor.getText();
        
       Fornecedor fornecedor = new Fornecedor(empresa, nome, CNPJ);
        
       salvarFornecedor(fornecedor);
        
       apresentarMensagem(fornecedor.toString());
        
       limparTela();
        
        
    }//GEN-LAST:event_btnSalvarFornecedorActionPerformed

    public void salvarFornecedor(Fornecedor fornecedor){
        FornecedorRepositorio fornecedorRepositorio = new FornecedorDAO();
        fornecedorRepositorio.salvarFornecedor(fornecedor);
        
    }
    public void limparTela(){
        jtfCNPJfornecedor.setText("");
        jtfEmpresa.setText("");
        jtfNomeFornecedor.setText("");
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
            java.util.logging.Logger.getLogger(JFAddFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFAddFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFAddFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFAddFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFAddFornecedor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSalvarFornecedor;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField jtfCNPJfornecedor;
    private javax.swing.JTextField jtfEmpresa;
    private javax.swing.JTextField jtfNomeFornecedor;
    private javax.swing.JLabel txtCNPJFornecedor;
    private javax.swing.JLabel txtEmpresa;
    private javax.swing.JLabel txtNomeFOrnecedor;
    // End of variables declaration//GEN-END:variables

}
