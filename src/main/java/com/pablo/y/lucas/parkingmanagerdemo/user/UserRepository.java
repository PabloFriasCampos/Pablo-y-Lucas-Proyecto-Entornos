package com.pablo.y.lucas.parkingmanagerdemo.user;

import java.util.List;
import java.util.ArrayList;

import org.springframework.stereotype.Repository;

@Repository
public class UserRepository {

  List<User> usuarios = new ArrayList<>();


  public List<User> getAll(){
    usuarios.clear();
    usuarios.add(new User("pablule@gmail.com", "pablo"));
    usuarios.add(new User("daniel@gmail.com", "dani"));
    usuarios.add(new User("juanito@gmail.com", "juan"));
    usuarios.add(new User("paquirri@gmail.com", "paco"));
    usuarios.add(new User("deivid@gmail.com", "david"));
    return usuarios;

  }

}
