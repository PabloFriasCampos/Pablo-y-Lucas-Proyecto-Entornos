package com.pablo.y.lucas.parkingmanagerdemo.user;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class User {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;
  private String email;
  private String nombre;
  private String apellido1;
  private String apellido2;
  
  public User() {
  }


  public User(String email, String nombre, String apellido1, String apellido2) {
    this.email = email;
    this.nombre = nombre;
    this.apellido1 = apellido1;
    this.apellido2 = apellido2;
  }

  public long getId() {
    return id;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getApellido1() {
    return apellido1;
  }

  public void setApellido1(String apellido1) {
    this.apellido1 = apellido1;
  }

  public String getApellido2() {
    return apellido2;
  }

  public void setApellido2(String apellido2) {
    this.apellido2 = apellido2;
  }
  
}
