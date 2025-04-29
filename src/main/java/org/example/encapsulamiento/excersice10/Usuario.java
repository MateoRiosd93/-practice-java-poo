package org.example.encapsulamiento.excersice10;

public class Usuario {
    private String nombre;
    private String usuario;
    private String correo;

    public void setNombre(String nombre) {
        if (nombre == null || nombre.trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre no puede estar vacío");
        }
        this.nombre = nombre;
    }

    public void setUsuario(String usuario) {
        if (usuario == null || !usuario.trim().isEmpty()) {
            throw new IllegalArgumentException("El usuario debe tener entre 4 y 15 caracteres alfanuméricos");
        }
        this.usuario = usuario;
    }

    // regex para validar un correo @
    public void setCorreo(String correo) {
        if (correo == null || !correo.matches("^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$")) {
            throw new IllegalArgumentException("Correo electrónico no válido");
        }
        this.correo = correo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getUsuario() {
        return usuario;
    }

    public String getCorreo() {
        return correo;
    }
}
