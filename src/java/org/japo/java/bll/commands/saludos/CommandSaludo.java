/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.japo.java.bll.commands.saludos;

import org.japo.java.bll.commands.Command;
import org.japo.java.bll.commands.ICommand;

/**
 *
 * @author Adrián Bueno Olmedo <adrian.bueno.alum@iescamp.es>
 */
public class CommandSaludo extends Command {

    @Override
    public void process() {
        // Salida
        String out = "saludo/saludo";
        
        // Redirección
        
    }

    @Override
    public ICommand obtenerComando(String cmdName) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
