/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.ifpb.dac.heranca.join;

import javax.persistence.Entity;

/**
 *
 * @author Rafael
 */
@Entity
public class Vendedor extends Funcionario{
    
    private int numeroVendas;
    private int contaVendas;

    public int getNumeroVendas() {
        return numeroVendas;
    }

    public void setNumeroVendas(int numeroVendas) {
        this.numeroVendas = numeroVendas;
    }

    public int getContaVendas() {
        return contaVendas;
    }

    public void setContaVendas(int contaVendas) {
        this.contaVendas = contaVendas;
    }
    
    
    
    
}
