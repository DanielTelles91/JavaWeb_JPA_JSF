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
import jakarta.validation.constraints.Size;
import jakarta.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

/**
 *
 * @author danie
 */
@Entity
@Table(name = "ENDERECOS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Enderecos.findAll", query = "SELECT e FROM Enderecos e"),
    @NamedQuery(name = "Enderecos.findByIdEnderecos", query = "SELECT e FROM Enderecos e WHERE e.idEnderecos = :idEnderecos"),
    @NamedQuery(name = "Enderecos.findByCep", query = "SELECT e FROM Enderecos e WHERE e.cep = :cep"),
    @NamedQuery(name = "Enderecos.findByLogradouro", query = "SELECT e FROM Enderecos e WHERE e.logradouro = :logradouro"),
    @NamedQuery(name = "Enderecos.findByTipoLogradouro", query = "SELECT e FROM Enderecos e WHERE e.tipoLogradouro = :tipoLogradouro"),
    @NamedQuery(name = "Enderecos.findByLogradouroNumero", query = "SELECT e FROM Enderecos e WHERE e.logradouroNumero = :logradouroNumero"),
    @NamedQuery(name = "Enderecos.findByBairro", query = "SELECT e FROM Enderecos e WHERE e.bairro = :bairro"),
    @NamedQuery(name = "Enderecos.findByCidade", query = "SELECT e FROM Enderecos e WHERE e.cidade = :cidade"),
    @NamedQuery(name = "Enderecos.findByEstado", query = "SELECT e FROM Enderecos e WHERE e.estado = :estado"),
    @NamedQuery(name = "Enderecos.findByComplemento", query = "SELECT e FROM Enderecos e WHERE e.complemento = :complemento"),
    @NamedQuery(name = "Enderecos.findByCpf", query = "SELECT e FROM Enderecos e WHERE e.cpf = :cpf")})
public class Enderecos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID_ENDERECOS")
    private Long idEnderecos;
    @Size(max = 10)
    @Column(name = "CEP")
    private String cep;
    @Size(max = 60)
    @Column(name = "LOGRADOURO")
    private String logradouro;
    @Size(max = 60)
    @Column(name = "TIPO_LOGRADOURO")
    private String tipoLogradouro;
    @Size(max = 6)
    @Column(name = "LOGRADOURO_NUMERO")
    private String logradouroNumero;
    @Size(max = 60)
    @Column(name = "BAIRRO")
    private String bairro;
    @Size(max = 60)
    @Column(name = "CIDADE")
    private String cidade;
    @Size(max = 60)
    @Column(name = "ESTADO")
    private String estado;
    @Size(max = 60)
    @Column(name = "COMPLEMENTO")
    private String complemento;
    @Size(max = 14)
    @Column(name = "CPF")
    private String cpf;

    public Enderecos() {
    }

    public Enderecos(Long idEnderecos) {
        this.idEnderecos = idEnderecos;
    }

    public Long getIdEnderecos() {
        return idEnderecos;
    }

    public void setIdEnderecos(Long idEnderecos) {
        this.idEnderecos = idEnderecos;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getTipoLogradouro() {
        return tipoLogradouro;
    }

    public void setTipoLogradouro(String tipoLogradouro) {
        this.tipoLogradouro = tipoLogradouro;
    }

    public String getLogradouroNumero() {
        return logradouroNumero;
    }

    public void setLogradouroNumero(String logradouroNumero) {
        this.logradouroNumero = logradouroNumero;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idEnderecos != null ? idEnderecos.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Enderecos)) {
            return false;
        }
        Enderecos other = (Enderecos) object;
        if ((this.idEnderecos == null && other.idEnderecos != null) || (this.idEnderecos != null && !this.idEnderecos.equals(other.idEnderecos))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.Enderecos[ idEnderecos=" + idEnderecos + " ]";
    }
    
}
