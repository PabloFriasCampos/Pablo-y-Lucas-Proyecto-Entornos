package com.pablo.y.lucas.parkingmanagerdemo.sorteo;

import java.util.List;
import java.util.ArrayList;

import org.springframework.stereotype.Repository;

@Repository
public class SorteoRepository{

    List<Sorteo> sorteos = new ArrayList<>();

    public List<Sorteo> getAll(){
        sorteos.clear();
        sorteos.add(new Sorteo("22/6/2023", "primer sorteo", "estado1"));
        sorteos.add(new Sorteo("30/7/2023", "segundo sorteo", "estado2"));
        return sorteos;
    }

}