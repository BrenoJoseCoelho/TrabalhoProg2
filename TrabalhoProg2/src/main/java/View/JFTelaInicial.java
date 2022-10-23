/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

/**
 *
 * @author levan
 */
public class JFTelaInicial extends javax.swing.JFrame {

    /**
     * Creates new form JFTelaInicial
     */
    public JFTelaInicial() {
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

        btnAddCliente = new javax.swing.JButton();
        btnAddFuncionario = new javax.swing.JButton();
        btnAddFornecedor = new javax.swing.JButton();
        btnVisualizarVendas = new javax.swing.JButton();
        btnVisualizarEstoque = new javax.swing.JButton();
        txtCliente = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tela Inicial");

        btnAddCliente.setText("Adicionar Cliente");
        btnAddCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddClienteActionPerformed(evt);
            }
        });

        btnAddFuncionario.setText("Adicionar Funcionário");
        btnAddFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddFuncionarioActionPerformed(evt);
            }
        });

        btnAddFornecedor.setText("Adicionar Fornecedor");
        btnAddFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddFornecedorActionPerformed(evt);
            }
        });

        btnVisualizarVendas.setText("Visualizar Vendas");
        btnVisualizarVendas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVisualizarVendasActionPerformed(evt);
            }
        });

        btnVisualizarEstoque.setText("Visualizar Estoque");

        txtCliente.setText("teste Cliente");
        txtCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtClienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(169, 169, 169)
                            .addComponent(btnAddCliente))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(156, 156, 156)
                            .addComponent(btnAddFuncionario)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnAddFornecedor)
                        .addComponent(btnVisualizarVendas)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtCliente)
                            .addComponent(btnVisualizarEstoque))))
                .addContainerGap(232, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(98, 98, 98)
                .addComponent(btnAddCliente)
                .addGap(35, 35, 35)
                .addComponent(btnAddFuncionario)
                .addGap(31, 31, 31)
                .addComponent(btnAddFornecedor)
                .addGap(39, 39, 39)
                .addComponent(btnVisualizarVendas)
                .addGap(36, 36, 36)
                .addComponent(btnVisualizarEstoque)
                .addGap(37, 37, 37)
                .addComponent(txtCliente)
                .addContainerGap(71, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddClienteActionPerformed
        // TODO add your handling code here:
        JFAddCliente addCliente = new JFAddCliente();
        
        addCliente.setVisible(true);
    }//GEN-LAST:event_btnAddClienteActionPerformed

    private void btnAddFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddFuncionarioActionPerformed
        JFAddFuncionario addFuncionario = new JFAddFuncionario();
        addFuncionario.setVisible(true);
    }//GEN-LAST:event_btnAddFuncionarioActionPerformed

    private void btnAddFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddFornecedorActionPerformed
        JFAddFornecedor addFornecedor = new JFAddFornecedor();
        addFornecedor.setVisible(true);
    }//GEN-LAST:event_btnAddFornecedorActionPerformed

    private void btnVisualizarVendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVisualizarVendasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnVisualizarVendasActionPerformed

    private void txtClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtClienteActionPerformed
        // TODO add your handling code here:
         JFVenda jfvenda = new JFVenda();
        jfvenda.setVisible(true);
    }//GEN-LAST:event_txtClienteActionPerformed

    
    

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
            java.util.logging.Logger.getLogger(JFTelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFTelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFTelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFTelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFTelaInicial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddCliente;
    private javax.swing.JButton btnAddFornecedor;
    private javax.swing.JButton btnAddFuncionario;
    private javax.swing.JButton btnVisualizarEstoque;
    private javax.swing.JButton btnVisualizarVendas;
    private javax.swing.JButton txtCliente;
    // End of variables declaration//GEN-END:variables
}
