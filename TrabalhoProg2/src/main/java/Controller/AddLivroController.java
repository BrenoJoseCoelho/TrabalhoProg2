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
    private Livro livro;
    private JFAddLivro addLivro;

    public AddLivroController(LivroNovo livroNovo, LivroUsado livroUsado, Livro livro, JFAddLivro addLivro) {
        this.livroNovo = livroNovo;
        this.livroUsado = livroUsado;
        this.livro = livro;
        this.addLivro = addLivro;
        addActionButton();
    }
    
    public void addActionButton(){
        actionAdd();
    }
    
     public void exibirTela(){
       addLivro.setVisible(true);
    }
    
     public void addLivroUsado() throws IsbnExistenteException{
          EstoqueRepositorio estoquerepositorio = new EstoqueDAO();
        LivroNovoRepositorio livroNovoRepositorio =  new LivroNovoListDAO();
        LivroNovo livroNovo = addLivro.returnLivroNovo();
        livroNovoRepositorio.addLivroNovo(livroNovo);
        estoquerepositorio.addEstoqueNovo(livroNovo);
        addLivro.mostrarMensagem("Adicionado Livro Novo com Sucesso! ");
        addLivro.dispose();
         
    }
     
     
     public void addLivroNovo() throws IsbnExistenteException {
         EstoqueRepositorio estoquerepositorio = new EstoqueDAO();
        
        LivroNovoRepositorio livroNovoRepositorio =  new LivroNovoListDAO();
        LivroNovo livroNovo = addLivro.returnLivroNovo();
        livroNovoRepositorio.addLivroNovo(livroNovo);
        estoquerepositorio.addEstoqueNovo(livroNovo);
        addLivro.mostrarMensagem("Adicionado Livro Novo com Sucesso! ");
        addLivro.dispose();

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
     
     
}