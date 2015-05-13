package br.com.ifpb.dac.heranca.sigle.table.entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 *
 * @author João Marcos F <joaomarccos.ads@gmail.com>
 */
@Entity
@DiscriminatorValue(value = "teacher")
public class Professor extends People{
    private String siape;

    public String getSiape() {
        return siape;
    }

    public void setSiape(String siape) {
        this.siape = siape;
    }
    
    
}
