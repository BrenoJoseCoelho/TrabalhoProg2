/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import DAO.ClienteDAO;
import DAO.FornecedorDAO;
import Repositorio.ClienteRepositorio;
import Repositorio.FornecedorRepositorio;
import java.awt.event.ActionListener;
import java.security.cert.CollectionCertStoreParameters;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import javax.swing.JButton;
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
        cbRemoverFornecedor = new javax.swing.JComboBox<>();
        btnAddFornecedor = new javax.swing.JButton();
        btnListFornecedor = new javax.swing.JButton();
        btnLimparTela = new javax.swing.JButton();
        btnRemoverFornecedor = new javax.swing.JButton();
        btnPaginaInicial = new javax.swing.JButton();
        btnCadastroFornecedor = new javax.swing.JButton();
        btnListaFornecedor = new javax.swing.JButton();
        btnLimparTela = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gerenciar Funcionário");

        txtListFornecedor.setColumns(20);
        txtListFornecedor.setRows(5);
        jScrollPane1.setViewportView(txtListFornecedor);

        btnRemoverFornecedor.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnRemoverFornecedor.setText("REMOVER FORNECEDOR");
        btnRemoverFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoverFornecedorActionPerformed(evt);
            }
        });

        initComboFornecedor();

        btnAddFornecedor.setText("Cadastrar Fornecedor");

        btnListFornecedor.setText("Listar Fornecedores");

        btnLimparTela.setText("Limpar Tela");

        btnRemoverFornecedor.setText("Remover Fornecedor");

        btnPaginaInicial.setText("Pagina Inicial");

        btnCadastroFornecedor.setText("Cadastrar Fornecedor");

        btnListaFornecedor.setText("Listar Fornecedores");

        btnLimparTela.setText("Limpar Tela");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btnAddFornecedor, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
                        .addComponent(btnListFornecedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnLimparTela, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(btnRemoverFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnRemoverFornecedor, javax.swing.GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE)
                    .addComponent(btnCadastroFornecedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnListaFornecedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnLimparTela, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbRemoverFornecedor, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 399, Short.MAX_VALUE))
                .addGap(25, 25, 25))
            .addGroup(layout.createSequentialGroup()
                .addGap(248, 248, 248)
                .addComponent(btnPaginaInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(btnAddFornecedor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnListFornecedor)
                        .addGap(5, 5, 5)
                        .addComponent(btnCadastroFornecedor)
                        .addGap(17, 17, 17)
                        .addComponent(btnListaFornecedor)
                        .addGap(18, 18, 18)
                        .addComponent(btnLimparTela)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbRemoverFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRemoverFornecedor))
                .addGap(42, 42, 42)
                .addComponent(btnPaginaInicial)
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    public void adicionarAcaoBtnAddFornecedor(ActionListener acao) {
   //     btnAddFornecedor.addActionListener(acao);
    }

    public void adicionarAcaobtnListFornecedor(ActionListener acao) {
     //   btnListFornecedor.addActionListener(acao);
    }

    public void adicionarAcaobtnLimparTela(ActionListener acao) {
        btnLimparTela.addActionListener(acao);
    }
    
    public void adicionarAcaobtnRemoverFornecedor(ActionListener acao) {
        btnRemoverFornecedor.addActionListener(acao);
    }
    
    public void adicionarAcaobtnPaginaInicial(ActionListener acao) {
        btnPaginaInicial.addActionListener(acao);
    }
    

    public void limparTela() {
        txtListFornecedor.setText("");
    }

    public void populaDadosListaFornecedor(Set<Fornecedor> fornecedores) {
        for (Fornecedor fornecedor : fornecedores) {
            txtListFornecedor.append(fornecedor.toString() + "\n");
        }
    }

    
   

    
    public void exibirTela(){
        setVisible(true);
    }

    
    private void btnRemoverFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverFornecedorActionPerformed
      
      FornecedorRepositorio fornecedorRepositorio = new FornecedorDAO();
      Fornecedor fornecedor = new Fornecedor();
      fornecedor = (Fornecedor) cbRemoverFornecedor.getSelectedItem();
      fornecedorRepositorio.removerFornecedor(fornecedor);
      JFFornecedorList fFornecedorList = new JFFornecedorList();
      fFornecedorList.setVisible(true);
      this.dispose();
    }//GEN-LAST:event_btnRemoverFornecedorActionPerformed

    private void btnPaginaInicialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPaginaInicialActionPerformed
        JFTelaInicial fTelaInicial = new JFTelaInicial();
        fTelaInicial.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnPaginaInicialActionPerformed

    
    public void initComboFornecedor() {
        Set<Fornecedor> fornecedores = fr.buscarTodosFornecedores();
        for (Fornecedor forne : fornecedores) {
            cbRemoverFornecedor.addItem(forne);

        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastroFornecedor;
    private javax.swing.JButton btnLimparTela;
    private javax.swing.JButton btnListaFornecedor;
    private javax.swing.JButton btnPaginaInicial;
    private javax.swing.JButton btnRemoverFornecedor;
    private javax.swing.JComboBox<Fornecedor> cbRemoverFornecedor;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtListFornecedor;
    // End of variables declaration//GEN-END:variables
}
