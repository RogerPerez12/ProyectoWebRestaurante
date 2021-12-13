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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author roger
 */
@Entity
@Table(name = "sucursales")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Sucursales.findAll", query = "SELECT s FROM Sucursales s")
    , @NamedQuery(name = "Sucursales.findByIdSucural", query = "SELECT s FROM Sucursales s WHERE s.idSucural = :idSucural")
    , @NamedQuery(name = "Sucursales.findByCodSucural", query = "SELECT s FROM Sucursales s WHERE s.codSucural = :codSucural")
    , @NamedQuery(name = "Sucursales.findByNombreSucursal", query = "SELECT s FROM Sucursales s WHERE s.nombreSucursal = :nombreSucursal")
    , @NamedQuery(name = "Sucursales.findByDepartamentoSucursal", query = "SELECT s FROM Sucursales s WHERE s.departamentoSucursal = :departamentoSucursal")
    , @NamedQuery(name = "Sucursales.findByTelefonoSucursal", query = "SELECT s FROM Sucursales s WHERE s.telefonoSucursal = :telefonoSucursal")
    , @NamedQuery(name = "Sucursales.findByNumfac", query = "SELECT s FROM Sucursales s WHERE s.numfac = :numfac")})
public class Sucursales implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Id_Sucural")
    private Integer idSucural;
    @Basic(optional = false)
    @Column(name = "Cod_Sucural")
    private int codSucural;
    @Basic(optional = false)
    @Column(name = "Nombre_Sucursal")
    private String nombreSucursal;
    @Column(name = "Departamento_Sucursal")
    private String departamentoSucursal;
    @Column(name = "Telefono_Sucursal")
    private String telefonoSucursal;
    @Basic(optional = false)
    @Column(name = "Num_fac")
    private String numfac;

    public Sucursales() {
    }

    public Sucursales(Integer idSucural) {
        this.idSucural = idSucural;
    }

    public Sucursales(Integer idSucural, int codSucural, String nombreSucursal, String numfac) {
        this.idSucural = idSucural;
        this.codSucural = codSucural;
        this.nombreSucursal = nombreSucursal;
        this.numfac = numfac;
    }

    public Integer getIdSucural() {
        return idSucural;
    }

    public void setIdSucural(Integer idSucural) {
        this.idSucural = idSucural;
    }

    public int getCodSucural() {
        return codSucural;
    }

    public void setCodSucural(int codSucural) {
        this.codSucural = codSucural;
    }

    public String getNombreSucursal() {
        return nombreSucursal;
    }

    public void setNombreSucursal(String nombreSucursal) {
        this.nombreSucursal = nombreSucursal;
    }

    public String getDepartamentoSucursal() {
        return departamentoSucursal;
    }

    public void setDepartamentoSucursal(String departamentoSucursal) {
        this.departamentoSucursal = departamentoSucursal;
    }

    public String getTelefonoSucursal() {
        return telefonoSucursal;
    }

    public void setTelefonoSucursal(String telefonoSucursal) {
        this.telefonoSucursal = telefonoSucursal;
    }

    public String getNumfac() {
        return numfac;
    }

    public void setNumfac(String numfac) {
        this.numfac = numfac;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idSucural != null ? idSucural.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Sucursales)) {
            return false;
        }
        Sucursales other = (Sucursales) object;
        if ((this.idSucural == null && other.idSucural != null) || (this.idSucural != null && !this.idSucural.equals(other.idSucural))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "edu.ujmd.ProyectoWeb.Clases.Sucursales[ idSucural=" + idSucural + " ]";
    }
    
}
