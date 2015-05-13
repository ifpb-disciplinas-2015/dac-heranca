/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.ifpb.dac.heranca.table.perclass;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Luciana
 */

@Entity
public class Cantor extends Artista implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String estiloMusical;

    public Cantor() {
    }

    public Cantor(String estiloMusical) {
        this.estiloMusical = estiloMusical;
    }

    public Cantor(String estiloMusical, String nome) {
        super(nome);
        this.estiloMusical = estiloMusical;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEstiloMusical() {
        return estiloMusical;
    }

    public void setEstiloMusical(String estiloMusical) {
        this.estiloMusical = estiloMusical;
    }
    
    
}
