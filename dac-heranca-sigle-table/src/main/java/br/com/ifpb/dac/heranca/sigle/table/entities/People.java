package br.com.ifpb.dac.heranca.sigle.table.entities;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

/**
 *
 * @author DouglasGabriel
 */

@Entity
@Table(name = "Pessoa_Single_Table")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn (name = "Type", discriminatorType = DiscriminatorType.STRING)
@DiscriminatorValue ("PEOPLE")
public class People {
    
    @Id
    @GeneratedValue
    private int id;
    private String name;
    private int idade;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    
}
