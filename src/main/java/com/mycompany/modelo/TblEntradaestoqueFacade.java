/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.modelo;

import com.mycompany.entidades.TblEntradaestoque;
import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

/**
 *
 * @author Daniel A. Telles
 */
@Stateless
public class TblEntradaestoqueFacade extends AbstractFacade<TblEntradaestoque> {

    @PersistenceContext(unitName = "my_persistence_unit")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public TblEntradaestoqueFacade() {
        super(TblEntradaestoque.class);
    }
    
}
