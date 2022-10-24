/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;
import DAO.LivroNovoListDAO;
import DAO.LivroUsadoListDAO;
import Exception.IsbnExistenteException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;


/**
 *
 * @author LRodrigues
 */
public class Estoque {
    
    

    private Funcionario funcionario;
    private Venda venda;
    private LivroNovo livroNovo;
    private LivroUsado livroUsado;
    private int qtdLivros;
    private Set<Livro> livros;
    private Map<String, Livro> obterLivroPorISBN;
    private Fornecedor fornecedor;

    public Estoque(int qtdLivros) {
        this.qtdLivros = qtdLivros;
        this.livros = new HashSet<>();
        this.obterLivroPorISBN = new HashMap<>();
    }

    public Estoque() {
    }
    
    public void addLivro(Livro livros){
        this.livros.add(livros);  
    }
     
    public void removeLivro(Livro livros){
        this.livros.add(livros);  
    } 
    
    public void addLivrosMap(Livro livro){
        this.obterLivroPorISBN.put(livro.getIsbn(), livro);
    }
    public Livro buscarLivroISBN (String ISBN){
        return this.obterLivroPorISBN.get(ISBN);
    }

    public int getQtdLivros() {
        return qtdLivros;
    }

    public void setQtdLivros(int qtdLivros) {
        this.qtdLivros = qtdLivros;
    
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }
    
}
