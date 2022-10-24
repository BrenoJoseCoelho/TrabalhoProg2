/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Repositorio;

import java.util.List;
import models.Venda;

/**
 *
 * @author breno
 */
public interface VendaRepositorio {
    
    void novaVenda(Venda ven);
    String relatorioVendaData(String dataVenda);
    List<Venda> listarTodasVendas();
}
