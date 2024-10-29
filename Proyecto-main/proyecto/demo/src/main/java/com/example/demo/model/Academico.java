package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "academico")
public class Academico {
    private int id_academico;
    private String nom_academico;
    private String correo_ubb;
    private String contrasena_academico;
    private String departamento;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getId_academico() {
        return id_academico;
    }
    public void setId_academico(int id_academico) {
        this.id_academico = id_academico;
    }
    public String getNom_academico() {
        return nom_academico;
    }
    public void setNom_academico(String nom_academico) {
        this.nom_academico = nom_academico;
    }
    public String getCorreo_ubb() {
        return correo_ubb;
    }
    public void setCorreo_ubb(String correo_ubb) {
        this.correo_ubb = correo_ubb;
    }
    public String getContrasena_academico() {
        return contrasena_academico;
    }
    public void setContrasena_academico(String contrasena_academico) {
        this.contrasena_academico = contrasena_academico;
    }
    public String getDepartamento() {
        return departamento;
    }
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    
}
