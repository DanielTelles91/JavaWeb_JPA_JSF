/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controle;

import jakarta.enterprise.context.SessionScoped;
import jakarta.faces.application.FacesMessage;
import jakarta.faces.context.FacesContext;
import jakarta.inject.Named;
import java.io.Serializable;
import entidades.TblUsuario;
import test.UsuarioDAO;

/**
 *
 * @author danie
 */
@Named(value = "sessaocontrole")
@SessionScoped

public class SessaoControle implements Serializable {

    private UsuarioDAO usuariodao = new UsuarioDAO();
    private TblUsuario tblusuario = new TblUsuario();


    private String usuario; // 1º o que foi digitado na página de login
    private String senha;

    public String login() {

        tblusuario = usuariodao.getUsuario(usuario, senha); // 2º Busca no banco de dados 

        if (tblusuario == null) {
            FacesContext.getCurrentInstance().addMessage("", new FacesMessage(FacesMessage.SEVERITY_ERROR, "Usuário ou Senha Incorreto", "Usuário ou Senha Incorreto"));
            System.out.println("Usuaário não Encontrado");
        } else {
            FacesContext.getCurrentInstance().addMessage("", new FacesMessage("Usuário logado", "Usuário Logado"));
            System.out.println("Usuário Encontrado: " + tblusuario.getNome());

            return "admin/inicio"; // Redireciona para a tela inicial

        }

        return null; 
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
