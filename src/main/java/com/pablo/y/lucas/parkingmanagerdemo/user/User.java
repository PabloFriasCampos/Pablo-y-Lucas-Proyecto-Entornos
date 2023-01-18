package com.pablo.y.lucas.parkingmanagerdemo.user;

public class User {
  private long id;
  private String email;
  private String nombre;

  public User(String email, String nombre){
    this.email = email;
    this.nombre = nombre;

  }

  public String getEmail(){
    return email;
    
  }

  public String getNombre(){
    return nombre;
    
  }

  public void setEmail(String email){
    this.email = email;

  }

  public void setNombre(String nombre){
    this.nombre = nombre;

  }

}
