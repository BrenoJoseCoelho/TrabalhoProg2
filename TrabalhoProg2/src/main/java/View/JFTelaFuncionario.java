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
        List<String> permissoes = loginSucesso.getPermissoes();
    
     if(!permissoes.contains("Realizar Venda"))
            btnRealizarVenda.setEnabled(true);
        if(!permissoes.contains("Visualizar Disponibilidade"))
            btnVerificarEstoque.setEnabled(true);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnAddCliente = new javax.swing.JButton();
        btnAddFornecedor = new javax.swing.JButton();
        btnVerificarEstoque = new javax.swing.JButton();
        btnRealizarVenda = new javax.swing.JButton();
        btnAddCliente1 = new javax.swing.JButton();
        btnAddFuncionario = new javax.swing.JButton();
        btnAddFornecedor1 = new javax.swing.JButton();
        btnVisualizarVendas = new javax.swing.JButton();

        btnAddCliente.setText("Adicionar Cliente");
        btnAddCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddClienteActionPerformed(evt);
            }
        });

        btnAddFornecedor.setText("Adicionar Fornecedor");
        btnAddFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddFornecedorActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnVerificarEstoque.setText("Verifcar Estoque");
        btnVerificarEstoque.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnVerificarEstoque.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnVerificarEstoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerificarEstoqueActionPerformed(evt);
            }
        });

        btnRealizarVenda.setText("Realizar Venda");
        btnRealizarVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRealizarVendaActionPerformed(evt);
            }
        });

        btnAddCliente1.setText("Adicionar Cliente");
        btnAddCliente1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddCliente1ActionPerformed(evt);
            }
        });

        btnAddFuncionario.setText("Adicionar Funcionário");
        btnAddFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddFuncionarioActionPerformed(evt);
            }
        });

        btnAddFornecedor1.setText("Adicionar Fornecedor");
        btnAddFornecedor1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddFornecedor1ActionPerformed(evt);
            }
        });

        btnVisualizarVendas.setText("Visualizar Vendas");
        btnVisualizarVendas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVisualizarVendasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(119, 119, 119)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnRealizarVenda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnVerificarEstoque, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAddCliente1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAddFuncionario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnVisualizarVendas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(134, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(118, 118, 118)
                    .addComponent(btnAddFornecedor1)
                    .addContainerGap(138, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(btnAddFuncionario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnVerificarEstoque)
                .addGap(36, 36, 36)
                .addComponent(btnRealizarVenda)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAddCliente1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnVisualizarVendas)
                .addContainerGap(33, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(123, 123, 123)
                    .addComponent(btnAddFornecedor1)
                    .addContainerGap(124, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRealizarVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRealizarVendaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRealizarVendaActionPerformed

    private void btnVerificarEstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerificarEstoqueActionPerformed
          JFEstoque estoqueView = new JFEstoque();
           estoqueView.setVisible(true);
           this.dispose();
    }//GEN-LAST:event_btnVerificarEstoqueActionPerformed

    private void btnAddClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddClienteActionPerformed
        // TODO add your handling code here:
        JFAddCliente addCliente = new JFAddCliente();

        addCliente.setVisible(true);
         this.dispose();
    }//GEN-LAST:event_btnAddClienteActionPerformed

    private void btnAddCliente1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddCliente1ActionPerformed
        // TODO add your handling code here:
        JFAddCliente addCliente = new JFAddCliente();

        addCliente.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnAddCliente1ActionPerformed

    private void btnAddFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddFuncionarioActionPerformed
        JFAddFuncionario addFuncionario = new JFAddFuncionario();
        addFuncionario.setVisible(true);
         this.dispose();
    }//GEN-LAST:event_btnAddFuncionarioActionPerformed

    private void btnAddFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddFornecedorActionPerformed
        JFAddFornecedor addFornecedor = new JFAddFornecedor();
        addFornecedor.setVisible(true);
        
         this.dispose();
    }//GEN-LAST:event_btnAddFornecedorActionPerformed

    private void btnAddFornecedor1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddFornecedor1ActionPerformed
        JFAddFornecedor addFornecedor = new JFAddFornecedor();
        addFornecedor.setVisible(true);
         this.dispose();
    }//GEN-LAST:event_btnAddFornecedor1ActionPerformed

    private void btnVisualizarVendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVisualizarVendasActionPerformed
        JFVenda vendaView = new JFVenda();
        vendaView.setVisible(true);
    }//GEN-LAST:event_btnVisualizarVendasActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddCliente;
    private javax.swing.JButton btnAddCliente1;
    private javax.swing.JButton btnAddFornecedor;
    private javax.swing.JButton btnAddFornecedor1;
    private javax.swing.JButton btnAddFuncionario;
    private javax.swing.JButton btnRealizarVenda;
    private javax.swing.JButton btnVerificarEstoque;
    private javax.swing.JButton btnVisualizarVendas;
    // End of variables declaration//GEN-END:variables
}
