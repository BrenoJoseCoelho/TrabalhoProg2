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
public interface LivroUsadoRepositorio {
    void addLivroUsado(LivroUsado lu);
    Livro BuscarLivroUsado(String ISBN);
    void removerLivroUsado(LivroUsado lu);
    List<LivroUsado> getTodosLivrosUsados();
    Livro buscarAutorLivroUsado(String autor);
    Livro buscarTituloLivroUsado(String titulo);
    Livro buscarLivroEditoraLivroUsado(String editora);
   
}
