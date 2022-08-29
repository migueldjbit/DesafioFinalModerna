package model;
//importações necessarias para o funcionamento de minha persistencia.
import Dao.LinguagemDao;

import javax.persistence.*;
@Entity
@Table (name = "Linguagem")
public class Linguagem {


    //Variaveis Criadas para referenciar meus objetos de Linguagem
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(length = 50, nullable = false)
    private String nome;
    @Column (length = 10, nullable = false)
    private String versao;

    public Linguagem() {
    }

    public Linguagem(int id, String email, String versao) {
        this.id = id;
        this.nome = email;
        this.versao = versao;
    }

    @Override
    public String toString() {
        return "Lingagem{" +
                "id=" + id +
                ", email='" + nome + '\'' +
                ", versao='" + versao + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return nome;
    }

    public void setEmail(String email) {
        this.nome = email;
    }

    public String getVersao() {
        return versao;
    }

    public void setVersao(String versao) {
        this.versao = versao;
    }
}
