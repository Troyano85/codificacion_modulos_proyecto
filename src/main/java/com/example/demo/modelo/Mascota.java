package com.example.demo.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "mascota")
public class Mascota {
    //atributos
    private int id_cliente;
    private String nombreMascota;
    private String raza;
    private String color;
    private String odservacion;

    //constructore


    public Mascota() {
    }

    public Mascota(int id_cliente, String nombreMascota, String raza, String color, String odservacion) {
        this.id_cliente = id_cliente;
        this.nombreMascota = nombreMascota;
        this.raza = raza;
        this.color = color;
        this.odservacion = odservacion;
    }

    //getter y setter


    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public String getNombreMascota() {
        return nombreMascota;
    }

    public void setNombreMascota(String nombreMascota) {
        this.nombreMascota = nombreMascota;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getOdservacion() {
        return odservacion;
    }

    public void setOdservacion(String odservacion) {
        this.odservacion = odservacion;
    }
}
