/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.controle;

import com.mycompany.usuariodao.UsuarioDAO;
import com.mycompany.entidades.TblUsuario;
import com.mycompany.ferramentas.SHA1;
import jakarta.enterprise.context.SessionScoped;
import jakarta.faces.application.FacesMessage;
import jakarta.faces.context.FacesContext;
import jakarta.inject.Named;
import java.io.Serializable;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;

/**
 *
 * @author Daniel A. Telles
 */
@Named(value = "sessaocontrole")
@SessionScoped

public class SessaoControle implements Serializable {

    private UsuarioDAO usuariodao = new UsuarioDAO();
    private TblUsuario tblusuario = new TblUsuario();
    private SHA1 sha1 = new SHA1();

    private String usuario, senha, senhaCodificado; // 1º o que foi digitado na página de login

    public String login() throws NoSuchAlgorithmException, InvalidKeySpecException {

        senhaCodificado = String.valueOf(sha1.gerarHashSenhaPBKDF2(senha)); // 2º Envia para o método gerarHashSenhaPBKDF2 a senha digitada e gera a senha codificada.

        tblusuario = usuariodao.getUsuario(usuario, senhaCodificado); // 3º Busca no banco de dados o usuário e senha codificado

        if (tblusuario == null) { // 4º Caso retorne nulo, o usuário não existe no BD.
            FacesContext.getCurrentInstance().addMessage("", new FacesMessage(FacesMessage.SEVERITY_ERROR, "Usuário ou Senha Incorreto", "Usuário ou Senha Incorreto"));
            System.out.println("Usuaário não Encontrado");
        } else { // 4.1º Caso não retorne nulo, o usuário existe no BD.
            FacesContext.getCurrentInstance().addMessage("", new FacesMessage("Usuário logado", "Usuário Logado"));
            System.out.println("Usuário Encontrado: " + tblusuario.getNome());

            return "admin/inicio"; //5º Redireciona para a Tela Inicial

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
