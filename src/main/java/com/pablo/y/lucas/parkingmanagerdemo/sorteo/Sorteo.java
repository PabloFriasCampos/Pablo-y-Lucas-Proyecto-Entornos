package com.pablo.y.lucas.parkingmanagerdemo.sorteo;

public class Sorteo{

    private String fecha;
    private String descripcion;
    private String estado;

    public Sorteo(String fecha, String descripcion, String estado){
        this.fecha = fecha;
        this.descripcion = descripcion;
        this.estado = estado;
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