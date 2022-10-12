/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Repositorio.FornecedorRepositorio;
import java.util.ArrayList;
import java.util.List;
import models.Fornecedor;

/**
 *
 * @author breno
 */
public class FornecedorDAO implements FornecedorRepositorio {
    
    private static List<Fornecedor> fornecedores = new ArrayList<>();

    @Override
    public void salvarFornecedor(Fornecedor f) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Fornecedor buscarFornecedor(String CNPJ) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Fornecedor> buscarTodosFornecedores() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }


}
