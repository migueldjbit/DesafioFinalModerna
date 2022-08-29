package model;
//importações necessarias para o funcionamento de minha persistencia.
import Dao.DesenvolvedorDao;

import javax.persistence.*;
@Entity
@Table (name = "Desenvolvedor")
public class Desenvolvedor {


    //Variaveis Criadas para referenciar meus objetos de Desenvolvedor


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    //@JoinColumn(name = "Linguagem")
    private int id;
    @Column (length = 50, nullable = false)
    private String nome;
    @Column (length = 50, nullable = false, unique = true)
    private String Documento;
    @Column (length = 15, nullable = false)
    private String Genero;
    @Column (length = 12, nullable = false)
    private String AnoNascimento;
    //@ManyToOne
    //@JoinColumn(name = "Contatos")
    @JoinColumn
    private String Des_Ref;

    public Desenvolvedor() {
    }

    public Desenvolvedor(int id, String nome, String documento, String genero, String anoNascimento,String des_Ref) {
        this.id = id;
        this.nome = nome;
        Documento = documento;
        Genero = genero;
        AnoNascimento = anoNascimento;
        Des_Ref = des_Ref;

    }

    public String getDes_Ref() {
        return Des_Ref;
    }

    public void setDes_Ref(String des_Ref) {
        Des_Ref = des_Ref;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDocumento() {
        return Documento;
    }

    public void setDocumento(String documento) {
        Documento = documento;
    }

    public String getGenero() {
        return Genero;
    }

    public void setGenero(String genero) {
        Genero = genero;
    }

    public String getAnoNascimento() {
        return AnoNascimento;
    }

    public void setAnoNascimento(String anoNascimento) {
        AnoNascimento = anoNascimento;
    }

    @Override
    public String toString() {
        return "Desenvolvedor{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", Documento='" + Documento + '\'' +
                ", Genero='" + Genero + '\'' +
                ", AnoNascimento='" + AnoNascimento + '\'' +
                '}';
    }



}
