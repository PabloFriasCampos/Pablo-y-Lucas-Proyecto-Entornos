package com.pablo.y.lucas.parkingmanagerdemo.sorteo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Sorteo{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String fecha;
    private String descripcion;
    private String estado;

    public Sorteo(){
    }

    public Sorteo(String fecha, String descripcion, String estado){
        this.fecha = fecha;
        this.descripcion = descripcion;
        this.estado = estado;
    }

    public long getId() {
        return id;
    }

    public String getFecha(){
        return fecha;
    }

    public void setFecha(String fecha){
        this.fecha = fecha;
    }

    public String getDescripcion(){
        return descripcion;
    }

    public void setDescripcion(String descripcion){
        this.descripcion = descripcion;
    }

    public String getEstado(){
        return estado;
    }

    public void setEstado(String estado){
        this.estado = estado;
    }
    
}