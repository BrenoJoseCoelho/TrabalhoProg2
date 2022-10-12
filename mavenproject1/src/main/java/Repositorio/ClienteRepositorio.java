/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Repositorio;

import java.util.List;
import models.Cliente;

/**
 *
 * @author breno
 */
public interface ClienteRepositorio {
     public void salvarCliente(Cliente c);
    public Cliente buscarCliente(String cpf);
    public List<Cliente> buscarTodosClientes();
}
