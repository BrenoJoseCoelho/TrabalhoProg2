/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;
import DAO.LivroNovoListDAO;
import DAO.LivroUsadoListDAO;
import Exception.IsbnExistenteException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;


/**
 *
 * @author LRodrigues
 */
public class Estoque {
    
    

    private List<Funcionario> funcionario;
    private Venda venda;
    private LivroNovo livroNovo;
    private LivroUsado livroUsado;
    private int qtdLivros;
    private Set<Livro> livros;
    private List<Livro> obterLivroPorISBN;
    private Fornecedor fornecedor;
    

    public Estoque(int qtdLivros) {
        this.qtdLivros = qtdLivros;
        this.livros = new HashSet<>();
        this.obterLivroPorISBN = new ArrayList<>(); 
    }

    public Estoque() {
    }
    
    public void addLivro(Livro livros){
        this.livros.add(livros);  
    }
     
    public int getQtdLivros() {
        return qtdLivros;
    }

    public void setQtdLivros(int qtdLivros) {
        this.qtdLivros = qtdLivros;
    
    }
 
    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = (List<Funcionario>) funcionario;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }
    
}
