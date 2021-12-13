/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ujmd.ProyectoWeb.Clases;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author roger
 */
@Entity
@Table(name = "platillo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Platillo.findAll", query = "SELECT p FROM Platillo p")
    , @NamedQuery(name = "Platillo.findByCodPla", query = "SELECT p FROM Platillo p WHERE p.platilloPK.codPla = :codPla")
    , @NamedQuery(name = "Platillo.findByDescripcion", query = "SELECT p FROM Platillo p WHERE p.platilloPK.descripcion = :descripcion")
    , @NamedQuery(name = "Platillo.findByPrecio", query = "SELECT p FROM Platillo p WHERE p.precio = :precio")})
public class Platillo implements Serializable {

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "codPla")
    private List<Detallefactura> detallefacturaList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "codPla")
    private List<Detalletiket> detalletiketList;

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected PlatilloPK platilloPK;
    @Basic(optional = false)
    @Column(name = "precio")
    private String precio;

    public Platillo() {
    }

    public Platillo(PlatilloPK platilloPK) {
        this.platilloPK = platilloPK;
    }

    public Platillo(PlatilloPK platilloPK, String precio) {
        this.platilloPK = platilloPK;
        this.precio = precio;
    }

    public Platillo(String codPla, String descripcion) {
        this.platilloPK = new PlatilloPK(codPla, descripcion);
    }

    public PlatilloPK getPlatilloPK() {
        return platilloPK;
    }

    public void setPlatilloPK(PlatilloPK platilloPK) {
        this.platilloPK = platilloPK;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (platilloPK != null ? platilloPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Platillo)) {
            return false;
        }
        Platillo other = (Platillo) object;
        if ((this.platilloPK == null && other.platilloPK != null) || (this.platilloPK != null && !this.platilloPK.equals(other.platilloPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "edu.ujmd.ProyectoWeb.Clases.Platillo[ platilloPK=" + platilloPK + " ]";
    }

    @XmlTransient
    public List<Detallefactura> getDetallefacturaList() {
        return detallefacturaList;
    }

    public void setDetallefacturaList(List<Detallefactura> detallefacturaList) {
        this.detallefacturaList = detallefacturaList;
    }

    @XmlTransient
    public List<Detalletiket> getDetalletiketList() {
        return detalletiketList;
    }

    public void setDetalletiketList(List<Detalletiket> detalletiketList) {
        this.detalletiketList = detalletiketList;
    }
    
}
