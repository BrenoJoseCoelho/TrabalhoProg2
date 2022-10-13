/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import java.util.List;

/**
 *
 * @author LRodrigues
 */
public interface AutenticacaoLogin {
    boolean Logar(String login, String senha);
    List<String> getPermissoes();
}
