/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Repositorio;

import java.util.List;
import models.Estoque;
import models.Livro;
import models.LivroNovo;
import models.LivroUsado;

/**
 *
 * @author LRodrigues
 */
public interface EstoqueRepositorio {
    void attQuantidade(Estoque estoque);
    void listaEstoque(Estoque estoque);
    List<Livro> getTodosLivros();
    public void addEstoqueNovo(LivroNovo livroNovo);
    public void addEstoqueUsado(LivroUsado livroUsado);
    public void removeLivro(Livro livros);
}
