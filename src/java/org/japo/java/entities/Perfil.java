/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.japo.java.entities;

import org.japo.java.libraries.UtilesPerfiles;

/**
 *
 * @author Adrián Bueno Olmedo <adrian.bueno.alum@iescamp.es>
 */
public final class Perfil {

    //Campos
    private int id;
    private String nombre;
    private String info;

    public Perfil() {
        this.id = UtilesPerfiles.DEF_ID;
        this.nombre = UtilesPerfiles.DEF_NOMBRE;
        this.info = UtilesPerfiles.DEF_INFO;

    }

    public Perfil(int id, String nombre, String info) {
        if (validarId()) {
            this.id = id;
        } else {
            this.id = UtilesPerfiles.DEF_ID;
        }
        if (validarNombre()) {
            this.nombre = nombre;
        } else {
            this.nombre = UtilesPerfiles.DEF_NOMBRE;
        }
        if (validarInfo()) {
            this.info = info;
        } else {
            this.info = UtilesPerfiles.DEF_INFO;
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        if (validarId()) {
            this.id = id;
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (validarNombre()) {
            this.nombre = nombre;
        }
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        if (validarInfo()) {
            this.info = info;
        }
    }

    private boolean validarId() {
        return UtilesPerfiles.validarId(id);
    }

    private boolean validarNombre() {
        return UtilesPerfiles.validarNombre(nombre);
    }

    private boolean validarInfo() {
        return UtilesPerfiles.validarInfo(info);
    }

}
