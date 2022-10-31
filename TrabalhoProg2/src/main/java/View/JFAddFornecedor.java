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

        txtEmpresa.setText("Empresa:");

        txtNomeFOrnecedor.setText("Nome Fornecedor:");

        txtCNPJFornecedor.setText("CNPJ:");

        jtfNomeFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfNomeFornecedorActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("Adicionar Novo Fornecedor:");

        btnSalvarFornecedor.setText("Salvar");
        btnSalvarFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarFornecedorActionPerformed(evt);
            }
        });

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
                        .addGap(158, 158, 158)
                        .addComponent(btnSalvarFornecedor)))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addComponent(btnSalvarFornecedor)
                .addGap(41, 41, 41))
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
        
       apresentarMensagem("Fornecedor cadastrado com sucesso!");
        
     
       JFFornecedorList fFornecedorList = new JFFornecedorList();
       fFornecedorList.setVisible(true);
       limparTela();
       this.dispose();
      
//       JFTelaInicial fTelaInicial = new JFTelaInicial();
//       fTelaInicial.setVisible(true);
        
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
