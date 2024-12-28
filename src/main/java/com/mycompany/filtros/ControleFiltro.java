/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.filtros;

import com.mycompany.controle.SessaoControle;
import jakarta.inject.Inject;
import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 *
 * @author Daniel A. Telles
 */
@WebFilter(urlPatterns = {"/faces/admin/*", "/login/*"})
public class ControleFiltro implements Filter {

    @Inject
    protected SessaoControle sessao;

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        //    Filter.super.init(filterConfig); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        //   throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody

        System.out.println("Entrando no Filtro");
        if (sessao.getUsuario() == null) { // Se usuário for igual a nulo, é redirecionado para a página de LOGIN
            HttpServletResponse resp = (HttpServletResponse) response;
            resp.sendRedirect("/JavaWeb_JPA_JSF/faces/index.xhtml");
            System.out.println("Usuário não logado, redirecionando para a página de Login");
            return;

        }
     
        System.out.println(sessao.getUsuario());
        chain.doFilter(request, response);

    }

    @Override
    public void destroy() {
        //     Filter.super.destroy(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

}
