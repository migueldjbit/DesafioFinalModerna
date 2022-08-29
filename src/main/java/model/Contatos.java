package model;

//importações necessarias para o funcionamento de minha persistencia.
import Dao.ContatosDao;

import javax.persistence.*;


@Entity
@Table (name = "Contatos")
public class Contatos {



    //Variaveis Criadas para referenciar meus objetos de contatos
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column (name = "id", length = 50, nullable = false)

    private int id;
    @Column (name = "email",length = 50, nullable = false)
    private String email;
    @Column (name = "ddd",length = 3, nullable = false)
    private int ddd;
    @Column (name = "numero",length = 10, nullable = false)
    private Long numero;
    // @ManyToOne
    //@JoinColumn(name = "Desenvolvedor")
    @JoinColumn
    private String cont_Ref;


    public Contatos() {
    }

    public Contatos(int id, String email, int ddd, Long numero) {
        this.id = id;
        this.email = email;
        this.ddd = ddd;
        this.numero = numero;
    }

    public String getCont_Ref() {
        return cont_Ref;
    }

    public void setCont_Ref(String cont_Ref) {
        this.cont_Ref = cont_Ref;
    }

    public Contatos(String cont_Ref) {
        this.cont_Ref = cont_Ref;
    }

    @Override
    public String toString() {
        return "Contatos{" +
                "cont_Ref='" + cont_Ref + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getDdd() {
        return ddd;
    }

    public void setDdd(int ddd) {
        this.ddd = ddd;
    }

    public Long getNumero() {
        return numero;
    }

    public void setNumero(Long numero) {
        this.numero = numero;
    }


}
