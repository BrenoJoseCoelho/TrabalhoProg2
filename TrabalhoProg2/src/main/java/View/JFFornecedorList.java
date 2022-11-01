/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import DAO.ClienteDAO;
import DAO.FornecedorDAO;
import Repositorio.ClienteRepositorio;
import Repositorio.FornecedorRepositorio;
import java.security.cert.CollectionCertStoreParameters;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import models.Cliente;
import models.Fornecedor;
import models.Funcionario;

/**
 *
 * @author LRodrigues
 */
public class JFFornecedorList extends javax.swing.JFrame {
    FornecedorRepositorio fr = new FornecedorDAO();
    /**
     * Creates new form JFFornecedorList
     */
    public JFFornecedorList() {
       
        initComponents();
         initComboFornecedor();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        txtListFornecedor = new javax.swing.JTextArea();
        btnAddFornecedor = new javax.swing.JButton();
        btnListFornecedor = new javax.swing.JButton();
        btnLimparTela = new javax.swing.JButton();
        btnRemoverFornecedor = new javax.swing.JButton();
        cbRemoverFornecedor = new javax.swing.JComboBox<>();
        btnTelaInicial = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gerenciar Funcionário");

        txtListFornecedor.setColumns(20);
        txtListFornecedor.setRows(5);
        jScrollPane1.setViewportView(txtListFornecedor);

        btnAddFornecedor.setText("Adicionar Fornecedor");
        btnAddFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddFornecedorActionPerformed(evt);
            }
        });

        btnListFornecedor.setText("Listar Fornecedor");
        btnListFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListFornecedorActionPerformed(evt);
            }
        });

        btnLimparTela.setText("Limpar Tela");
        btnLimparTela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparTelaActionPerformed(evt);
            }
        });

        btnRemoverFornecedor.setText("Remover Fornecedor");
        btnRemoverFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoverFornecedorActionPerformed(evt);
            }
        });

        initComboFornecedor();

        btnTelaInicial.setText("Tela Inicial");
        btnTelaInicial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTelaInicialActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAddFornecedor, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
                    .addComponent(btnListFornecedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnLimparTela, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnRemoverFornecedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbRemoverFornecedor, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 443, Short.MAX_VALUE))
                .addGap(25, 25, 25))
            .addGroup(layout.createSequentialGroup()
                .addGap(254, 254, 254)
                .addComponent(btnTelaInicial)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAddFornecedor)
                        .addGap(18, 18, 18)
                        .addComponent(btnListFornecedor)
                        .addGap(18, 18, 18)
                        .addComponent(btnLimparTela))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRemoverFornecedor)
                    .addComponent(cbRemoverFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addComponent(btnTelaInicial)
                .addGap(34, 34, 34))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddFornecedorActionPerformed
        JFAddFornecedor addFornecedor = new JFAddFornecedor();
        addFornecedor.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnAddFornecedorActionPerformed

    private void btnTelaInicialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTelaInicialActionPerformed
        JFTelaInicial fTelaInicial = new JFTelaInicial();
        fTelaInicial.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnTelaInicialActionPerformed

    private void btnListFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListFornecedorActionPerformed
       FornecedorRepositorio fornecedorRepositorio = new FornecedorDAO();
       
          for(Fornecedor fornecedor : fornecedorRepositorio.buscarTodosFornecedores()){
              txtListFornecedor.append(fornecedor.toString()+"\n");
       }
    }//GEN-LAST:event_btnListFornecedorActionPerformed

    private void btnLimparTelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparTelaActionPerformed
      txtListFornecedor.setText("");
    }//GEN-LAST:event_btnLimparTelaActionPerformed

    private void btnRemoverFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverFornecedorActionPerformed
      
      FornecedorRepositorio fornecedorRepositorio = new FornecedorDAO();
      Fornecedor fornecedor = new Fornecedor();
      fornecedor = (Fornecedor) cbRemoverFornecedor.getSelectedItem();
      fornecedorRepositorio.removerFornecedor(fornecedor);
      JFFornecedorList fFornecedorList = new JFFornecedorList();
      fFornecedorList.setVisible(true);
      this.dispose();
    }//GEN-LAST:event_btnRemoverFornecedorActionPerformed
    
    public void initComboFornecedor(){
       Set<Fornecedor> fornecedores = fr.buscarTodosFornecedores();
        for(Fornecedor forne : fornecedores ){   
        cbRemoverFornecedor.addItem(forne);
        
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddFornecedor;
    private javax.swing.JButton btnLimparTela;
    private javax.swing.JButton btnListFornecedor;
    private javax.swing.JButton btnRemoverFornecedor;
    private javax.swing.JButton btnTelaInicial;
    private javax.swing.JComboBox<Fornecedor> cbRemoverFornecedor;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtListFornecedor;
    // End of variables declaration//GEN-END:variables
}
