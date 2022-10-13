/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import DAO.LivroUsadoListDAO;
import Repositorio.LivroUsadoRepositorio;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import models.Livro;
import models.LivroUsado;

/**
 *
 * @author LRodrigues
 */
public class TelaAdicionarLivroUsado extends javax.swing.JFrame {

    /**
     * Creates new form TelaAdicionarPaciente
     */
    public TelaAdicionarLivroUsado() {
        
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtLocalEditoraLivro = new javax.swing.JTextField();
        txtAutorLivro = new javax.swing.JTextField();
        txtTituloLivro = new javax.swing.JTextField();
        txtEditoraLivro = new javax.swing.JTextField();
        txtNEdicaoLivro = new javax.swing.JTextField();
        txtISBNLivro = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jComboBoxTempo = new javax.swing.JComboBox<>();
        lblValorLivroUsado = new javax.swing.JLabel();
        txtISBNLivro1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Autor do Livro:");

        jLabel2.setText("Titulo do Livro:");

        jLabel3.setText("Editora do Livro:");

        jLabel4.setText("Local da Editora:");

        jLabel5.setText("Numero de Edição do Livro:");

        jLabel6.setText("ISBN do Livro:");

        txtLocalEditoraLivro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLocalEditoraLivroActionPerformed(evt);
            }
        });

        txtAutorLivro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAutorLivroActionPerformed(evt);
            }
        });

        txtTituloLivro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTituloLivroActionPerformed(evt);
            }
        });

        txtEditoraLivro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEditoraLivroActionPerformed(evt);
            }
        });

        txtNEdicaoLivro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNEdicaoLivroActionPerformed(evt);
            }
        });

        txtISBNLivro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtISBNLivroActionPerformed(evt);
            }
        });

        jButton1.setText("Adicionar Livro");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel7.setText("Tempo de Uso do Livro:");

        jComboBoxTempo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<Selecione uma da opções>", "Até 6 meses", "Até 1 ano", "Até 2 anos", " " }));
        jComboBoxTempo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxTempoActionPerformed(evt);
            }
        });

        lblValorLivroUsado.setText("Valor do Livro:");

        txtISBNLivro1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtISBNLivro1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(144, 144, 144)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtISBNLivro1, javax.swing.GroupLayout.DEFAULT_SIZE, 326, Short.MAX_VALUE)
                                .addComponent(lblValorLivroUsado))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel7)
                                .addComponent(txtISBNLivro, javax.swing.GroupLayout.DEFAULT_SIZE, 326, Short.MAX_VALUE)
                                .addComponent(txtNEdicaoLivro, javax.swing.GroupLayout.DEFAULT_SIZE, 326, Short.MAX_VALUE)
                                .addComponent(txtEditoraLivro, javax.swing.GroupLayout.DEFAULT_SIZE, 326, Short.MAX_VALUE)
                                .addComponent(txtTituloLivro, javax.swing.GroupLayout.DEFAULT_SIZE, 326, Short.MAX_VALUE)
                                .addComponent(jLabel4)
                                .addComponent(jLabel6)
                                .addComponent(jLabel3)
                                .addComponent(jLabel1)
                                .addComponent(jLabel2)
                                .addComponent(txtLocalEditoraLivro)
                                .addComponent(txtAutorLivro, javax.swing.GroupLayout.DEFAULT_SIZE, 326, Short.MAX_VALUE)
                                .addComponent(jLabel5)
                                .addComponent(jComboBoxTempo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap(67, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtAutorLivro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtTituloLivro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtEditoraLivro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtLocalEditoraLivro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNEdicaoLivro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtISBNLivro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jComboBoxTempo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblValorLivroUsado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtISBNLivro1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(30, 30, 30))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtLocalEditoraLivroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLocalEditoraLivroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLocalEditoraLivroActionPerformed

    private void txtAutorLivroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAutorLivroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAutorLivroActionPerformed

    private void txtTituloLivroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTituloLivroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTituloLivroActionPerformed

    private void txtEditoraLivroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEditoraLivroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEditoraLivroActionPerformed

    private void txtNEdicaoLivroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNEdicaoLivroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNEdicaoLivroActionPerformed

    private void txtISBNLivroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtISBNLivroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtISBNLivroActionPerformed
  
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       verificandoOpcaoInvalidaCombo();
    }//GEN-LAST:event_jButton1ActionPerformed
   
      private LivroUsado tempo;
    private void jComboBoxTempoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxTempoActionPerformed
     jComboBoxTempo.addItem(tempo.getTempoUso());
        
    }//GEN-LAST:event_jComboBoxTempoActionPerformed

    private void txtISBNLivro1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtISBNLivro1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtISBNLivro1ActionPerformed
    public void verificandoOpcaoInvalidaCombo(){
        if(jComboBoxTempo.getSelectedItem().equals("<Selecione uma da opções>")){
            JOptionPane.showMessageDialog(null,"OPÇÃO INVÁLIDA, SELECIONE UM TEMPO DE USO VÁLIDO!", null, WIDTH );
        }else{
            JOptionPane.showMessageDialog(null,"OPÇÃO VÁLIDA", null, WIDTH );
        }
            
    }
    /**
     * @param args the command line arguments
     */
    
      public void mostrarMensagem(String msg) {
        JOptionPane.showMessageDialog(null, msg);
    }
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaAdicionarLivroUsado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaAdicionarLivroUsado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaAdicionarLivroUsado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaAdicionarLivroUsado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaAdicionarLivroUsado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBoxTempo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel lblValorLivroUsado;
    private javax.swing.JTextField txtAutorLivro;
    private javax.swing.JTextField txtEditoraLivro;
    private javax.swing.JTextField txtISBNLivro;
    private javax.swing.JTextField txtISBNLivro1;
    private javax.swing.JTextField txtLocalEditoraLivro;
    private javax.swing.JTextField txtNEdicaoLivro;
    private javax.swing.JTextField txtTituloLivro;
    // End of variables declaration//GEN-END:variables
}
