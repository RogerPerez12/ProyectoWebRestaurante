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
@Table(name = "detallefactura")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Detallefactura.findAll", query = "SELECT d FROM Detallefactura d")
    , @NamedQuery(name = "Detallefactura.findByNumFac", query = "SELECT d FROM Detallefactura d WHERE d.numFac = :numFac")
    , @NamedQuery(name = "Detallefactura.findByDesPla", query = "SELECT d FROM Detallefactura d WHERE d.desPla = :desPla")
    , @NamedQuery(name = "Detallefactura.findByCantPla", query = "SELECT d FROM Detallefactura d WHERE d.cantPla = :cantPla")
    , @NamedQuery(name = "Detallefactura.findByPrecio", query = "SELECT d FROM Detallefactura d WHERE d.precio = :precio")
    , @NamedQuery(name = "Detallefactura.findByPreTot", query = "SELECT d FROM Detallefactura d WHERE d.preTot = :preTot")})
public class Detallefactura implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "num_fac")
    private String numFac;
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
    @Column(name = "pre_tot")
    private String preTot;
    @JoinColumn(name = "num_fac", referencedColumnName = "num_fac", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private Factura factura;
    @JoinColumn(name = "cod_pla", referencedColumnName = "cod_pla")
    @ManyToOne(optional = false)
    private Platillo codPla;

    public Detallefactura() {
    }

    public Detallefactura(String numFac) {
        this.numFac = numFac;
    }

    public Detallefactura(String numFac, String desPla, String cantPla, String precio, String preTot) {
        this.numFac = numFac;
        this.desPla = desPla;
        this.cantPla = cantPla;
        this.precio = precio;
        this.preTot = preTot;
    }

    public String getNumFac() {
        return numFac;
    }

    public void setNumFac(String numFac) {
        this.numFac = numFac;
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

    public String getPreTot() {
        return preTot;
    }

    public void setPreTot(String preTot) {
        this.preTot = preTot;
    }

    public Factura getFactura() {
        return factura;
    }

    public void setFactura(Factura factura) {
        this.factura = factura;
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
        hash += (numFac != null ? numFac.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Detallefactura)) {
            return false;
        }
        Detallefactura other = (Detallefactura) object;
        if ((this.numFac == null && other.numFac != null) || (this.numFac != null && !this.numFac.equals(other.numFac))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "edu.ujmd.ProyectoWeb.Clases.Detallefactura[ numFac=" + numFac + " ]";
    }
    
}
