/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repositorio;

import java.util.List;
import java.util.Set;
import models.Fornecedor;

/**
 *
 * @author breno
 */
public interface FornecedorRepositorio {
    
    public void salvarFornecedor(Fornecedor f);
    public void removerFornecedor(Fornecedor f);
    public Fornecedor buscarFornecedor(String CNPJ);
    public Set<Fornecedor> buscarTodosFornecedores();
    
}
