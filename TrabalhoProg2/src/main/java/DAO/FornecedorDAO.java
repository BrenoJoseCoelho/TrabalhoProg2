/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Repositorio.FornecedorRepositorio;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import models.Fornecedor;

/**
 *
 * @author breno
 */
public class FornecedorDAO implements FornecedorRepositorio {
    
    private static Set<Fornecedor> fornecedores = new HashSet<>();

    @Override
    public void salvarFornecedor(Fornecedor f) {
        fornecedores.add(f);
    }

    @Override
    public Fornecedor buscarFornecedor(String CNPJ) {
         for (Fornecedor forne : fornecedores) {
            if (forne.getCnpj().equals(forne));
            return forne;
        }
        return null;
    }

    @Override
    public Set<Fornecedor> buscarTodosFornecedores() {
        return fornecedores;
    }

    @Override
    public void removerFornecedor(Fornecedor f) {
        fornecedores.remove(f);
    }


}
