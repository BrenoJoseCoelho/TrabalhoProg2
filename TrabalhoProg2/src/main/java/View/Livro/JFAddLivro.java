package View.Livro;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */


import DAO.EstoqueDAO;
import DAO.LivroNovoListDAO;
import DAO.LivroUsadoListDAO;
import Exception.IsbnExistenteException;
import Repositorio.EstoqueRepositorio;
import Repositorio.LivroNovoRepositorio;
import Repositorio.LivroUsadoRepositorio;
import View.JFTelaInicial;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import models.Livro;
import models.LivroNovo;
import models.LivroUsado;

/**
 *
 * @author LRodrigues
 */
public class JFAddLivro extends javax.swing.JFrame {

    /**
     * Creates new form TelaAdicionarPaciente
     */
    public JFAddLivro() {
        
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        lblValorLivroNovo = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtValorLivro = new javax.swing.JTextField();
        lblEdicaoLivro = new javax.swing.JLabel();
        lblISBN = new javax.swing.JLabel();
        txtLocalEditoraLivro = new javax.swing.JTextField();
        txtAutorLivro = new javax.swing.JTextField();
        txtTituloLivro = new javax.swing.JTextField();
        txtEditoraLivro = new javax.swing.JTextField();
        txtNEdicaoLivro = new javax.swing.JTextField();
        lblAutorDoLivro = new javax.swing.JLabel();
        txtISBNLivro = new javax.swing.JTextField();
        lblTituloLivro = new javax.swing.JLabel();
        btnAddLivro = new javax.swing.JButton();
        lblEditoraLivro = new javax.swing.JLabel();
        lblCadatrarLivro = new javax.swing.JLabel();
        lblTempoUso = new javax.swing.JLabel();
        comboTempoUso = new javax.swing.JComboBox<>();
        rbLivroUsado = new javax.swing.JRadioButton();
        rbLivroNovo = new javax.swing.JRadioButton();
        lblValorLivroNovo1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setToolTipText("");
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        jPanel1.setFocusTraversalPolicyProvider(true);
        jPanel1.setInheritsPopupMenu(true);

        lblValorLivroNovo.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblValorLivroNovo.setText("Tipo de Livro");

        jLabel7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel7.setText("Local da Editora:");

        lblEdicaoLivro.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblEdicaoLivro.setText("Nº de Edição do Livro:");

        lblISBN.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblISBN.setText("ISBN do Livro:");

        lblAutorDoLivro.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblAutorDoLivro.setText("Autor do Livro:");

        lblTituloLivro.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblTituloLivro.setText("Titulo do Livro:");

        btnAddLivro.setText("Adicionar Livro");

        lblEditoraLivro.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblEditoraLivro.setText("Editora do Livro:");

        lblCadatrarLivro.setBackground(new java.awt.Color(255, 255, 255));
        lblCadatrarLivro.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblCadatrarLivro.setText("CADASTRAR LIVRO");

        lblTempoUso.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblTempoUso.setText("Tempo de Uso:");

        comboTempoUso.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Até 6 Meses", "Até 1 Ano", "Acima de 1 ano" }));
        comboTempoUso.setToolTipText("");
        comboTempoUso.setAutoscrolls(true);
        comboTempoUso.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        buttonGroup1.add(rbLivroUsado);
        rbLivroUsado.setText("Livro Usado");
        rbLivroUsado.setToolTipText("");
        rbLivroUsado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbLivroUsadoActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbLivroNovo);
        rbLivroNovo.setText("Livro Novo");
        rbLivroNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbLivroNovoActionPerformed(evt);
            }
        });

        lblValorLivroNovo1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblValorLivroNovo1.setText("Valor do Livro:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(193, 193, 193)
                        .addComponent(btnAddLivro))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCadatrarLivro)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(lblAutorDoLivro)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtAutorLivro))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(lblTituloLivro)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtTituloLivro, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(lblEditoraLivro)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtEditoraLivro, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtLocalEditoraLivro, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(lblTempoUso)
                                    .addGap(18, 18, 18)
                                    .addComponent(comboTempoUso, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(lblISBN)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtISBNLivro, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(lblEdicaoLivro)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtNEdicaoLivro, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblValorLivroNovo)
                                        .addComponent(lblValorLivroNovo1))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(rbLivroNovo)
                                            .addGap(28, 28, 28)
                                            .addComponent(rbLivroUsado))
                                        .addComponent(txtValorLivro, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(lblCadatrarLivro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAutorLivro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAutorDoLivro))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTituloLivro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTituloLivro))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblEditoraLivro)
                    .addComponent(txtEditoraLivro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7)
                    .addComponent(txtLocalEditoraLivro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblEdicaoLivro, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtNEdicaoLivro, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtISBNLivro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblISBN))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtValorLivro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblValorLivroNovo1))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbLivroNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbLivroUsado)
                    .addComponent(lblValorLivroNovo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTempoUso)
                    .addComponent(comboTempoUso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnAddLivro)
                .addGap(18, 18, 18))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rbLivroNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbLivroNovoActionPerformed
         comboTempoUso.setVisible(false);
         lblTempoUso.setVisible(false);
    }//GEN-LAST:event_rbLivroNovoActionPerformed

    private void rbLivroUsadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbLivroUsadoActionPerformed
         comboTempoUso.setVisible(true);
         lblTempoUso.setVisible(true);
    }//GEN-LAST:event_rbLivroUsadoActionPerformed
     
    public void addAcaoBotaoSalvar(ActionListener acao){
      
        btnAddLivro.addActionListener(acao);
    }

    public LivroNovo returnLivroNovo(){
        String autorLivro =  txtAutorLivro.getText();
        String tituloLivro = txtTituloLivro.getText();
        String editoraLivro = txtEditoraLivro.getText();
        String localEditora = txtLocalEditoraLivro.getText();
        String edicaoLivro = txtNEdicaoLivro.getText();
        String ISBNLivro =  txtISBNLivro.getText();
        double precoLivro =  Double.parseDouble(txtValorLivro.getText());
        Livro book = new LivroNovo(autorLivro, tituloLivro,
                localEditora, localEditora, edicaoLivro, ISBNLivro, precoLivro);     
        return (LivroNovo) book;
    }

     public LivroUsado returnLivroUsado(){
       
        String autorLivro =  txtAutorLivro.getText();
        String tituloLivro = txtTituloLivro.getText();
        String editoraLivro = txtEditoraLivro.getText();
        String localEditora = txtLocalEditoraLivro.getText();
        String edicaoLivro = txtNEdicaoLivro.getText();
        String ISBNLivro =  txtISBNLivro.getText();
        String tempoUso =(String) comboTempoUso.getSelectedItem();
        double precoLivro =  Double.parseDouble(txtValorLivro.getText()); 
        Livro book = new LivroUsado(tempoUso, autorLivro, tempoUso, localEditora, 
                tempoUso, edicaoLivro, ISBNLivro, precoLivro);
        return (LivroUsado) book;
    }
 
       public void exibirTela() {
        this.setVisible(true);
    }
       
      public void mostrarMensagem(String msg) {
        JOptionPane.showMessageDialog(null, msg);
   
    }
      
    public void fecharTela(){
        this.dispose();
    }



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddLivro;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> comboTempoUso;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblAutorDoLivro;
    private javax.swing.JLabel lblCadatrarLivro;
    private javax.swing.JLabel lblEdicaoLivro;
    private javax.swing.JLabel lblEditoraLivro;
    private javax.swing.JLabel lblISBN;
    private javax.swing.JLabel lblTempoUso;
    private javax.swing.JLabel lblTituloLivro;
    private javax.swing.JLabel lblValorLivroNovo;
    private javax.swing.JLabel lblValorLivroNovo1;
    public javax.swing.JRadioButton rbLivroNovo;
    public javax.swing.JRadioButton rbLivroUsado;
    private javax.swing.JTextField txtAutorLivro;
    private javax.swing.JTextField txtEditoraLivro;
    private javax.swing.JTextField txtISBNLivro;
    private javax.swing.JTextField txtLocalEditoraLivro;
    private javax.swing.JTextField txtNEdicaoLivro;
    private javax.swing.JTextField txtTituloLivro;
    private javax.swing.JTextField txtValorLivro;
    // End of variables declaration//GEN-END:variables
}
