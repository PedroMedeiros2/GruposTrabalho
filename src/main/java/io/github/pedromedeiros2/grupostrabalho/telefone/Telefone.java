package io.github.pedromedeiros2.grupostrabalho.telefone;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class Telefone implements Serializable {

    //<editor-fold defaultstate="collapsed" desc="Atributos">

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Byte ddd;
    private Integer numero;

    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Construtores">
    public Telefone() {
    }

    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Getters/Setters">

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Byte getDdd() {
        return ddd;
    }

    public void setDdd(Byte ddd) {
        this.ddd = ddd;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
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
        if (!(object instanceof Telefone)) {
            return false;
        }
        Telefone other = (Telefone) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Telefone{" + "id=" + id + ", ddd=" + ddd + ", numero=" + numero + '}';
    }

    //</editor-fold>
}
