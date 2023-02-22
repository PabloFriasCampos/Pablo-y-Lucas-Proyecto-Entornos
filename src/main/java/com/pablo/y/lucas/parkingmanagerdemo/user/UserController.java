package com.pablo.y.lucas.parkingmanagerdemo.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.ui.Model;

@Controller
public class UserController {
  
  @Autowired
  private UserRepository repositorio;

  @GetMapping("/usuarios")
  public String displayUsers(Model model){
    model.addAttribute("usuarios",repositorio.findAll());
    return "listausuarios";

  }

  @GetMapping("/nuevoUsuario")
  public String showUserCreateForm(Model model){
    User usuarios = new User();
    model.addAttribute("usuarios", usuarios);
    return "nuevoFormularioDeUsuario";
  }

  @PostMapping("/nuevoUsuario")
  public String createUser(@ModelAttribute User usuarios){
    repositorio.save(usuarios);
    return "redirect:/usuarios";
    
  }

}
