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
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import jakarta.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author Daniel A. Telles
 */
@Entity
@Table(name = "TBL_SAIDAESTOQUE")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TblSaidaestoque.findAll", query = "SELECT t FROM TblSaidaestoque t"),
    @NamedQuery(name = "TblSaidaestoque.findByIdSaidaestoque", query = "SELECT t FROM TblSaidaestoque t WHERE t.idSaidaestoque = :idSaidaestoque"),
    @NamedQuery(name = "TblSaidaestoque.findByOrdemCompra", query = "SELECT t FROM TblSaidaestoque t WHERE t.ordemCompra = :ordemCompra"),
    @NamedQuery(name = "TblSaidaestoque.findByDataCompra", query = "SELECT t FROM TblSaidaestoque t WHERE t.dataCompra = :dataCompra"),
    @NamedQuery(name = "TblSaidaestoque.findByIdCliente", query = "SELECT t FROM TblSaidaestoque t WHERE t.idCliente = :idCliente"),
    @NamedQuery(name = "TblSaidaestoque.findByFormaPagamento", query = "SELECT t FROM TblSaidaestoque t WHERE t.formaPagamento = :formaPagamento"),
    @NamedQuery(name = "TblSaidaestoque.findByFrete", query = "SELECT t FROM TblSaidaestoque t WHERE t.frete = :frete"),
    @NamedQuery(name = "TblSaidaestoque.findByIdCerveja", query = "SELECT t FROM TblSaidaestoque t WHERE t.idCerveja = :idCerveja"),
    @NamedQuery(name = "TblSaidaestoque.findByQuantidade", query = "SELECT t FROM TblSaidaestoque t WHERE t.quantidade = :quantidade"),
    @NamedQuery(name = "TblSaidaestoque.findByValor", query = "SELECT t FROM TblSaidaestoque t WHERE t.valor = :valor")})
public class TblSaidaestoque implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID_SAIDAESTOQUE")
    private Integer idSaidaestoque;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ORDEM_COMPRA")
    private int ordemCompra;
    @Basic(optional = false)
    @NotNull
    @Column(name = "DATA_COMPRA")
    @Temporal(TemporalType.DATE)
    private Date dataCompra;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_CLIENTE")
    private int idCliente;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FORMA_PAGAMENTO")
    private int formaPagamento;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 8)
    @Column(name = "FRETE")
    private String frete;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_CERVEJA")
    private int idCerveja;
    @Basic(optional = false)
    @NotNull
    @Column(name = "QUANTIDADE")
    private int quantidade;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 6)
    @Column(name = "VALOR")
    private String valor;

    public TblSaidaestoque() {
    }

    public TblSaidaestoque(Integer idSaidaestoque) {
        this.idSaidaestoque = idSaidaestoque;
    }

    public TblSaidaestoque(Integer idSaidaestoque, int ordemCompra, Date dataCompra, int idCliente, int formaPagamento, String frete, int idCerveja, int quantidade, String valor) {
        this.idSaidaestoque = idSaidaestoque;
        this.ordemCompra = ordemCompra;
        this.dataCompra = dataCompra;
        this.idCliente = idCliente;
        this.formaPagamento = formaPagamento;
        this.frete = frete;
        this.idCerveja = idCerveja;
        this.quantidade = quantidade;
        this.valor = valor;
    }

    public Integer getIdSaidaestoque() {
        return idSaidaestoque;
    }

    public void setIdSaidaestoque(Integer idSaidaestoque) {
        this.idSaidaestoque = idSaidaestoque;
    }

    public int getOrdemCompra() {
        return ordemCompra;
    }

    public void setOrdemCompra(int ordemCompra) {
        this.ordemCompra = ordemCompra;
    }

    public Date getDataCompra() {
        return dataCompra;
    }

    public void setDataCompra(Date dataCompra) {
        this.dataCompra = dataCompra;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public int getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(int formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public String getFrete() {
        return frete;
    }

    public void setFrete(String frete) {
        this.frete = frete;
    }

    public int getIdCerveja() {
        return idCerveja;
    }

    public void setIdCerveja(int idCerveja) {
        this.idCerveja = idCerveja;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idSaidaestoque != null ? idSaidaestoque.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TblSaidaestoque)) {
            return false;
        }
        TblSaidaestoque other = (TblSaidaestoque) object;
        if ((this.idSaidaestoque == null && other.idSaidaestoque != null) || (this.idSaidaestoque != null && !this.idSaidaestoque.equals(other.idSaidaestoque))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.TblSaidaestoque[ idSaidaestoque=" + idSaidaestoque + " ]";
    }
    
}
