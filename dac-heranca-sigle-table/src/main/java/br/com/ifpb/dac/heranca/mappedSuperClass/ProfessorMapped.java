/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.ifpb.dac.heranca.mappedSuperClass;

import javax.persistence.Entity;

/**
 *
 * @author Joao
 */
@Entity
public class ProfessorMapped extends Pessoa{
    private String siape;

    public ProfessorMapped() {
    }

    public ProfessorMapped(String siape) {
        this.siape = siape;
    }

    public ProfessorMapped(String siape, String nome) {
        super(nome);
        this.siape = siape;
    }

    

    public String getSiape() {
        return siape;
    }

    public void setSiape(String siape) {
        this.siape = siape;
    }

    @Override
    public String toString() {
        return "Professor{" + "siape=" + siape + '}';
    }
    
    
    
}
