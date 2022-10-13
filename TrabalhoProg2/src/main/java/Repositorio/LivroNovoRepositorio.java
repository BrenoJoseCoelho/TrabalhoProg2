/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repositorio;

import java.util.List;
import models.Livro;
import models.LivroNovo;
import models.LivroUsado;

/**
 *
 * @author LRodrigues
 */
public interface LivroNovoRepositorio{
    void addLivroNovo(LivroNovo ln);
    LivroNovo BuscarLivroNovo(String ISBN);
    void removerLivroNovo(LivroNovo ln);
    List<LivroNovo> getTodosLivrosNovos();
    Livro buscarAutorLivroNovo(String autor);
    Livro buscarTituloLivroNovo(String titulo);
    Livro buscarLivroEditoraLivroNovo(String editora);
   
}
