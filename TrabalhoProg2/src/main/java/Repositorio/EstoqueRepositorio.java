/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Repositorio;

import models.Estoque;

/**
 *
 * @author LRodrigues
 */
public interface EstoqueRepositorio {
    void addEstoque(Estoque estoque);
    void attQuantidade(Estoque estoque);
    void removeEstoque( Estoque estoque);
    void listaEstoque(Estoque estoque);
}
