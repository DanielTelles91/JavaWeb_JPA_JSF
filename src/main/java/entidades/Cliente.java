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
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import jakarta.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author danie
 */
@Entity
@Table(name = "CLIENTE")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Cliente.findAll", query = "SELECT c FROM Cliente c"),
    @NamedQuery(name = "Cliente.findByIdCliente", query = "SELECT c FROM Cliente c WHERE c.idCliente = :idCliente"),
    @NamedQuery(name = "Cliente.findByFirstName", query = "SELECT c FROM Cliente c WHERE c.firstName = :firstName"),
    @NamedQuery(name = "Cliente.findByLastName", query = "SELECT c FROM Cliente c WHERE c.lastName = :lastName"),
    @NamedQuery(name = "Cliente.findByEmail", query = "SELECT c FROM Cliente c WHERE c.email = :email"),
    @NamedQuery(name = "Cliente.findByTelefone", query = "SELECT c FROM Cliente c WHERE c.telefone = :telefone"),
    @NamedQuery(name = "Cliente.findByCpf", query = "SELECT c FROM Cliente c WHERE c.cpf = :cpf"),
    @NamedQuery(name = "Cliente.findBySenha", query = "SELECT c FROM Cliente c WHERE c.senha = :senha"),
    @NamedQuery(name = "Cliente.findBySexo", query = "SELECT c FROM Cliente c WHERE c.sexo = :sexo"),
    @NamedQuery(name = "Cliente.findByDataNasciCliente", query = "SELECT c FROM Cliente c WHERE c.dataNasciCliente = :dataNasciCliente")})
public class Cliente implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID_CLIENTE")
    private Long idCliente;
    @Size(max = 60)
    @Column(name = "FIRST_NAME")
    private String firstName;
    @Size(max = 60)
    @Column(name = "LAST_NAME")
    private String lastName;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Invalid email")//if the field contains email address consider using this annotation to enforce field validation
    @Size(max = 80)
    @Column(name = "EMAIL")
    private String email;
    @Size(max = 64)
    @Column(name = "TELEFONE")
    private String telefone;
    @Size(max = 14)
    @Column(name = "CPF")
    private String cpf;
    @Size(max = 64)
    @Column(name = "SENHA")
    private String senha;
    @Size(max = 1)
    @Column(name = "SEXO")
    private String sexo;
    @Basic(optional = false)
    @NotNull
    @Column(name = "DATA_NASCI_CLIENTE")
    @Temporal(TemporalType.DATE)
    private Date dataNasciCliente;

    public Cliente() {
    }

    public Cliente(Long idCliente) {
        this.idCliente = idCliente;
    }

    public Cliente(Long idCliente, Date dataNasciCliente) {
        this.idCliente = idCliente;
        this.dataNasciCliente = dataNasciCliente;
    }

    public Long getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Long idCliente) {
        this.idCliente = idCliente;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Date getDataNasciCliente() {
        return dataNasciCliente;
    }

    public void setDataNasciCliente(Date dataNasciCliente) {
        this.dataNasciCliente = dataNasciCliente;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idCliente != null ? idCliente.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cliente)) {
            return false;
        }
        Cliente other = (Cliente) object;
        if ((this.idCliente == null && other.idCliente != null) || (this.idCliente != null && !this.idCliente.equals(other.idCliente))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.Cliente[ idCliente=" + idCliente + " ]";
    }
    
}
