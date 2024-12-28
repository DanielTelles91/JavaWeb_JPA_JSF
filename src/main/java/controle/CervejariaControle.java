/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package controle;

import entidades.TblCervejaria;
import jakarta.ejb.EJB;
import jakarta.inject.Named;
import jakarta.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;
import modelo.TblCervejariaFacade;

/**
 *
 * @author Daniel A. Telles
 */
@Named(value = "cervejariaControle")
@SessionScoped
public class CervejariaControle implements Serializable {
    
    @EJB
    private TblCervejariaFacade tblCervejariaFacade;
    private TblCervejaria tblcervejaria = new TblCervejaria();
    
    public TblCervejaria getTblcervejaria() {
        return tblcervejaria;
    }
    
    public void setTblcervejaria(TblCervejaria tblcervejaria) {
        this.tblcervejaria = tblcervejaria;
    }

    /**
     * Creates a new instance of ProdutosControle
     */
    public CervejariaControle() {
    }
    
    public List<TblCervejaria> findAll() {
        return this.tblCervejariaFacade.findAll();
    }
    
    public String insert() {
        
        this.tblCervejariaFacade.create(tblcervejaria);
        this.tblcervejaria = new TblCervejaria();
        return "exibeCervejaria";
    }
    
    public String Update(TblCervejaria tblCervejaria) {
        
        this.tblcervejaria = tblCervejaria;
        return "updateCervejaria";
        
    }
    
    public String update() {
        
        this.tblCervejariaFacade.edit(tblcervejaria);
        this.tblcervejaria = tblcervejaria;
        return "exibeCervejaria";
    }
    
    public void delete(TblCervejaria tblCervejaria) {
        
        this.tblCervejariaFacade.remove(tblCervejaria);
        
    }
    
}
