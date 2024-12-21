/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import jakarta.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

/**
 *
 * @author danie
 */
@Entity
@Table(name = "TBL_LISTADEDESEJOS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TblListadedesejos.findAll", query = "SELECT t FROM TblListadedesejos t"),
    @NamedQuery(name = "TblListadedesejos.findByIdItem", query = "SELECT t FROM TblListadedesejos t WHERE t.idItem = :idItem"),
    @NamedQuery(name = "TblListadedesejos.findByIdCliente", query = "SELECT t FROM TblListadedesejos t WHERE t.idCliente = :idCliente"),
    @NamedQuery(name = "TblListadedesejos.findByIdCerveja", query = "SELECT t FROM TblListadedesejos t WHERE t.idCerveja = :idCerveja")})
public class TblListadedesejos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID_ITEM")
    private Integer idItem;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_CLIENTE")
    private int idCliente;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_CERVEJA")
    private int idCerveja;

    public TblListadedesejos() {
    }

    public TblListadedesejos(Integer idItem) {
        this.idItem = idItem;
    }

    public TblListadedesejos(Integer idItem, int idCliente, int idCerveja) {
        this.idItem = idItem;
        this.idCliente = idCliente;
        this.idCerveja = idCerveja;
    }

    public Integer getIdItem() {
        return idItem;
    }

    public void setIdItem(Integer idItem) {
        this.idItem = idItem;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public int getIdCerveja() {
        return idCerveja;
    }

    public void setIdCerveja(int idCerveja) {
        this.idCerveja = idCerveja;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idItem != null ? idItem.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TblListadedesejos)) {
            return false;
        }
        TblListadedesejos other = (TblListadedesejos) object;
        if ((this.idItem == null && other.idItem != null) || (this.idItem != null && !this.idItem.equals(other.idItem))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.TblListadedesejos[ idItem=" + idItem + " ]";
    }
    
}
