/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import DAO.ClienteDAO;
import Repositorio.ClienteRepositorio;
import java.util.Comparator;
import models.Cliente;

/**
 *
 * @author LRodrigues
 */
public class JFClienteList extends javax.swing.JFrame {

    /**
     * Creates new form JFFornecedorList
     */
    public JFClienteList() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        txtListCientes = new javax.swing.JTextArea();
        btnAddCliente = new javax.swing.JButton();
        btnListClientes = new javax.swing.JButton();
        btnLimparTela = new javax.swing.JButton();
        btnRemoverCliente = new javax.swing.JButton();
        cbRemoverCliente = new javax.swing.JComboBox<>();
        btnTelaInicial = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("GERENCIAS CLIENTES");

        txtListCientes.setColumns(20);
        txtListCientes.setRows(5);
        jScrollPane1.setViewportView(txtListCientes);

        btnAddCliente.setText("Adicionar Cliente");
        btnAddCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddClienteActionPerformed(evt);
            }
        });

        btnListClientes.setText("Listar Clientes");
        btnListClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListClientesActionPerformed(evt);
            }
        });

        btnLimparTela.setText("Limpar Tela");
        btnLimparTela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparTelaActionPerformed(evt);
            }
        });

        btnRemoverCliente.setText("Remover Cliente");

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
                    .addComponent(btnAddCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnListClientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnLimparTela, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnRemoverCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addComponent(cbRemoverCliente, 0, 367, Short.MAX_VALUE)
                        .addGap(25, 25, 25))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 462, Short.MAX_VALUE)
                        .addContainerGap())))
            .addGroup(layout.createSequentialGroup()
                .addGap(267, 267, 267)
                .addComponent(btnTelaInicial)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAddCliente)
                        .addGap(18, 18, 18)
                        .addComponent(btnListClientes)
                        .addGap(18, 18, 18)
                        .addComponent(btnLimparTela))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRemoverCliente)
                    .addComponent(cbRemoverCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addComponent(btnTelaInicial)
                .addGap(27, 27, 27))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddClienteActionPerformed
        JFAddCliente addCliente = new JFAddCliente();
        addCliente.setVisible(true);
    }//GEN-LAST:event_btnAddClienteActionPerformed

    private void btnListClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListClientesActionPerformed
       ClienteRepositorio clienteRepositorio = new ClienteDAO();
       clienteRepositorio.buscarTodosClientes().sort((new Comparator<Cliente>(){
           @Override
           public int compare(Cliente o1, Cliente o2) {
               
               return o1.getNome().compareTo(o2.getNome());              
           }         
       }));
       for(Cliente c : clienteRepositorio.buscarTodosClientes()){
          txtListCientes.append(c.toString()+"\n");       
       }
    }//GEN-LAST:event_btnListClientesActionPerformed

    private void btnLimparTelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparTelaActionPerformed
        txtListCientes.setText("");
    }//GEN-LAST:event_btnLimparTelaActionPerformed

    private void btnTelaInicialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTelaInicialActionPerformed
        JFTelaInicial fTelaInicial = new JFTelaInicial();
        fTelaInicial.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnTelaInicialActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddCliente;
    private javax.swing.JButton btnLimparTela;
    private javax.swing.JButton btnListClientes;
    private javax.swing.JButton btnRemoverCliente;
    private javax.swing.JButton btnTelaInicial;
    private javax.swing.JComboBox<Cliente> cbRemoverCliente;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtListCientes;
    // End of variables declaration//GEN-END:variables
}
