package Dao;

import model.Linguagem;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import java.util.List;

public class LinguagemDao {

    //LinguagemDao linguagemDao = new LinguagemDao();
    EntityManagerFactory entityManagerFactory = null;
    EntityManager entityManager = null;
    public void LinguagemDao() {

        entityManagerFactory = Persistence.createEntityManagerFactory("desafioProjetoModerna");
        entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
    }
    public void salvar(Linguagem linguagem) {


        LinguagemDao();
        entityManager.persist(linguagem);
        entityManager.getTransaction().commit();
        entityManager.close();

    }

    public Linguagem pesquisarPorId(Long id) {
        LinguagemDao();
        var linguagemEncontrada = entityManager.find(Linguagem.class, id);
        entityManager.close();

        return linguagemEncontrada;

    }

    public void deletar (Long id) {
        LinguagemDao();
        var LinguagemDaoEncontrada = pesquisarPorId(id);
        entityManager.remove(LinguagemDaoEncontrada);
        entityManager.getTransaction().commit();
        entityManager.close();

    }

    public void atualizar (LinguagemDao linguagemDao){
        LinguagemDao();
        entityManager.merge(linguagemDao);
        entityManager.getTransaction().commit();
        entityManager.close();

    }

    public void listarTodos(){
        LinguagemDao();
        var sql = "select * from linguagem";
        TypedQuery typedQuery = entityManager.createQuery(sql, LinguagemDao.class);
        List<LinguagemDao> listaPessoas = typedQuery.getResultList();
        entityManager.close();

    }


}
