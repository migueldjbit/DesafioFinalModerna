package Dao;
import model.Contatos;
import model.Desenvolvedor;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import java.util.List;

public class ContatosDao {

    //ContatosDao contatoDao = new ContatosDao();
    EntityManagerFactory entityManagerFactory = null;
    EntityManager entityManager = null;
    public void ContatosDao() {

        entityManagerFactory = Persistence.createEntityManagerFactory("desafioProjetoModerna");
        entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
    }
    public void salvar(Contatos contatos) {
        ContatosDao();

        entityManager.persist(contatos);

        entityManager.getTransaction().commit();
        entityManager.close();

    }

    public Contatos pesquisarPorId(Long id) {
        ContatosDao();

        var contatosEncontrada = entityManager.find(Contatos.class, id);

        entityManager.close();

        return contatosEncontrada;

    }

    public void deletar(Long id) {
        ContatosDao();

        var ContatosDaoEncontrada = pesquisarPorId(id);
        entityManager.remove(ContatosDaoEncontrada);
        entityManager.getTransaction().commit();
        entityManager.close();

    }

    public void atualizar (ContatosDao contatosDao){
        ContatosDao();
        entityManager.merge(contatosDao);
        entityManager.getTransaction().commit();
        entityManager.close();

    }

    public void listarTodos(){
        ContatosDao();
        var sql = "select * from contatos";
        TypedQuery typedQuery = entityManager.createQuery(sql, DesenvolvedorDao.class);
        List<ContatosDao> listaPessoas = typedQuery.getResultList();
        entityManager.close();

    }
}
