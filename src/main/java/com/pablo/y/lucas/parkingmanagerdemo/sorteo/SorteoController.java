package com.pablo.y.lucas.parkingmanagerdemo.sorteo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;

@Controller
public class SorteoController{
    SorteoRepository repositorio = new SorteoRepository();

    @GetMapping("/sorteos")
    public String displaySorteos(Model model){
        model.addAttribute("sorteos", repositiorio.getAll())
        return "listaSorteos";
    }
        
}