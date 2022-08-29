package Dao;
import model.Desenvolvedor;

import java.util.List;
import javax.persistence.*;

public class DesenvolvedorDao {

    //DesenvolvedorDao desenvolvedorDaoDao = new DesenvolvedorDao();
    EntityManagerFactory entityManagerFactory = null;
    EntityManager entityManager = null;
    public void DesenvolvedorDao() {

        entityManagerFactory = Persistence.createEntityManagerFactory("desafioProjetoModerna");
        entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
    }
    public void salvar(Desenvolvedor desenvolvedor) {
        DesenvolvedorDao();

        entityManager.persist(desenvolvedor);

        entityManager.getTransaction().commit();
        entityManager.close();

    }

    public Desenvolvedor pesquisarPorId(Long id) {
        DesenvolvedorDao();

        var desenvolvedorEncontrada = entityManager.find(Desenvolvedor.class, id);

        entityManager.close();

        return desenvolvedorEncontrada;

    }

    public void deletar(Long id) {
        DesenvolvedorDao();

        var DesenvolvedorDaoEncontrada = pesquisarPorId(id);
        entityManager.remove(DesenvolvedorDaoEncontrada);
        entityManager.getTransaction().commit();
        entityManager.close();

    }

    public void atualizar (DesenvolvedorDao desenvolvedorDao){
        DesenvolvedorDao();

        entityManager.merge(desenvolvedorDao);
        entityManager.getTransaction().commit();
        entityManager.close();

    }

    public void listarTodos(){
        DesenvolvedorDao();

        var sql = "select * from desenvolvedor";
        TypedQuery typedQuery = entityManager.createQuery(sql, DesenvolvedorDao.class);
        List<DesenvolvedorDao> listaPessoas = typedQuery.getResultList();
        entityManager.close();

    }
}
