package io.github.pedromedeiros2.grupostrabalho.endereco;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Endereco implements Serializable {

    //<editor-fold defaultstate="collapsed" desc="Atributos">
    public enum TipoLogradouro {
        RUA, AVENIDA, PRACA, OUTRO;
    }

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.ORDINAL)
    private TipoLogradouro tipoLogradouro;

    @Column(length = 150, nullable = false)
    private String logradouro;

    @Column(nullable = false)
    private Integer numero;

    @Column(length = 25, nullable = false)
    private String bairro;

    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Construtores">

    public Endereco() {
    }

    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Getters/Setters">
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public TipoLogradouro getTipoLogradouro() {
        return tipoLogradouro;
    }

    public void setTipoLogradouro(TipoLogradouro tipoLogradouro) {
        this.tipoLogradouro = tipoLogradouro;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
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
        if (!(object instanceof Endereco)) {
            return false;
        }
        Endereco other = (Endereco) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Endereco {" + "id=" + id + ", tipoLogradouro=" + tipoLogradouro + ", logradouro=" + logradouro + ", numero=" + numero + ", bairro=" + bairro + '}';
    }

    //</editor-fold>
}
