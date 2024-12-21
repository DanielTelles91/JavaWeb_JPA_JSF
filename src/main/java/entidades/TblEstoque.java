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
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
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
@Table(name = "TBL_ESTOQUE")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TblEstoque.findAll", query = "SELECT t FROM TblEstoque t"),
    @NamedQuery(name = "TblEstoque.findByIdEstoque", query = "SELECT t FROM TblEstoque t WHERE t.idEstoque = :idEstoque"),
    @NamedQuery(name = "TblEstoque.findByQuantidade", query = "SELECT t FROM TblEstoque t WHERE t.quantidade = :quantidade"),
    @NamedQuery(name = "TblEstoque.findByPorcentagem", query = "SELECT t FROM TblEstoque t WHERE t.porcentagem = :porcentagem"),
    @NamedQuery(name = "TblEstoque.findByEstoqueMinimo", query = "SELECT t FROM TblEstoque t WHERE t.estoqueMinimo = :estoqueMinimo"),
    @NamedQuery(name = "TblEstoque.findByEstoqueMaximo", query = "SELECT t FROM TblEstoque t WHERE t.estoqueMaximo = :estoqueMaximo"),
    @NamedQuery(name = "TblEstoque.findByPrecoAquisicao", query = "SELECT t FROM TblEstoque t WHERE t.precoAquisicao = :precoAquisicao"),
    @NamedQuery(name = "TblEstoque.findByLucro", query = "SELECT t FROM TblEstoque t WHERE t.lucro = :lucro"),
    @NamedQuery(name = "TblEstoque.findByDisponibilidade", query = "SELECT t FROM TblEstoque t WHERE t.disponibilidade = :disponibilidade")})
public class TblEstoque implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID_ESTOQUE")
    private Integer idEstoque;
    @Basic(optional = false)
    @NotNull
    @Column(name = "QUANTIDADE")
    private int quantidade;
    @Basic(optional = false)
    @NotNull
    @Column(name = "PORCENTAGEM")
    private double porcentagem;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ESTOQUE_MINIMO")
    private int estoqueMinimo;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ESTOQUE_MAXIMO")
    private int estoqueMaximo;
    @Basic(optional = false)
    @NotNull
    @Column(name = "PRECO_AQUISICAO")
    private double precoAquisicao;
    @Basic(optional = false)
    @NotNull
    @Column(name = "LUCRO")
    private double lucro;
    @Basic(optional = false)
    @NotNull
    @Column(name = "DISPONIBILIDADE")
    private int disponibilidade;
    @JoinColumn(name = "ID_CERVEJA", referencedColumnName = "ID_CERVEJA")
    @ManyToOne(optional = false)
    private TblCerveja idCerveja;

    public TblEstoque() {
    }

    public TblEstoque(Integer idEstoque) {
        this.idEstoque = idEstoque;
    }

    public TblEstoque(Integer idEstoque, int quantidade, double porcentagem, int estoqueMinimo, int estoqueMaximo, double precoAquisicao, double lucro, int disponibilidade) {
        this.idEstoque = idEstoque;
        this.quantidade = quantidade;
        this.porcentagem = porcentagem;
        this.estoqueMinimo = estoqueMinimo;
        this.estoqueMaximo = estoqueMaximo;
        this.precoAquisicao = precoAquisicao;
        this.lucro = lucro;
        this.disponibilidade = disponibilidade;
    }

    public Integer getIdEstoque() {
        return idEstoque;
    }

    public void setIdEstoque(Integer idEstoque) {
        this.idEstoque = idEstoque;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getPorcentagem() {
        return porcentagem;
    }

    public void setPorcentagem(double porcentagem) {
        this.porcentagem = porcentagem;
    }

    public int getEstoqueMinimo() {
        return estoqueMinimo;
    }

    public void setEstoqueMinimo(int estoqueMinimo) {
        this.estoqueMinimo = estoqueMinimo;
    }

    public int getEstoqueMaximo() {
        return estoqueMaximo;
    }

    public void setEstoqueMaximo(int estoqueMaximo) {
        this.estoqueMaximo = estoqueMaximo;
    }

    public double getPrecoAquisicao() {
        return precoAquisicao;
    }

    public void setPrecoAquisicao(double precoAquisicao) {
        this.precoAquisicao = precoAquisicao;
    }

    public double getLucro() {
        return lucro;
    }

    public void setLucro(double lucro) {
        this.lucro = lucro;
    }

    public int getDisponibilidade() {
        return disponibilidade;
    }

    public void setDisponibilidade(int disponibilidade) {
        this.disponibilidade = disponibilidade;
    }

    public TblCerveja getIdCerveja() {
        return idCerveja;
    }

    public void setIdCerveja(TblCerveja idCerveja) {
        this.idCerveja = idCerveja;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idEstoque != null ? idEstoque.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TblEstoque)) {
            return false;
        }
        TblEstoque other = (TblEstoque) object;
        if ((this.idEstoque == null && other.idEstoque != null) || (this.idEstoque != null && !this.idEstoque.equals(other.idEstoque))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.TblEstoque[ idEstoque=" + idEstoque + " ]";
    }
    
}
