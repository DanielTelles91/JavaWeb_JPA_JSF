/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package com.mycompany.controle;

import com.mycompany.entidades.TblUsuario;
import jakarta.ejb.EJB;
import jakarta.inject.Named;
import jakarta.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;
import com.mycompany.modelo.TblUsuarioFacade;

/**
 *
 * @author Daniel A. Telles
 */
@Named(value = "usuarioControle")
@SessionScoped
public class UsuarioControle implements Serializable {

    @EJB
    private TblUsuarioFacade tblUsuarioFacade;
    private TblUsuario tblusuario = new TblUsuario();

     public TblUsuario getTblUsuario() {
        return tblusuario;
    }
    /**
     * Creates a new instance of UsuarioControle
     */
    public UsuarioControle() {
    }

    public List<TblUsuario> findAll() {
        return this.tblUsuarioFacade.findAll();
    }
    
  
    
}
