package br.com.ifpb.dac.heranca.sigle.table.entities;

import javax.persistence.DiscriminatorValue;

/**
 *
 * @author João Marcos F <joaomarccos.ads@gmail.com>
 */
@DiscriminatorValue(value = "teacher")
public class Professor extends Pessoa{
    private String siape;

    public String getSiape() {
        return siape;
    }

    public void setSiape(String siape) {
        this.siape = siape;
    }
    
    
}
