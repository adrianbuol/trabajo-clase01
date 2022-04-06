package org.japo.java.entities;

import java.io.Serializable;
import java.util.Objects;
import org.japo.java.libraries.UtilesEntidad;

public final class Usuario implements Serializable {

    private int id;
    private String user;
    private String pass;
    private String avatar;

    public Usuario() {
        id = UtilesEntidad.DEF_ID;
        user = UtilesEntidad.DEF_USER;
        pass = UtilesEntidad.DEF_PASS;
        avatar = UtilesEntidad.DEF_AVATAR;
    }

    public Usuario(int id, String user, String pass, String avatar) {
        if (validarID()) {
            this.id = id;
        } else {
            this.id = UtilesEntidad.DEF_ID;
        }
        if (validarUser()) {
            this.user = user;
        } else {
            this.user = UtilesEntidad.DEF_USER;
        }
        if (validarPass()) {
            this.pass = pass;
        } else {
            this.pass = UtilesEntidad.DEF_PASS;
        }
        if (validarAvatar()) {
            this.avatar = avatar;
        } else {
            this.avatar = UtilesEntidad.DEF_AVATAR;
        }

        this.user = user;
        this.pass = pass;
        this.avatar = avatar;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    private boolean validarID() {
        return UtilesEntidad.validarID(id);
    }

    private boolean validarUser() {
        return UtilesEntidad.validarUser(user);
    }

    private boolean validarPass() {
        return UtilesEntidad.validarPass(pass);
    }

    private boolean validarAvatar() {
        return UtilesEntidad.validarAvatar(avatar);
    }

    @Override
    public boolean equals(Object o) {
        boolean testOK = false;
        if (o instanceof Usuario) {
            Usuario u = (Usuario) o;
            testOK = id == u.getId()
                    && user.equals(u.getUser())
                    && pass.equals(u.getPass())
                    && avatar.equals(u.getAvatar());
        }
        return testOK;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 67 * hash + this.id;
        hash = 67 * hash + Objects.hashCode(this.user);
        hash = 67 * hash + Objects.hashCode(this.pass);
        hash = 67 * hash + Objects.hashCode(this.avatar);
        return hash;
    }

}
