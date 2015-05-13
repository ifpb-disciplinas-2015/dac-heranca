/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.ifpb.dac.heranca.mappedSuperClass;

import br.com.ifpb.dac.heranca.sigle.table.DAO.GenericDao;

/**
 *
 * @author Joao
 */
public class Teste {
    
    public static void main(String[] args) {
        AlunoMapped aluno = new AlunoMapped("123","cassio das novinhas");
        
        GenericDao dao = new GenericDao();
        dao.persist(aluno);
        
    }
    
}
