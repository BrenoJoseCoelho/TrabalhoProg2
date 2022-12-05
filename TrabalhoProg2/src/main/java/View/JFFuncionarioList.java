/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import DAO.ClienteDAO;
import DAO.FuncionarioDAO;
import Repositorio.ClienteRepositorio;
import Repositorio.FuncionarioRepositorio;
import java.util.Comparator;
import java.util.List;
import models.Cliente;
import models.Funcionario;
import models.LivroNovo;
import models.LivroUsado;

/**
 *
 * @author LRodrigues
 */
public class JFFuncionarioList extends javax.swing.JFrame {
    FuncionarioRepositorio fr = new FuncionarioDAO();
    /**
     * Creates new form JFListFuncionario
     */
    public JFFuncionarioList() {
        initComponents();
        initComboFuncionario();
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
        txtAreaFuncionarios = new javax.swing.JTextArea();
        btnListFuncionario = new javax.swing.JButton();
        btnRemoverFunc = new javax.swing.JButton();
        cbRemoverFunc = new javax.swing.JComboBox<>();
        btnLimparTela = new javax.swing.JButton();
        btnAddFuncionario = new javax.swing.JButton();
        btnTelaInicial = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        txtAreaFuncionarios.setColumns(20);
        txtAreaFuncionarios.setRows(5);
        jScrollPane1.setViewportView(txtAreaFuncionarios);

        btnListFuncionario.setText("Listar Funcionario");
        btnListFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListFuncionarioActionPerformed(evt);
            }
        });

        btnRemoverFunc.setText("Remover Funcionário");
        btnRemoverFunc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoverFuncActionPerformed(evt);
            }
        });

        btnLimparTela.setText("Limpar Tela");
        btnLimparTela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparTelaActionPerformed(evt);
            }
        });

        btnAddFuncionario.setText("Adicionar Funcionário");
        btnAddFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddFuncionarioActionPerformed(evt);
            }
        });

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
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnListFuncionario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnRemoverFunc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnLimparTela, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAddFuncionario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 390, Short.MAX_VALUE)
                    .addComponent(cbRemoverFunc, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(20, 20, 20))
            .addGroup(layout.createSequentialGroup()
                .addGap(265, 265, 265)
                .addComponent(btnTelaInicial)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAddFuncionario)
                        .addGap(18, 18, 18)
                        .addComponent(btnListFuncionario)
                        .addGap(18, 18, 18)
                        .addComponent(btnLimparTela))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbRemoverFunc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRemoverFunc))
                .addGap(26, 26, 26)
                .addComponent(btnTelaInicial)
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddFuncionarioActionPerformed
       JFAddFuncionario addFuncionario = new JFAddFuncionario();
        addFuncionario.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnAddFuncionarioActionPerformed

    private void btnTelaInicialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTelaInicialActionPerformed
        JFTelaInicial fTelaInicial = new JFTelaInicial();
        fTelaInicial.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnTelaInicialActionPerformed

    private void btnListFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListFuncionarioActionPerformed
      FuncionarioRepositorio fr = new FuncionarioDAO();
      
      fr.getTodosFuncionarios().sort((new Comparator<Funcionario>() {
          @Override
          public int compare(Funcionario o1, Funcionario o2) {
              return o1.getNome().compareTo(o2.getNome());
          }
      }));
      for(Funcionario funcionario : fr.getTodosFuncionarios()){
          txtAreaFuncionarios.append(funcionario.toString()+"\n");
          
      }
    }//GEN-LAST:event_btnListFuncionarioActionPerformed

    private void btnLimparTelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparTelaActionPerformed
       txtAreaFuncionarios.setText("");
    }//GEN-LAST:event_btnLimparTelaActionPerformed

    private void btnRemoverFuncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverFuncActionPerformed
      FuncionarioRepositorio funcionarioRepositorio = new FuncionarioDAO();
      Funcionario f = new Funcionario();       
      f = (Funcionario) cbRemoverFunc.getSelectedItem();
      funcionarioRepositorio.removerFuncionario(f);
      JFFuncionarioList fFuncionarioList = new JFFuncionarioList();
      fFuncionarioList.setVisible(true);
       this.dispose();
 
    }//GEN-LAST:event_btnRemoverFuncActionPerformed
    
    /**
     * @param args the command line arguments
     */
    

    public void initComboFuncionario(){
        List<Funcionario> funcionarios = fr.getTodosFuncionarios();
        for(Funcionario f : funcionarios ){   
            cbRemoverFunc.addItem(f);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddFuncionario;
    private javax.swing.JButton btnLimparTela;
    private javax.swing.JButton btnListFuncionario;
    private javax.swing.JButton btnRemoverFunc;
    private javax.swing.JButton btnTelaInicial;
    private javax.swing.JComboBox<Funcionario> cbRemoverFunc;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtAreaFuncionarios;
    // End of variables declaration//GEN-END:variables
}