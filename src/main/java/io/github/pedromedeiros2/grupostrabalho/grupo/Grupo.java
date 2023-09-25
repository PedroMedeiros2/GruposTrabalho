package io.github.pedromedeiros2.grupostrabalho.grupo;

import io.github.pedromedeiros2.grupostrabalho.atuacao.Atuacao;
import io.github.pedromedeiros2.grupostrabalho.pessoa.Pessoa;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Grupo implements Serializable {

    //<editor-fold defaultstate="collapsed" desc="Atributos">
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 65, nullable = false)
    private String nome;

    private Boolean ativo;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "lider_id")
    private Pessoa lider;

    @OneToMany(mappedBy = "grupo" , cascade = CascadeType.ALL)
    private List<Atuacao> atuacoes;

    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Construtores">
    public Grupo() {
        this.ativo = true;
        atuacoes = new ArrayList<>();
    }

    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Getters/Setters">
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Boolean getAtivo() {
        return ativo;
    }

    public void setAtivo(Boolean ativo) {
        this.ativo = ativo;
    }

    public Pessoa getLider() {
        return lider;
    }

    public void setLider(Pessoa lider) {
        this.lider = lider;
    }

    public List<Atuacao> getAtuacoes() {
        return atuacoes;
    }

    public void setAtuacoes(List<Atuacao> atuacoes) {
        this.atuacoes = atuacoes;
    }
    //</editor-fold>


    //<editor-fold defaultstate="collapsed" desc="Métodos">
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof Grupo)) {
            return false;
        }
        Grupo other = (Grupo) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Grupo {" + "id=" + id + ", nome=" + nome + ", ativo=" + ativo + ", lider=" + lider.getNome() + ", atuacoes=" + atuacoes + '}';
    }

    //</editor-fold>
}