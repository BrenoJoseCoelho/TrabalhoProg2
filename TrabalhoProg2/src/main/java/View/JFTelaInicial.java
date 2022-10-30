/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import java.net.URL;
import javax.swing.JFrame;
import javax.swing.SwingConstants;

/**
 *
 * @author breno
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

        jPanel1 = new javax.swing.JPanel();
        btnSair = new javax.swing.JButton();
        btnvenda = new javax.swing.JButton();
        btnFornecedor = new javax.swing.JButton();
        btnFuncionario = new javax.swing.JButton();
        btnEstoque = new javax.swing.JButton();
        btnCliente = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(600, 400));

        jPanel1.setMinimumSize(new java.awt.Dimension(500, 300));
        jPanel1.setPreferredSize(new java.awt.Dimension(500, 300));

        btnSair.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnSair.setText("SAIR");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        btnvenda.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnvenda.setText("VENDA");
        btnvenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnvendaActionPerformed(evt);
            }
        });

        btnFornecedor.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnFornecedor.setText("FORNECEDOR");
        btnFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFornecedorActionPerformed(evt);
            }
        });

        btnFuncionario.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnFuncionario.setText("FUNCIONÁRIO");
        btnFuncionario.setToolTipText("Adicionar e Lista Funcionario");
        btnFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFuncionarioActionPerformed(evt);
            }
        });

        btnEstoque.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnEstoque.setText("ESTOQUE");
        btnEstoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEstoqueActionPerformed(evt);
            }
        });

        btnCliente.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnCliente.setText("CLIENTE");
        btnCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnvenda, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(66, 66, 66)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(27, 27, 27))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnvenda, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(97, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 536, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(98, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(49, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
   
    private void btnClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClienteActionPerformed
      JFAddCliente addCliente = new JFAddCliente();
        addCliente.setVisible(true);
    }//GEN-LAST:event_btnClienteActionPerformed

    private void btnFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFuncionarioActionPerformed
         JFFuncionarioList fFuncionarioList = new JFFuncionarioList();
         fFuncionarioList.setVisible(true); 
      
    }//GEN-LAST:event_btnFuncionarioActionPerformed

    private void btnFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFornecedorActionPerformed
        JFFornecedorList fFornecedorList= new JFFornecedorList();
         fFornecedorList.setVisible(true);
    }//GEN-LAST:event_btnFornecedorActionPerformed

    private void btnvendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnvendaActionPerformed
        JFGeralVendas venda = new JFGeralVendas();
        venda.setVisible(true);
    }//GEN-LAST:event_btnvendaActionPerformed

    private void btnEstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEstoqueActionPerformed
        JFEstoque estoqueView = new JFEstoque();
                 estoqueView.setVisible(true);
    }//GEN-LAST:event_btnEstoqueActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
    this.dispose();
    }//GEN-LAST:event_btnSairActionPerformed

    /**
     * @param args the command line arguments
     */
 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCliente;
    private javax.swing.JButton btnEstoque;
    private javax.swing.JButton btnFornecedor;
    private javax.swing.JButton btnFuncionario;
    private javax.swing.JButton btnSair;
    private javax.swing.JButton btnvenda;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
