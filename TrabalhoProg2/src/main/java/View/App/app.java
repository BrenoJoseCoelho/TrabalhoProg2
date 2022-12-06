/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View.App;

import Controller.TelaInicialController;
import Controller.TelaLoginController;
import View.JFTelaInicial;

/**
 *
 * @author LRodrigues
 */
public class app {
    public static void main(String[] args) {
      
         TelaLoginController loginController 
                = new TelaLoginController(new JFTelaLoginLivraria());
                 loginController.exibirTela();
    }
}
