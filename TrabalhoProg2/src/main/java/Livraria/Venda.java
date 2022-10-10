/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Livraria;

import TipoDeLivros.Livro;
import java.time.LocalDate;

/**
 *
 * @author LRodrigues
 */
public class Venda {
    
    private  Livro livro;
    private Cliente cliente;
    private LocalDate dataEntrada;
    private LocalDate dataVenda;
}

//    public String getDataFormatada() {
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
//        String dataFormatada = dataEmprestimo.format(formatter);
//        return dataFormatada;
//    }