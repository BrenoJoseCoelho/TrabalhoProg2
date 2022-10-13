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
public class TelaFuncionario extends javax.swing.JFrame {

    /**
     * Creates new form TelaFuncionario
     */
    public TelaFuncionario() {
        initComponents();
        AutenticacaoLogin loginSucesso = TelaLoginLivraria.getUsuarioLogado();
        List<String> permissoes = loginSucesso.getPermissoes();
    
     if(!permissoes.contains("Realizar Venda"))
            btnRealizarVenda.setEnabled(true);
        if(!permissoes.contains("Visualizar Disponibilidade"))
            btnVerificarDisponibilidade.setEnabled(false);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnVerificarDisponibilidade = new javax.swing.JButton();
        btnRealizarVenda = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnVerificarDisponibilidade.setText("Verifcar Disponibilidade");
        btnVerificarDisponibilidade.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnVerificarDisponibilidade.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnVerificarDisponibilidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerificarDisponibilidadeActionPerformed(evt);
            }
        });

        btnRealizarVenda.setText("Realizar Venda");
        btnRealizarVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRealizarVendaActionPerformed(evt);
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
                    .addComponent(btnVerificarDisponibilidade, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(126, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addComponent(btnVerificarDisponibilidade)
                .addGap(48, 48, 48)
                .addComponent(btnRealizarVenda)
                .addContainerGap(126, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRealizarVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRealizarVendaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRealizarVendaActionPerformed

    private void btnVerificarDisponibilidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerificarDisponibilidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnVerificarDisponibilidadeActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRealizarVenda;
    private javax.swing.JButton btnVerificarDisponibilidade;
    // End of variables declaration//GEN-END:variables
}
