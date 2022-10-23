/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Repositorio.ClienteRepositorio;
import java.util.ArrayList;
import java.util.List;
import models.Cliente;

/**
 *
 * @author breno
 */
public class ClienteDAO implements ClienteRepositorio {

    private static List<Cliente> clientes = new ArrayList<>();

    @Override
    public void salvarCliente(Cliente c) {
        clientes.add(c);
    }

    @Override
    public Cliente buscarCliente(String cpf) {
        for (Cliente cli : clientes) {
            if (cli.getCpf().equals(cli));
            return cli;
        }
        return null;
    }

    @Override
    public List<Cliente> buscarTodosClientes() {
        return clientes;
    }
    @Override
    public List<Cliente> getCliente() {
       return clientes;
    }

    @Override
    public void removeCliente(Cliente c) {
        clientes.remove(c);
    }

}
