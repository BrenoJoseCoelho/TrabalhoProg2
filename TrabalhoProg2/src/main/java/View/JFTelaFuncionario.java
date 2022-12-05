/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import java.util.List;
import models.AutenticacaoLogin;

/**
 *
 * @author LRodrigues
 */
public class JFTelaFuncionario extends javax.swing.JFrame {

    /**
     * Creates new form TelaFuncionario
     */
    public JFTelaFuncionario() {
        initComponents();
        AutenticacaoLogin loginSucesso = JFTelaLoginLivraria.getUsuarioLogado();
//        List<String> permissoes = loginSucesso.getPermissoes();
//    
//     if(!permissoes.contains("Realizar Venda"))
//            btnRealizarVenda.setEnabled(true);
//        if(!permissoes.contains("Visualizar Disponibilidade"))
//            btnVerificarEstoque.setEnabled(true);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnVerificarEstoque = new javax.swing.JButton();
        btnAddCliente = new javax.swing.JButton();
        btnAddFuncionario = new javax.swing.JButton();
        btnVisualizarVendas = new javax.swing.JButton();
        btnVisualizarVendas1 = new javax.swing.JButton();
        btnAddFornecedor = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnVerificarEstoque.setText("Verifcar Estoque");
        btnVerificarEstoque.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnVerificarEstoque.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnVerificarEstoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerificarEstoqueActionPerformed(evt);
            }
        });

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

        btnVisualizarVendas.setText("Visualizar Vendas");
        btnVisualizarVendas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVisualizarVendasActionPerformed(evt);
            }
        });

        btnVisualizarVendas1.setText("Vendas");
        btnVisualizarVendas1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVisualizarVendas1ActionPerformed(evt);
            }
        });

        btnAddFornecedor.setText("Adicionar Fornecedor");
        btnAddFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddFornecedorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnVisualizarVendas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAddFuncionario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnVerificarEstoque, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnVisualizarVendas1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAddCliente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAddFornecedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(54, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(btnAddFuncionario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnVerificarEstoque)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnVisualizarVendas1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAddCliente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnVisualizarVendas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAddFornecedor)
                .addContainerGap(54, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVerificarEstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerificarEstoqueActionPerformed
          JFEstoque estoqueView = new JFEstoque();
           estoqueView.setVisible(true);
           this.dispose();
    }//GEN-LAST:event_btnVerificarEstoqueActionPerformed

    private void btnVisualizarVendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVisualizarVendasActionPerformed
        JFVenda vendaView = new JFVenda();
        vendaView.setVisible(true);
         this.dispose();
    }//GEN-LAST:event_btnVisualizarVendasActionPerformed

    private void btnVisualizarVendas1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVisualizarVendas1ActionPerformed
        JFGeralVendas venda = new JFGeralVendas();
        venda.setVisible(true);
            this.dispose();
    }//GEN-LAST:event_btnVisualizarVendas1ActionPerformed

    private void btnAddClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddClienteActionPerformed

        JFAddCliente addCliente = new JFAddCliente();
        addCliente.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnAddClienteActionPerformed

    private void btnAddFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddFornecedorActionPerformed
      JFAddFornecedor addFornecedor = new JFAddFornecedor();
      addFornecedor.setVisible(true);
      this.dispose();
    }//GEN-LAST:event_btnAddFornecedorActionPerformed

    private void btnAddFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddFuncionarioActionPerformed
        JFAddFuncionario addFuncionario = new JFAddFuncionario();
        addFuncionario.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnAddFuncionarioActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddCliente;
    private javax.swing.JButton btnAddFornecedor;
    private javax.swing.JButton btnAddFuncionario;
    private javax.swing.JButton btnVerificarEstoque;
    private javax.swing.JButton btnVisualizarVendas;
    private javax.swing.JButton btnVisualizarVendas1;
    // End of variables declaration//GEN-END:variables
}
