package br.com.ifpb.dac.heranca.sigle.table.DAO;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author João Marcos F <joaomarccos.ads@gmail.com>
 */
public class GenericDao {

    public void persist(Object object) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("br.com.ifpb.tcc_dac-heranca-sigle-table_jar_1.0-SNAPSHOTPU");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        try {
            em.persist(object);
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
    }
    
    
    
}
