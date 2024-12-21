/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import jakarta.persistence.Basic;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
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
 * @author danie
 */
@Entity
@Table(name = "TBL_CERVEJA")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TblCerveja.findAll", query = "SELECT t FROM TblCerveja t"),
    @NamedQuery(name = "TblCerveja.findByIdCerveja", query = "SELECT t FROM TblCerveja t WHERE t.idCerveja = :idCerveja"),
    @NamedQuery(name = "TblCerveja.findByRotulo", query = "SELECT t FROM TblCerveja t WHERE t.rotulo = :rotulo"),
    @NamedQuery(name = "TblCerveja.findByPreco", query = "SELECT t FROM TblCerveja t WHERE t.preco = :preco"),
    @NamedQuery(name = "TblCerveja.findByVolume", query = "SELECT t FROM TblCerveja t WHERE t.volume = :volume"),
    @NamedQuery(name = "TblCerveja.findByTeor", query = "SELECT t FROM TblCerveja t WHERE t.teor = :teor"),
    @NamedQuery(name = "TblCerveja.findByCor", query = "SELECT t FROM TblCerveja t WHERE t.cor = :cor"),
    @NamedQuery(name = "TblCerveja.findByTemperatura", query = "SELECT t FROM TblCerveja t WHERE t.temperatura = :temperatura"),
    @NamedQuery(name = "TblCerveja.findByFamiliaEEstilo", query = "SELECT t FROM TblCerveja t WHERE t.familiaEEstilo = :familiaEEstilo"),
    @NamedQuery(name = "TblCerveja.findByDescricao", query = "SELECT t FROM TblCerveja t WHERE t.descricao = :descricao"),
    @NamedQuery(name = "TblCerveja.findBySabor", query = "SELECT t FROM TblCerveja t WHERE t.sabor = :sabor"),
    @NamedQuery(name = "TblCerveja.findByImagem1", query = "SELECT t FROM TblCerveja t WHERE t.imagem1 = :imagem1"),
    @NamedQuery(name = "TblCerveja.findByImagem2", query = "SELECT t FROM TblCerveja t WHERE t.imagem2 = :imagem2"),
    @NamedQuery(name = "TblCerveja.findByImagem3", query = "SELECT t FROM TblCerveja t WHERE t.imagem3 = :imagem3")})
public class TblCerveja implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID_CERVEJA")
    private Integer idCerveja;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 60)
    @Column(name = "ROTULO")
    private String rotulo;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 6)
    @Column(name = "PRECO")
    private String preco;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 5)
    @Column(name = "VOLUME")
    private String volume;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 3)
    @Column(name = "TEOR")
    private String teor;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 7)
    @Column(name = "COR")
    private String cor;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 6)
    @Column(name = "TEMPERATURA")
    private String temperatura;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 60)
    @Column(name = "FAMILIA_E_ESTILO")
    private String familiaEEstilo;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 150)
    @Column(name = "DESCRICAO")
    private String descricao;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 150)
    @Column(name = "SABOR")
    private String sabor;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 60)
    @Column(name = "IMAGEM_1")
    private String imagem1;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 60)
    @Column(name = "IMAGEM_2")
    private String imagem2;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 60)
    @Column(name = "IMAGEM_3")
    private String imagem3;
    @JoinColumn(name = "ID_CERVEJARIA", referencedColumnName = "ID_CERVEJARIA")
    @ManyToOne(optional = false)
    private TblCervejaria idCervejaria;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idCerveja")
    private List<TblEstoque> tblEstoqueList;

    public TblCerveja() {
    }

    public TblCerveja(Integer idCerveja) {
        this.idCerveja = idCerveja;
    }

    public TblCerveja(Integer idCerveja, String rotulo, String preco, String volume, String teor, String cor, String temperatura, String familiaEEstilo, String descricao, String sabor, String imagem1, String imagem2, String imagem3) {
        this.idCerveja = idCerveja;
        this.rotulo = rotulo;
        this.preco = preco;
        this.volume = volume;
        this.teor = teor;
        this.cor = cor;
        this.temperatura = temperatura;
        this.familiaEEstilo = familiaEEstilo;
        this.descricao = descricao;
        this.sabor = sabor;
        this.imagem1 = imagem1;
        this.imagem2 = imagem2;
        this.imagem3 = imagem3;
    }

    public Integer getIdCerveja() {
        return idCerveja;
    }

    public void setIdCerveja(Integer idCerveja) {
        this.idCerveja = idCerveja;
    }

    public String getRotulo() {
        return rotulo;
    }

    public void setRotulo(String rotulo) {
        this.rotulo = rotulo;
    }

    public String getPreco() {
        return preco;
    }

    public void setPreco(String preco) {
        this.preco = preco;
    }

    public String getVolume() {
        return volume;
    }

    public void setVolume(String volume) {
        this.volume = volume;
    }

    public String getTeor() {
        return teor;
    }

    public void setTeor(String teor) {
        this.teor = teor;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(String temperatura) {
        this.temperatura = temperatura;
    }

    public String getFamiliaEEstilo() {
        return familiaEEstilo;
    }

    public void setFamiliaEEstilo(String familiaEEstilo) {
        this.familiaEEstilo = familiaEEstilo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    public String getImagem1() {
        return imagem1;
    }

    public void setImagem1(String imagem1) {
        this.imagem1 = imagem1;
    }

    public String getImagem2() {
        return imagem2;
    }

    public void setImagem2(String imagem2) {
        this.imagem2 = imagem2;
    }

    public String getImagem3() {
        return imagem3;
    }

    public void setImagem3(String imagem3) {
        this.imagem3 = imagem3;
    }

    public TblCervejaria getIdCervejaria() {
        return idCervejaria;
    }

    public void setIdCervejaria(TblCervejaria idCervejaria) {
        this.idCervejaria = idCervejaria;
    }

    @XmlTransient
    public List<TblEstoque> getTblEstoqueList() {
        return tblEstoqueList;
    }

    public void setTblEstoqueList(List<TblEstoque> tblEstoqueList) {
        this.tblEstoqueList = tblEstoqueList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idCerveja != null ? idCerveja.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TblCerveja)) {
            return false;
        }
        TblCerveja other = (TblCerveja) object;
        if ((this.idCerveja == null && other.idCerveja != null) || (this.idCerveja != null && !this.idCerveja.equals(other.idCerveja))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.TblCerveja[ idCerveja=" + idCerveja + " ]";
    }
    
}
