/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View.App;

import Controller.AddLivroController;
import Controller.ListLivroController;
import View.Livro.JFAddLivro;
import View.Livro.JFLivroList;

/**
 *
 * @author LRodrigues
 */
public class App {
    public static void main(String[] args) {
        AddLivroController addLivroController = 
                 new AddLivroController(new JFAddLivro());
        addLivroController.exibirTela();
    }
    
}
