/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.entidades;

import jakarta.persistence.Basic;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlTransient;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author Daniel A. Telles
 */
@Entity
@Table(name = "TBL_CERVEJARIA")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TblCervejaria.findAll", query = "SELECT t FROM TblCervejaria t"),
    @NamedQuery(name = "TblCervejaria.findByIdCervejaria", query = "SELECT t FROM TblCervejaria t WHERE t.idCervejaria = :idCervejaria"),
    @NamedQuery(name = "TblCervejaria.findByCervejaria", query = "SELECT t FROM TblCervejaria t WHERE t.cervejaria = :cervejaria"),
    @NamedQuery(name = "TblCervejaria.findByPais", query = "SELECT t FROM TblCervejaria t WHERE t.pais = :pais")})
public class TblCervejaria implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID_CERVEJARIA")
    private Integer idCervejaria;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 60)
    @Column(name = "CERVEJARIA")
    private String cervejaria;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 60)
    @Column(name = "PAIS")
    private String pais;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idCervejaria")
    private List<TblCerveja> tblCervejaList;

    public TblCervejaria() {
    }

    public TblCervejaria(Integer idCervejaria) {
        this.idCervejaria = idCervejaria;
    }

    public TblCervejaria(Integer idCervejaria, String cervejaria, String pais) {
        this.idCervejaria = idCervejaria;
        this.cervejaria = cervejaria;
        this.pais = pais;
    }

    public Integer getIdCervejaria() {
        return idCervejaria;
    }

    public void setIdCervejaria(Integer idCervejaria) {
        this.idCervejaria = idCervejaria;
    }

    public String getCervejaria() {
        return cervejaria;
    }

    public void setCervejaria(String cervejaria) {
        this.cervejaria = cervejaria;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    @XmlTransient
    public List<TblCerveja> getTblCervejaList() {
        return tblCervejaList;
    }

    public void setTblCervejaList(List<TblCerveja> tblCervejaList) {
        this.tblCervejaList = tblCervejaList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idCervejaria != null ? idCervejaria.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TblCervejaria)) {
            return false;
        }
        TblCervejaria other = (TblCervejaria) object;
        if ((this.idCervejaria == null && other.idCervejaria != null) || (this.idCervejaria != null && !this.idCervejaria.equals(other.idCervejaria))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.TblCervejaria[ idCervejaria=" + idCervejaria + " ]";
    }
    
}
