/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import DAO.ClienteDAO;
import Repositorio.ClienteRepositorio;
import java.awt.event.ActionListener;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import models.Cliente;
import models.Funcionario;

/**
 *
 * @author LRodrigues
 */
public class JFClienteList extends javax.swing.JFrame {
        ClienteRepositorio cr = new ClienteDAO();
    /**
     * Creates new form JFFornecedorList
     */
    public JFClienteList() {
        initComponents();
        initComboCliente();
        
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

        btnListClientes.setText("Listar Clientes");

        btnLimparTela.setText("Limpar Tela");

        btnRemoverCliente.setText("Remover Cliente");

        btnTelaInicial.setText("Tela Inicial");

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
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 462, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cbRemoverCliente, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(25, 25, 25))))
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
    public void acaoAddCliente(ActionListener actionListener){
        btnAddCliente.addActionListener(actionListener);
        
    }    public void listarCliente(){ 
          ClienteRepositorio clienteRepositorio = new ClienteDAO();
       Collections.sort(clienteRepositorio.buscarTodosClientes());
       for(Cliente c : clienteRepositorio.buscarTodosClientes()){
          txtListCientes.append(c.toString()+"\n");       
       }
    }
    
    public void acaoListCliente(ActionListener actionListener){
        btnListClientes.addActionListener(actionListener);
        
    }    public void limparTela(){
     txtListCientes.setText("");
    }
    
    public void acaoLimparTela(ActionListener acao){
        btnLimparTela.addActionListener(acao);
                
    }    public void acaoAcessarTelaInicial(ActionListener acao){
         btnTelaInicial.addActionListener(acao);
    }
    public void acaoRemoverCliente(ActionListener acao){
        btnRemoverCliente.addActionListener(acao);
                
    }        public void removerCliente(){
         ClienteRepositorio clienteRepositorio = new ClienteDAO();
         Cliente c = new Cliente();
         c = (Cliente) cbRemoverCliente.getSelectedItem();
         clienteRepositorio.removeCliente(c);
        }
    
    
       public void initComboCliente(){
        List<Cliente> cliente = cr.buscarTodosClientes();
        for(Cliente c : cliente ){   
        cbRemoverCliente.addItem(c);
        }
    }
       
       public void exibirTela(){
           this.setVisible(true);
       }
       public void fecharTela(){
           this.dispose();
       }
               

    
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
