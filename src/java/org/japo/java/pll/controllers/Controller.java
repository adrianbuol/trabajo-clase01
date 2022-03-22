/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.japo.java.pll.controllers;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.japo.java.libraries.UtilesEstaticos;

/**
 *
 * @author Adrián Bueno Olmedo <adrian.bueno.alum@iescamp.es>
 */
@WebServlet(name = "Controller", urlPatterns = {"", "/public/*"})
public class Controller extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        if (request.getPathInfo().equals("/")) {
            // Request > Command
            String cmd = request.getParameter("cmd");

            // Salida
            String out;

            // Discriminar comando
            if (cmd == null) {
//                out = "?cmd=landing";
                out = "WEB-INF/views/visita/visita-landing.jsp";
            } else if (cmd.equals("login")) {
//                out = "?cmd=login";
                out = "WEB-INF/views/usuario/usuario-landing.jsp";
            } else if (cmd.equals("logout")) {
//                out = "?cmd=logout";
                out = "WEB-INF/views/usuario/usuario-logout.jsp";
            } else if (cmd.equals("main")) {
//                out = "?cmd=main";
                out = "WEB-INF/views/main/main-usuario.jsp";
            } else {
                out = "WEB-INF/views/messages/recurso-inaccesible.jsp";
            }

            // Redirección
            RequestDispatcher despachador = request.getRequestDispatcher(out);
            
            // Lanzar
            despachador.forward(request, response);
        } else {
            System.out.println("Segunda Puerta");
            UtilesEstaticos.procesarEstatico(request, response);
        }
    }

// <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
