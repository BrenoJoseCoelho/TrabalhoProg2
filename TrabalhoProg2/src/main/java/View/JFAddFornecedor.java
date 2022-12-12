/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import Repositorio.FornecedorRepositorio;
import DAO.FornecedorDAO;
import Exception.CpfIgualException;
import java.awt.event.ActionListener;
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

        txtEmpresa.setText("Empresa:");

        txtNomeFOrnecedor.setText("Nome Fornecedor:");

        txtCNPJFornecedor.setText("CNPJ:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("Adicionar Novo Fornecedor:");

        btnSalvarFornecedor.setText("Salvar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                        .addGap(81, 81, 81)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(153, 153, 153)
                        .addComponent(btnSalvarFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(80, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel4)
                .addGap(41, 41, 41)
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
                .addGap(37, 37, 37)
                .addComponent(btnSalvarFornecedor)
                .addContainerGap(50, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void adicionarAcaoBtnSalvarFornecedor(ActionListener acao) {
        btnSalvarFornecedor.addActionListener(acao);
    }

    public String getNome() {
        return jtfNomeFornecedor.getText();
    }

    public String getEmpresa() {
        return jtfEmpresa.getText();
    }

    public String getCNPJ() {
        return jtfCNPJfornecedor.getText();
    }

    public void exibirTela() {
        setVisible(true);
    }

    public void limparTela() {
        jtfCNPJfornecedor.setText("");
        jtfEmpresa.setText("");
        jtfNomeFornecedor.setText("");
    }

    public void fecharTela() {
        this.dispose();
    }

    public void exibirMensagem(String msg) {
        JOptionPane.showMessageDialog(null, msg);
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
