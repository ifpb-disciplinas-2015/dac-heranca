package br.com.ifpb.dac.heranca.sigle.table.entities;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.Table;

/**
 *
 * @author DouglasGabriel
 */

@Entity
@Table(name = "Pessoa_Single_Table")
@Inheritance(strategy = "")
public class Pessoa {
    
}
