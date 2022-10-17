/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Repositorio.VendaRepositorio;
import java.util.ArrayList;
import java.util.List;
import models.Venda;

/**
 *
 * @author breno
 */
public class VendaDao implements VendaRepositorio {

    private static List<Venda> vendas = new ArrayList<>();
    
    @Override
    public void novaVenda(Venda ven) {
      vendas.add(ven);
    }

    @Override
    public Venda relatorioVendaData(String dataVenda) {
        for(Venda ven: vendas){
            if(ven.getDataVenda().equals(ven))
                return ven;
        }
        return null;
    }

    @Override
    public Venda relatorioStatus(String status) {
        for(Venda ven: vendas){
            if(ven.getStatus().equals(ven))
                return ven;
        }
        return null;
    }
    
}
