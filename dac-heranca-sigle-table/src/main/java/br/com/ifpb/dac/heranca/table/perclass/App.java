/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.ifpb.dac.heranca.table.perclass;

import br.com.ifpb.dac.heranca.sigle.table.DAO.GenericDao;

/**
 *
 * @author Luciana
 */
public class App {
    
    public static void main(String[] args) {
     
        
        Ator ator1 = new Ator("Cinema", "Izabel");
        
        Cantor cantor1 = new Cantor("Seresta", "Luciana");
        
        GenericDao dao = new GenericDao();
        
        dao.persist(ator1);
        dao.persist(cantor1);
        
    }
    
}
