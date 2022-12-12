/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import DAO.VendaDAO;
import Repositorio.VendaRepositorio;
import java.awt.event.ActionListener;
import java.util.List;
import models.Venda;

/**
 *
 * @author breno
 */
public class JFRelatorioVenda extends javax.swing.JFrame {

    private VendaDAO vendalivro = new VendaDAO();

    /**
     * Creates new form JFRelatorioVenda
     */
    public JFRelatorioVenda() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnpesquisar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaVendas = new javax.swing.JTextArea();
        tfdatapesquisa = new javax.swing.JTextField();
        btnVendas = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        btnpesquisar.setText("Procurar por Data");

        jLabel1.setText("Data:");

        txtAreaVendas.setColumns(20);
        txtAreaVendas.setRows(5);
        jScrollPane1.setViewportView(txtAreaVendas);

        btnVendas.setText("Listar Todas Vendas");

        btnLimpar.setText("Limpar Tudo");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(btnpesquisar)
                        .addGap(31, 31, 31)
                        .addComponent(btnVendas))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 418, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(27, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tfdatapesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnLimpar)
                .addGap(19, 19, 19))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tfdatapesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLimpar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnpesquisar)
                    .addComponent(btnVendas))
                .addGap(31, 31, 31))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void adicionarAcaoBotaoLimparTela(ActionListener acao) {
        btnLimpar.addActionListener(acao);
    }

    public void adicionarAcaoBotaoListaVendas(ActionListener acao) {
        btnVendas.addActionListener(acao);
    }

    public void adicionarAcaoBotaoPesquisaData(ActionListener acao) {
        btnpesquisar.addActionListener(acao);
    }
    public void populaDadosListaVendas(List<Venda> vendas) {
        for (Venda venda : vendas) {
            txtAreaVendas.append(venda.toString() + "\n");
        }
    }
    
    public String getData(){
        return tfdatapesquisa.getText();
    }

    public void populaDadosListaVendasData(String venda) {
        txtAreaVendas.append(venda);
    }

    public void limparTela() {
        txtAreaVendas.setText("");
    }

    public void exibirTela() {
        setVisible(true);
    }
    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnVendas;
    private javax.swing.JButton btnpesquisar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField tfdatapesquisa;
    private javax.swing.JTextArea txtAreaVendas;
    // End of variables declaration//GEN-END:variables
}
