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
public class VendaDAO implements VendaRepositorio {

    private static List<Venda> vendas = new ArrayList<>();
    
    @Override
    public void novaVenda(Venda ven) {
      vendas.add(ven);
    }

    @Override
    public String relatorioVendaData(String dataVenda) {
        String datavenda = dataVenda;
        for(Venda ven: vendas){
            if(ven.getDataVenda().equals(dataVenda))
                return ven.toString();
        }
        return null;
    } 

    @Override
    public List<Venda> listarTodasVendas() {
        return vendas;
    }

    
    

}
