package com.company;

import java.util.Comparator;
import java.util.Objects;

public class Alumno implements Comparable {
    private String nombre;
    private String apellidos;
    private String dirreccion;
    private String dni;
    private String email;
    private String curso;
    private boolean dual;

    public Alumno(String nombre, String apellidos, String dirreccion, String dni, String email, String curso, boolean dual) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dirreccion = dirreccion;
        this.dni = dni;
        this.email = email;
        this.curso = curso;
        this.dual = dual;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDirreccion() {
        return dirreccion;
    }

    public void setDirreccion(String dirreccion) {
        this.dirreccion = dirreccion;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public boolean isDual() {
        return dual;
    }

    public void setDual(boolean dual) {
        this.dual = dual;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Alumno alumno = (Alumno) o;
        return dual == alumno.dual && Objects.equals(nombre, alumno.nombre) && Objects.equals(apellidos, alumno.apellidos) && Objects.equals(dirreccion, alumno.dirreccion) && dni.equals(alumno.dni) && Objects.equals(email, alumno.email) && Objects.equals(curso, alumno.curso);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, apellidos, dirreccion, dni, email, curso, dual);
    }

    @Override
    public int compareTo(Object o) {
        Alumno alumno = (Alumno) o;
        return getDni().compareTo(alumno.getDni());
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", dirreccion='" + dirreccion + '\'' +
                ", dni='" + dni + '\'' +
                ", email='" + email + '\'' +
                ", curso='" + curso + '\'' +
                ", dual=" + dual +
                '}';
    }
}
