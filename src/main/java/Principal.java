//Importações dos pacotes necessarios para os metodos de acesso
import Dao.ContatosDao;
import Dao.DesenvolvedorDao;
import Dao.LinguagemDao;
import model.Contatos;
import model.Desenvolvedor;
import model.Linguagem;

public class Principal {
    public static void main(String[] args) {

                                //Salvando no Banco

        //Instaciando os objetos criados e inserindo conteudos com a conexão API do Postgres
        Desenvolvedor d1 = new Desenvolvedor();
        d1.setNome("Lara");
        d1.setDocumento("654321");
        d1.setGenero("Feminino");
        d1.setAnoNascimento("06/06/2016");
        DesenvolvedorDao desenvolvedorDao = new DesenvolvedorDao();
        desenvolvedorDao.salvar(d1);

        //Instaciando os objetos criados e inserindo conteudos com a conexão API do Postgres
        Linguagem l1 = new Linguagem();
        l1.setEmail("Java");
        l1.setVersao("1.0");
        LinguagemDao linguagemDao = new LinguagemDao();
        linguagemDao.salvar(l1);

        //Instaciando os objetos criados e inserindo conteudos com a conexão API do Postgres
        Contatos c1 = new Contatos();
        c1.setEmail("laratexte@gmail.com");
        c1.setDdd(81);
        c1.setNumero(987654321L);
        ContatosDao contatosDao = new ContatosDao();
        contatosDao.salvar(c1);

        //************************************************************************************


        desenvolvedorDao.pesquisarPorId(27L);
        linguagemDao.pesquisarPorId(28L);
        contatosDao.pesquisarPorId(29l);

        desenvolvedorDao.deletar(27l);
        contatosDao.deletar(29l);
        linguagemDao.deletar(28l);

        desenvolvedorDao.listarTodos();
        contatosDao.listarTodos();
        linguagemDao.listarTodos();


    }
}