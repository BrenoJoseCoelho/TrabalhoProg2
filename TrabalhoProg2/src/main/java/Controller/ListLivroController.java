/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import DAO.EstoqueDAO;
import DAO.LivroNovoListDAO;
import DAO.LivroUsadoListDAO;
import Repositorio.LivroNovoRepositorio;
import Repositorio.LivroUsadoRepositorio;
import View.JFTelaInicial;
import View.Livro.JFAddLivro;
import View.Livro.JFLivroList;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Comparator;
import java.util.List;
import models.LivroNovo;
import models.LivroUsado;

/**
 *
 * @author LRodrigues
 */
public class ListLivroController{
    private JFTelaInicial jFTelaInicial;
    private JFLivroList LivroList ; 
    private List<LivroNovo> livroNovo;
    private List<LivroUsado> livroUsado;
    private LivroNovoListDAO livroNovoListDAO = new LivroNovoListDAO();
    private LivroUsadoListDAO livroUsadoListDAO =  new LivroUsadoListDAO();
    private EstoqueDAO estoqueDAO = new EstoqueDAO();

    public ListLivroController(JFLivroList LivroList) {
      
       this.LivroList = new JFLivroList();
        iniciarAcoes();
        exbirTela();
    }

     public void iniciarAcoes(){
         LivroList.addAcaoTelaAddLivro(e -> {
         acaoTelaAddLivro();
         });
         LivroList.addAcaoTelaIniciar(e -> {
         acaoTelaIniciar();
         fecharListTela();
         });
         LivroList.addAcaoListarLivrosNovo(e -> {
         listaLivroNovo();
         });
         LivroList.addAcaoListarLivrosUsado(e -> {
         listarLivroUsado();
         });
         LivroList.addAcaoListarTodosLivros(e -> {
         listarTodosLivros();
         });
         LivroList.addAcaoLimparTela(e-> {
         limparTela();
         });                         
     }
     
     public void listarTodosLivros(){
       LivroUsadoRepositorio livroUsadoRepositorio= new LivroUsadoListDAO();
       LivroNovoRepositorio livroNovoRepositorio = new LivroNovoListDAO();
         livroUsado = (List<LivroUsado>) livroUsadoRepositorio.getTodosLivrosUsados();
         livroNovo = (List<LivroNovo>) livroNovoRepositorio.getTodosLivrosNovos();
            LivroList.listarLivrosUsados((List<LivroUsado>) livroUsado);
            LivroList.listarLivrosNovos((List<LivroNovo>) livroNovo);
     }
     
     public void listarLivroUsado(){
          listUsed();
             livroUsadoListDAO.getTodosLivrosUsados().sort((new Comparator<LivroUsado>() {
             @Override
               public int compare(LivroUsado o1, LivroUsado o2) {
                  return o1.getIsbn().compareTo(o2.getIsbn());    
             }}));}
     
     public void listaLivroNovo(){
         listarNewLivro();
            livroNovoListDAO.getTodosLivrosNovos().sort((new Comparator<LivroNovo>() {
           @Override   
            public int compare(LivroNovo o1, LivroNovo o2) {
               return o1.getIsbn().compareTo(o2.getIsbn());      
           }}));}

     
     public void listUsed(){
         LivroUsadoRepositorio livroUsadoRepositorio= new LivroUsadoListDAO();
         livroUsado = (List<LivroUsado>)livroUsadoRepositorio.getTodosLivrosUsados();
         LivroList.listarLivrosUsados((List<LivroUsado>) livroUsado);}
     
     public void listarNewLivro(){
         LivroNovoRepositorio livroNovoRepositorio = new LivroNovoListDAO();
         livroNovo = (List<LivroNovo>)livroNovoRepositorio.getTodosLivrosNovos();
         LivroList.listarLivrosNovos((List<LivroNovo>) livroNovo);}
     
     public void acaoTelaIniciar(){
         TelaInicialController inicialController =
         new TelaInicialController(new JFTelaInicial());
         inicialController.exibirTela();}
     
      public void acaoTelaAddLivro(){
         AddLivroController addLivroController = 
                 new AddLivroController(new JFAddLivro());
                addLivroController.exibirTela();}
      
     public void fecharListTela(){
      LivroList.fecharTela();}
     
     public void limparTela(){
         LivroList.limparTela();}

      public void exbirTela(){
       LivroList.exbirTela();}

  
     
    
    
}

    