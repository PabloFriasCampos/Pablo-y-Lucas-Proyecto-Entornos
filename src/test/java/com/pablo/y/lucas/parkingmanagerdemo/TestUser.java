package com.pablo.y.lucas.parkingmanagerdemo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.pablo.y.lucas.parkingmanagerdemo.user.User;

public class TestUser {

  private User user;

  @BeforeEach
  public void init(){
    this.user = new User("email","nombre","apellido1","apellido2");

  }

  @Test
  public void check_user_id(){

    long actual = user.getId();

    assertEquals(user.getId(), actual);

  }

  @Test
  public void check_user_nombre(){

    String expected = "nombre1";

    user.setNombre(expected);

    String actual = user.getNombre();

    assertEquals(expected, actual);

  }

  @Test
  public void check_user_email(){

    String expected = "email1";

    user.setEmail(expected);

    String actual = user.getEmail();

    assertEquals(expected, actual);

  }

  @Test
  public void check_user_apellido1(){

    String expected = "apellido11";

    user.setApellido1	(expected);

    String actual = user.getApellido1();

    assertEquals(expected, actual);

  }

  @Test
  public void check_user_apellido2(){

    String expected = "apellido21";

    user.setApellido2(expected);

    String actual = user.getApellido2();

    assertEquals(expected, actual);

  }

}
