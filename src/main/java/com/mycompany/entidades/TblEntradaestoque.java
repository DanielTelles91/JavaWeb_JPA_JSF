/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.entidades;

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
import jakarta.validation.constraints.Size;
import jakarta.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

/**
 *
 * @author Daniel A. Telles
 */
@Entity
@Table(name = "TBL_ENTRADAESTOQUE")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TblEntradaestoque.findAll", query = "SELECT t FROM TblEntradaestoque t"),
    @NamedQuery(name = "TblEntradaestoque.findByIdEntradaestoque", query = "SELECT t FROM TblEntradaestoque t WHERE t.idEntradaestoque = :idEntradaestoque"),
    @NamedQuery(name = "TblEntradaestoque.findByIdFuncionario", query = "SELECT t FROM TblEntradaestoque t WHERE t.idFuncionario = :idFuncionario"),
    @NamedQuery(name = "TblEntradaestoque.findByDataModificacao", query = "SELECT t FROM TblEntradaestoque t WHERE t.dataModificacao = :dataModificacao"),
    @NamedQuery(name = "TblEntradaestoque.findByIdEstoque", query = "SELECT t FROM TblEntradaestoque t WHERE t.idEstoque = :idEstoque"),
    @NamedQuery(name = "TblEntradaestoque.findByIdCerveja", query = "SELECT t FROM TblEntradaestoque t WHERE t.idCerveja = :idCerveja"),
    @NamedQuery(name = "TblEntradaestoque.findByAlteracoes", query = "SELECT t FROM TblEntradaestoque t WHERE t.alteracoes = :alteracoes")})
public class TblEntradaestoque implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID_ENTRADAESTOQUE")
    private Integer idEntradaestoque;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_FUNCIONARIO")
    private int idFuncionario;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 60)
    @Column(name = "DATA_MODIFICACAO")
    private String dataModificacao;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_ESTOQUE")
    private int idEstoque;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_CERVEJA")
    private int idCerveja;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 200)
    @Column(name = "ALTERACOES")
    private String alteracoes;

    public TblEntradaestoque() {
    }

    public TblEntradaestoque(Integer idEntradaestoque) {
        this.idEntradaestoque = idEntradaestoque;
    }

    public TblEntradaestoque(Integer idEntradaestoque, int idFuncionario, String dataModificacao, int idEstoque, int idCerveja, String alteracoes) {
        this.idEntradaestoque = idEntradaestoque;
        this.idFuncionario = idFuncionario;
        this.dataModificacao = dataModificacao;
        this.idEstoque = idEstoque;
        this.idCerveja = idCerveja;
        this.alteracoes = alteracoes;
    }

    public Integer getIdEntradaestoque() {
        return idEntradaestoque;
    }

    public void setIdEntradaestoque(Integer idEntradaestoque) {
        this.idEntradaestoque = idEntradaestoque;
    }

    public int getIdFuncionario() {
        return idFuncionario;
    }

    public void setIdFuncionario(int idFuncionario) {
        this.idFuncionario = idFuncionario;
    }

    public String getDataModificacao() {
        return dataModificacao;
    }

    public void setDataModificacao(String dataModificacao) {
        this.dataModificacao = dataModificacao;
    }

    public int getIdEstoque() {
        return idEstoque;
    }

    public void setIdEstoque(int idEstoque) {
        this.idEstoque = idEstoque;
    }

    public int getIdCerveja() {
        return idCerveja;
    }

    public void setIdCerveja(int idCerveja) {
        this.idCerveja = idCerveja;
    }

    public String getAlteracoes() {
        return alteracoes;
    }

    public void setAlteracoes(String alteracoes) {
        this.alteracoes = alteracoes;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idEntradaestoque != null ? idEntradaestoque.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TblEntradaestoque)) {
            return false;
        }
        TblEntradaestoque other = (TblEntradaestoque) object;
        if ((this.idEntradaestoque == null && other.idEntradaestoque != null) || (this.idEntradaestoque != null && !this.idEntradaestoque.equals(other.idEntradaestoque))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.TblEntradaestoque[ idEntradaestoque=" + idEntradaestoque + " ]";
    }
    
}
