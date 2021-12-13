/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ujmd.ProyectoWeb.Clases;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author roger
 */
@Entity
@Table(name = "detalletiket")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Detalletiket.findAll", query = "SELECT d FROM Detalletiket d")
    , @NamedQuery(name = "Detalletiket.findByNumTik", query = "SELECT d FROM Detalletiket d WHERE d.numTik = :numTik")
    , @NamedQuery(name = "Detalletiket.findByDesPla", query = "SELECT d FROM Detalletiket d WHERE d.desPla = :desPla")
    , @NamedQuery(name = "Detalletiket.findByCantPla", query = "SELECT d FROM Detalletiket d WHERE d.cantPla = :cantPla")
    , @NamedQuery(name = "Detalletiket.findByPrecio", query = "SELECT d FROM Detalletiket d WHERE d.precio = :precio")
    , @NamedQuery(name = "Detalletiket.findByPreVenta", query = "SELECT d FROM Detalletiket d WHERE d.preVenta = :preVenta")})
public class Detalletiket implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "num_tik")
    private String numTik;
    @Basic(optional = false)
    @Column(name = "des_pla")
    private String desPla;
    @Basic(optional = false)
    @Column(name = "cant_pla")
    private String cantPla;
    @Basic(optional = false)
    @Column(name = "precio")
    private String precio;
    @Basic(optional = false)
    @Column(name = "pre_venta")
    private String preVenta;
    @JoinColumn(name = "num_tik", referencedColumnName = "num_tik", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private Tiket tiket;
    @JoinColumn(name = "cod_pla", referencedColumnName = "cod_pla")
    @ManyToOne(optional = false)
    private Platillo codPla;

    public Detalletiket() {
    }

    public Detalletiket(String numTik) {
        this.numTik = numTik;
    }

    public Detalletiket(String numTik, String desPla, String cantPla, String precio, String preVenta) {
        this.numTik = numTik;
        this.desPla = desPla;
        this.cantPla = cantPla;
        this.precio = precio;
        this.preVenta = preVenta;
    }

    public String getNumTik() {
        return numTik;
    }

    public void setNumTik(String numTik) {
        this.numTik = numTik;
    }

    public String getDesPla() {
        return desPla;
    }

    public void setDesPla(String desPla) {
        this.desPla = desPla;
    }

    public String getCantPla() {
        return cantPla;
    }

    public void setCantPla(String cantPla) {
        this.cantPla = cantPla;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public String getPreVenta() {
        return preVenta;
    }

    public void setPreVenta(String preVenta) {
        this.preVenta = preVenta;
    }

    public Tiket getTiket() {
        return tiket;
    }

    public void setTiket(Tiket tiket) {
        this.tiket = tiket;
    }

    public Platillo getCodPla() {
        return codPla;
    }

    public void setCodPla(Platillo codPla) {
        this.codPla = codPla;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (numTik != null ? numTik.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Detalletiket)) {
            return false;
        }
        Detalletiket other = (Detalletiket) object;
        if ((this.numTik == null && other.numTik != null) || (this.numTik != null && !this.numTik.equals(other.numTik))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "edu.ujmd.ProyectoWeb.Clases.Detalletiket[ numTik=" + numTik + " ]";
    }
    
}
