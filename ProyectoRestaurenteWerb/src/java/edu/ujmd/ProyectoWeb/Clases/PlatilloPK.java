/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ujmd.ProyectoWeb.Clases;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author roger
 */
@Embeddable
public class PlatilloPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "cod_pla")
    private String codPla;
    @Basic(optional = false)
    @Column(name = "descripcion")
    private String descripcion;

    public PlatilloPK() {
    }

    public PlatilloPK(String codPla, String descripcion) {
        this.codPla = codPla;
        this.descripcion = descripcion;
    }

    public String getCodPla() {
        return codPla;
    }

    public void setCodPla(String codPla) {
        this.codPla = codPla;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codPla != null ? codPla.hashCode() : 0);
        hash += (descripcion != null ? descripcion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PlatilloPK)) {
            return false;
        }
        PlatilloPK other = (PlatilloPK) object;
        if ((this.codPla == null && other.codPla != null) || (this.codPla != null && !this.codPla.equals(other.codPla))) {
            return false;
        }
        if ((this.descripcion == null && other.descripcion != null) || (this.descripcion != null && !this.descripcion.equals(other.descripcion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "edu.ujmd.ProyectoWeb.Clases.PlatilloPK[ codPla=" + codPla + ", descripcion=" + descripcion + " ]";
    }
    
}
