package br.com.ifpb.dac.heranca.sigle.table.loader;

import br.com.ifpb.dac.heranca.sigle.table.DAO.GenericDao;
import br.com.ifpb.dac.heranca.sigle.table.entities.Aluno;
import br.com.ifpb.dac.heranca.sigle.table.entities.People;
import br.com.ifpb.dac.heranca.sigle.table.entities.Professor;

/**
 *
 * @author DouglasGabriel
 */
public class Loader {

    public static void main(String[] args) {
        GenericDao dao = new GenericDao();
        dao.persist(new Aluno());
    }
}
