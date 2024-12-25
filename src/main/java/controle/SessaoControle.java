/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controle;

import jakarta.annotation.ManagedBean;
import jakarta.enterprise.context.SessionScoped;
import jakarta.faces.application.FacesMessage;
import jakarta.faces.context.FacesContext;
import jakarta.inject.Named;
import java.io.Serializable;

/**
 *
 * @author danie
 */
@Named(value = "sessaocontrole")
@ManagedBean
@SessionScoped
public class SessaoControle implements Serializable {

    private String usuario;
    private String senha;

    public void login() {

        if (usuario.equalsIgnoreCase("daniel") && senha.equals("tigresa")) {
            FacesContext.getCurrentInstance().addMessage("", new FacesMessage("Usuário logado", "Usuário Logado"));
        } else {
            FacesContext.getCurrentInstance().addMessage("", new FacesMessage(FacesMessage.SEVERITY_ERROR, "Usuário ou Senha Incorreto", "Usuário ou Senha Incorreto"));
        }

    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    
    
    
}
