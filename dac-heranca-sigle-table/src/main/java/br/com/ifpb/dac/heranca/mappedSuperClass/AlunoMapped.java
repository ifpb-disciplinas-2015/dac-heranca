/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.ifpb.dac.heranca.mappedSuperClass;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 *
 * @author Joao
 */
@Entity
@Table(name = "MappedAluno")
public class AlunoMapped extends Pessoa{
    
    private String matricula;

    public AlunoMapped() {
    }

    public AlunoMapped(String matricula) {
        this.matricula = matricula;
    }

    public AlunoMapped(String matricula, String nome) {
        super(nome);
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    
    
    
}
