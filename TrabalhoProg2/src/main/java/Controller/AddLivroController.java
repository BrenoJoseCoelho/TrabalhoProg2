/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import DAO.EstoqueDAO;
import DAO.LivroNovoListDAO;
import DAO.LivroUsadoListDAO;
import Exception.IsbnExistenteException;
import Repositorio.EstoqueRepositorio;
import Repositorio.LivroNovoRepositorio;
import Repositorio.LivroUsadoRepositorio;
import View.Livro.JFAddLivro;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import models.Livro;
import models.LivroNovo;
import models.LivroUsado;

/**
 *
 * @author LRodrigues
 */
public class AddLivroController {
    private LivroNovo livroNovo;
    private LivroUsado livroUsado;
    private JFAddLivro addLivro;

    public AddLivroController( JFAddLivro addLivro) {
        this.livroNovo = livroNovo;
        this.livroUsado = livroUsado;
    
        this.addLivro = addLivro;
        addActionButton();
        exibirTela();
    }
    
    public void addActionButton(){
        actionAdd();
    }
    
     public void exibirTela(){
     addLivro.exibirTela();
    }
    
     public void addLivroUsado() throws IsbnExistenteException{
          EstoqueRepositorio estoquerepositorio = new EstoqueDAO();
          LivroUsadoRepositorio livroUsadoRepositorio = new LivroUsadoListDAO();
        LivroUsado livroUsado = addLivro.returnLivroUsado();
        livroUsadoRepositorio.addLivroUsado(livroUsado);
        estoquerepositorio.addEstoqueUsado(livroUsado);
        
        mostraMsg("Adicionado Livro Usado com Sucesso! ");
        fecharTela();
         
    }
     
     
     public void addLivroNovo() throws IsbnExistenteException {
         EstoqueRepositorio estoquerepositorio = new EstoqueDAO();
        
        LivroNovoRepositorio livroNovoRepositorio =  new LivroNovoListDAO();
        LivroNovo livroNovo = addLivro.returnLivroNovo();
        livroNovoRepositorio.addLivroNovo(livroNovo);
        estoquerepositorio.addEstoqueNovo(livroNovo);
        mostraMsg("Adicionado Livro Novo com Sucesso! ");
       fecharTela();

     }
     
     public void actionAdd(){
            
            addLivro.addAcaoBotaoSalvar(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                if(addLivro.rbLivroNovo.isSelected()){
            try {
                addLivroNovo();}
                catch (IsbnExistenteException ex) {
                    addLivro.mostrarMensagem(ex.getMessage());}
            
            }
            else 
               if (addLivro.rbLivroUsado.isSelected()){
                 try {
                    addLivroUsado();} 
                 catch (IsbnExistenteException exception) {
                    addLivro.mostrarMensagem(exception.getMessage());
            }}}
            });
            }
     
     public void fecharTela(){
         addLivro.fecharTela();
     }
     
     public void mostraMsg(String msg){
         addLivro.mostrarMensagem(msg);
     }
     
     
}