
package br.com.ifpb.dac.heranca.join;

import br.com.ifpb.dac.heranca.sigle.table.DAO.GenericDao;

/**
 *
 * @author Emanuel Batista da Silva Filho
 */
public class App {
    public static void main(String[] args) {
        Gerente gerente=new Gerente();
        gerente.setNome("rafael");
        gerente.setNumeroFuncionarios(2);
        gerente.setSetor("Qualquer");
        
        Vendedor vendedor=new Vendedor();
        vendedor.setContaVendas(200);
        vendedor.setNumeroVendas(1000);
        vendedor.setNome("priscila");
        
        GenericDao genericDao=new GenericDao();
        genericDao.persist(gerente);
        genericDao.persist(vendedor);
    }
}
