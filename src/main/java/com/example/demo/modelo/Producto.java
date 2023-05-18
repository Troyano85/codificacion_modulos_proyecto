package com.example.demo.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "producto")
public class Producto {
    //atributos
    private String referencia;
    private String nombreProducto;
    private double presio;

    //constructores


    public Producto() {
    }

    public Producto(String referencia, String nombreProducto, double presio) {
        this.referencia = referencia;
        this.nombreProducto = nombreProducto;
        this.presio = presio;
    }

    //getter y setter


    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public double getPresio() {
        return presio;
    }

    public void setPresio(double presio) {
        this.presio = presio;
    }
}
