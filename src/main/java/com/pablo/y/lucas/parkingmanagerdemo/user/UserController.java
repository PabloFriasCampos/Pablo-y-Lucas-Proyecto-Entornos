package com.pablo.y.lucas.parkingmanagerdemo.user;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;

@Controller
public class UserController {
  UserRepository repositiorio = new UserRepository();

  @GetMapping("/usuarios")
  public String displayUsers(Model model){
    model.addAttribute("usuarios",repositiorio.getAll());
    return "listausuarios";

  }

}
