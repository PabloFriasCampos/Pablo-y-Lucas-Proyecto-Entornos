package com.pablo.y.lucas.parkingmanagerdemo.sorteo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;

@Controller
public class SorteoController{
    
    @Autowired
    private SorteoRepository repositorio;

    @GetMapping("/sorteos")
    public String displaySorteos(Model model){
        model.addAttribute("sorteos", repositorio.findAll());
        return "listaSorteos";
    }
        
}