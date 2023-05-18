package com.example.demo.modelo;

import jakarta.persistence.*;

@Entity
@Table(name = "cliente")
public class Cliente {
    //atributos
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String nombreCliente;
    private String celularCliente;
    private String direccion;

    //constructores


    public Cliente() {
    }

    public Cliente(int id, String nombreCliente, String celularCliente, String direccion) {
        this.id = id;
        this.nombreCliente = nombreCliente;
        this.celularCliente = celularCliente;
        this.direccion = direccion;
    }

    //getter y setter


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getCelularCliente() {
        return celularCliente;
    }

    public void setCelularCliente(String celularCliente) {
        this.celularCliente = celularCliente;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}
