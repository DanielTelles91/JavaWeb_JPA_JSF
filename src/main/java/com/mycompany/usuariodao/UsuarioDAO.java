/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.usuariodao;

import com.mycompany.entidades.TblUsuario;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.NoResultException;
import jakarta.persistence.Persistence;

/**
 *
 * @author Daniel A. Telles
 */
public class UsuarioDAO {

    private EntityManagerFactory factory = Persistence
            .createEntityManagerFactory("my_persistence_unit");
    private EntityManager em = factory.createEntityManager();

    public TblUsuario getUsuario(String nomeUsuario, String senha) {

        try {
            TblUsuario usuario = (TblUsuario) em
                    .createQuery("SELECT t FROM TblUsuario t WHERE t.nome = :nome and t.senha = :senha").setParameter("nome", nomeUsuario).setParameter("senha", senha).getSingleResult();

            return usuario;
        } catch (NoResultException e) {
            return null;
        }
    }

    public boolean inserirUsuario(TblUsuario usuario) {
        try {
            em.persist(usuario);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean deletarUsuario(TblUsuario usuario) {
        try {
            em.remove(usuario);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

}
