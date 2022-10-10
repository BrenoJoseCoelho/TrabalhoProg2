/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Livraria;

import TipoDeLivros.Livro;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author LRodrigues
 */
public abstract class Venda {
    
    private  List<Livro> livros;
    private Cliente cliente;
    private LocalDate dataEntrada;
    private LocalDate dataVenda;
    private static int geradorID = 0;
    private Map<Livro, Integer> livroQuantidade;

    public Venda(LocalDate dataEntrada, LocalDate dataVenda) {
        
        this.cliente = cliente;
        this.dataEntrada = dataEntrada;
        this.dataVenda = dataVenda;
        this.livroQuantidade = livroQuantidade;
        this.livros = new ArrayList<>();
        this.livroQuantidade = new HashMap<>();
    }
    
    
    public void addProdutoQuantidadeMap(Livro b, Integer qtd) {
        livroQuantidade.put(b, qtd);
    }

    public Map<Livro, Integer> getLivroQuantidade() {
        return livroQuantidade;
    }

    public List<Livro> getLivros() {
        return livros;
    }


    public String InfoCompra(){
        
        return null;
        
    }
    
    
    
    
}


//    public String getDataFormatada() {
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
//        String dataFormatada = dataEmprestimo.format(formatter);
//        return dataFormatada;
//    }