package io.github.pedromedeiros2.grupostrabalho.atuacao;

import io.github.pedromedeiros2.grupostrabalho.grupo.Grupo;
import io.github.pedromedeiros2.grupostrabalho.pessoa.Pessoa;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

@Entity
public class Atuacao implements Serializable {

    //<editor-fold defaultstate="collapsed" desc="Atributos">
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(columnDefinition = "TIMESTAMP")
    private LocalDate inicio;

    @Column(columnDefinition = "TIMESTAMP")
    private LocalDate termino;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "pessoa_id")
    private Pessoa pessoa;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "grupo_id")
    private Grupo grupo;

    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Construtores">
    public Atuacao() {
    }

    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Getters/Setters">
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getInicio() {
        return inicio;
    }

    public void setInicio(LocalDate inicio) {
        this.inicio = inicio;
    }

    public LocalDate getTermino() {
        return termino;
    }

    public void setTermino(LocalDate termino) {
        this.termino = termino;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public Grupo getGrupo() {
        return grupo;
    }

    public void setGrupo(Grupo grupo) {
        this.grupo = grupo;
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
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Atuacao)) {
            return false;
        }
        Atuacao other = (Atuacao) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Atuacao{" + "id=" + id + ", inicio=" + inicio + ", termino=" + termino + ", grupo=" + grupo.getNome() + '}';
    }

    //</editor-fold>
}