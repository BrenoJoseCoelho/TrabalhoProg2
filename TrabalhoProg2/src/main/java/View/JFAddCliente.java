/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import DAO.ClienteDAO;
import Exception.CampoVazioException;
import Exception.CpfIgualException;
import models.Cliente;
import Repositorio.ClienteRepositorio;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;
/**
 *
 * @author levan
 */
public class JFAddCliente extends javax.swing.JFrame {

    /**
     * Creates new form JFAddCliente
     */
    public JFAddCliente() {
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

        lblNovoCliente = new javax.swing.JLabel();
        jtfNomeCliente = new javax.swing.JTextField();
        jtfCPFCliente = new javax.swing.JTextField();
        txtNomeCliente = new javax.swing.JLabel();
        txtCPFCliente = new javax.swing.JLabel();
        btnSalvarCliente = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Adicionar Novo Cliente:");
        setMaximumSize(new java.awt.Dimension(400, 500));
        setMinimumSize(new java.awt.Dimension(400, 500));
        setPreferredSize(new java.awt.Dimension(500, 400));

        lblNovoCliente.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblNovoCliente.setText("ADICIONAR CLIENTE");

        txtNomeCliente.setText("NOME :");

        txtCPFCliente.setText("CPF :");

        btnSalvarCliente.setText("SALVAR");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(151, 151, 151)
                        .addComponent(lblNovoCliente))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(132, 132, 132)
                        .addComponent(txtNomeCliente))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(132, 132, 132)
                        .addComponent(jtfNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(132, 132, 132)
                        .addComponent(txtCPFCliente))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(132, 132, 132)
                        .addComponent(jtfCPFCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(187, 187, 187)
                        .addComponent(btnSalvarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(135, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(lblNovoCliente)
                .addGap(58, 58, 58)
                .addComponent(txtNomeCliente)
                .addGap(18, 18, 18)
                .addComponent(jtfNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(txtCPFCliente)
                .addGap(12, 12, 12)
                .addComponent(jtfCPFCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(btnSalvarCliente)
                .addContainerGap(65, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
      public void addAcaoSalvarCliente(ActionListener acao){
      btnSalvarCliente.addActionListener(acao);
      }
   
    
    public Map<String, String> getCampos(){
    
        Map<String, String> campos = new HashMap();
        campos.put("nome", jtfNomeCliente.getText());
         campos.put("CPF", jtfCPFCliente.getText());
         return campos;
    }
    
    public void limparTela(){
        jtfNomeCliente.setText("");
        jtfCPFCliente.setText("");
    }
    public void fecharTela(){
    this.dispose();
    }
       
    public void exibirTela(){
        setVisible(true);
    }
    
    public void apresentarMensagem(String msg){
        JOptionPane.showMessageDialog(null, msg);
    }
    /**
     * @param args the command line arguments
     */
 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSalvarCliente;
    private javax.swing.JTextField jtfCPFCliente;
    private javax.swing.JTextField jtfNomeCliente;
    private javax.swing.JLabel lblNovoCliente;
    private javax.swing.JLabel txtCPFCliente;
    private javax.swing.JLabel txtNomeCliente;
    // End of variables declaration//GEN-END:variables
}
