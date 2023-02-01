package com.pablo.y.lucas.parkingmanagerdemo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.pablo.y.lucas.parkingmanagerdemo.user.Sorteo;

public class TestSorteo {
  
  private Sorteo sorteo;

  @BeforeEach
  public void init(){
    this.sorteo = new Sorteo("fecha","descripcion","estado");

  }

  @Test
  public void check_sorteo_fecha(){

    String expected = "fecha";

    String actual = sorteo.getFecha();

    assertEquals(expected, actual);
    
  }

  @Test
  public void check_sorteo_descripcion(){

    String expected = "descripcion";

    String actual = sorteo.getDescripcion();

    assertEquals(expected, actual);
    
  }

  @Test
  public void check_sorteo_estado(){

    String expected = "estado";

    String actual = sorteo.getEstado();

    assertEquals(expected, actual);
    
  }

}
