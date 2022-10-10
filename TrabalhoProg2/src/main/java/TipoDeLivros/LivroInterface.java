/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TipoDeLivros;

/**
 *
 * @author LRodrigues
 */
public interface LivroInterface  {
    void addLivro(Livro livro);
    Livro buscarAutor(String autor);
    Livro buscarTitulo(String titulo);
    Livro buscarLivroEditora(String nome);
    Livro buscarISBN(String isbn);
    Livro buscarPreco(float preco);
    void removeLivro(Livro livro);
       
}
