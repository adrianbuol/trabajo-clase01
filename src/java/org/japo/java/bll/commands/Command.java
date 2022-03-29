/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.japo.java.bll.commands;

import javax.servlet.ServletConfig;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Adrián Bueno Olmedo <adrian.bueno.alum@iescamp.es>
 */
public abstract class Command implements ICommand {

    ServletConfig config;
    HttpServletRequest request;
    HttpServletResponse response;

    @Override
    public void init(
            ServletConfig config,
            HttpServletRequest request,
            HttpServletResponse response) {
        this.config = config;
        this.request = request;
        this.response = response;
    }

    protected void forward(String out) {
        if (out.startsWith("controller")) {
            // Redirección de Comando
        } else {
            // Redirección de Vista
        }
    }
}
