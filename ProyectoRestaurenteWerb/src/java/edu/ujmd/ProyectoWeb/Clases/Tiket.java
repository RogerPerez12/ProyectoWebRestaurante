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
@Table(name = "tiket")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Tiket.findAll", query = "SELECT t FROM Tiket t")
    , @NamedQuery(name = "Tiket.findByNumTik", query = "SELECT t FROM Tiket t WHERE t.numTik = :numTik")
    , @NamedQuery(name = "Tiket.findByPreTot", query = "SELECT t FROM Tiket t WHERE t.preTot = :preTot")
    , @NamedQuery(name = "Tiket.findByFecha", query = "SELECT t FROM Tiket t WHERE t.fecha = :fecha")})
public class Tiket implements Serializable {

    @OneToOne(cascade = CascadeType.ALL, mappedBy = "tiket")
    private Detalletiket detalletiket;

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "num_tik")
    private String numTik;
    @Basic(optional = false)
    @Column(name = "pre_tot")
    private String preTot;
    @Basic(optional = false)
    @Column(name = "fecha")
    private String fecha;
    @JoinColumn(name = "cod_cli", referencedColumnName = "cod_cli")
    @ManyToOne(optional = false)
    private Cliente codCli;

    public Tiket() {
    }

    public Tiket(String numTik) {
        this.numTik = numTik;
    }

    public Tiket(String numTik, String preTot, String fecha) {
        this.numTik = numTik;
        this.preTot = preTot;
        this.fecha = fecha;
    }

    public String getNumTik() {
        return numTik;
    }

    public void setNumTik(String numTik) {
        this.numTik = numTik;
    }

    public String getPreTot() {
        return preTot;
    }

    public void setPreTot(String preTot) {
        this.preTot = preTot;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
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
        hash += (numTik != null ? numTik.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tiket)) {
            return false;
        }
        Tiket other = (Tiket) object;
        if ((this.numTik == null && other.numTik != null) || (this.numTik != null && !this.numTik.equals(other.numTik))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "edu.ujmd.ProyectoWeb.Clases.Tiket[ numTik=" + numTik + " ]";
    }

    public Detalletiket getDetalletiket() {
        return detalletiket;
    }

    public void setDetalletiket(Detalletiket detalletiket) {
        this.detalletiket = detalletiket;
    }
    
}
