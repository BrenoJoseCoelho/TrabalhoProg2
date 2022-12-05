/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import DAO.EstoqueDAO;
import DAO.LivroNovoListDAO;
import DAO.LivroUsadoListDAO;
import View.JFTelaInicial;
import View.Livro.JFAddLivro;
import View.Livro.JFLivroList;
import java.util.Comparator;
import models.LivroNovo;
import models.LivroUsado;

/**
 *
 * @author LRodrigues
 */
public class ListLivroController {
    private JFTelaInicial jFTelaInicial;
    private JFLivroList LivroList;
    private LivroNovo livroNovo;
    private LivroUsado livroUsado;
    private LivroNovoListDAO livroNovoListDAO = new LivroNovoListDAO();
    private LivroUsadoListDAO livroUsadoListDAO =  new LivroUsadoListDAO();
    private EstoqueDAO estoqueDAO = new EstoqueDAO();

    public ListLivroController(JFLivroList LivroList, LivroNovo livroNovo, LivroUsado livroUsado) {
        this.LivroList = LivroList;
        this.livroNovo = livroNovo;
        this.livroUsado = livroUsado;
        iniciarAcoes();
    }
    
     public void iniciarAcoes(){
         LivroList.addAcaoTelaAddLivro(e -> {
         acaoTelaAddLivro();
         });
         LivroList.addAcaoTelaIniciar(e -> {
         acaoTelaIniciar();
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
      LivroList.listarTodosLivros();
     }
     
     public void listarLivroUsado(){
         LivroList.listarLivrosNovos();
              livroUsadoListDAO.getTodosLivrosUsados().sort((new Comparator<LivroUsado>() {
             @Override
             public int compare(LivroUsado o1, LivroUsado o2) {
                  return o1.getIsbn().compareTo(o2.getIsbn());    
             }
        
       }));
  
     }
     
     public void listaLivroNovo(){
         LivroList.listarLivrosUsados();
            livroNovoListDAO.getTodosLivrosNovos().sort((new Comparator<LivroNovo>() {
           @Override
           public int compare(LivroNovo o1, LivroNovo o2) {

               return o1.getIsbn().compareTo(o2.getIsbn());      
           }
       }));
     }
     
     public void acaoTelaIniciar(){
         TelaInicialController telaInicialController =
                 new TelaInicialController(new JFTelaInicial());
         jFTelaInicial.exibirTela();
         
     }
     
      public void acaoTelaAddLivro(){
         AddLivroController addLivroController =
                 new AddLivroController(null, null, new JFAddLivro());
         jFTelaInicial.exibirTela();
         
     }
     
     public void limparTela(){
         LivroList.limparTela();
     }
     
     
      public void exbirTela(){
       LivroList.exbirTela();
    }
     
    
    
}

    
