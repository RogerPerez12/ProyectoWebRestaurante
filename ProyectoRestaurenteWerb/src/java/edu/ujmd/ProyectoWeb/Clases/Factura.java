/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ujmd.ProyectoWeb.Clases;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
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
@Table(name = "factura")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Factura.findAll", query = "SELECT f FROM Factura f")
    , @NamedQuery(name = "Factura.findByNumFac", query = "SELECT f FROM Factura f WHERE f.numFac = :numFac")
    , @NamedQuery(name = "Factura.findBySubtotal", query = "SELECT f FROM Factura f WHERE f.subtotal = :subtotal")
    , @NamedQuery(name = "Factura.findByImpuesto", query = "SELECT f FROM Factura f WHERE f.impuesto = :impuesto")
    , @NamedQuery(name = "Factura.findByTotal", query = "SELECT f FROM Factura f WHERE f.total = :total")
    , @NamedQuery(name = "Factura.findByFecFac", query = "SELECT f FROM Factura f WHERE f.fecFac = :fecFac")})
public class Factura implements Serializable {

    @OneToOne(cascade = CascadeType.ALL, mappedBy = "factura")
    private Detallefactura detallefactura;

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "num_fac")
    private String numFac;
    @Basic(optional = false)
    @Column(name = "subtotal")
    private String subtotal;
    @Basic(optional = false)
    @Column(name = "Impuesto")
    private String impuesto;
    @Basic(optional = false)
    @Column(name = "total")
    private String total;
    @Basic(optional = false)
    @Column(name = "fec_fac")
    private String fecFac;
    @JoinColumn(name = "cod_cli", referencedColumnName = "cod_cli")
    @ManyToOne(optional = false)
    private Cliente codCli;

    public Factura() {
    }

    public Factura(String numFac) {
        this.numFac = numFac;
    }

    public Factura(String numFac, String subtotal, String impuesto, String total, String fecFac) {
        this.numFac = numFac;
        this.subtotal = subtotal;
        this.impuesto = impuesto;
        this.total = total;
        this.fecFac = fecFac;
    }

    public String getNumFac() {
        return numFac;
    }

    public void setNumFac(String numFac) {
        this.numFac = numFac;
    }

    public String getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(String subtotal) {
        this.subtotal = subtotal;
    }

    public String getImpuesto() {
        return impuesto;
    }

    public void setImpuesto(String impuesto) {
        this.impuesto = impuesto;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public String getFecFac() {
        return fecFac;
    }

    public void setFecFac(String fecFac) {
        this.fecFac = fecFac;
    }

    public Cliente getCodCli() {
        return codCli;
    }

    public void setCodCli(Cliente codCli) {
        this.codCli = codCli;
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
        if (!(object instanceof Factura)) {
            return false;
        }
        Factura other = (Factura) object;
        if ((this.numFac == null && other.numFac != null) || (this.numFac != null && !this.numFac.equals(other.numFac))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "edu.ujmd.ProyectoWeb.Clases.Factura[ numFac=" + numFac + " ]";
    }

    public Detallefactura getDetallefactura() {
        return detallefactura;
    }

    public void setDetallefactura(Detallefactura detallefactura) {
        this.detallefactura = detallefactura;
    }
    
}
