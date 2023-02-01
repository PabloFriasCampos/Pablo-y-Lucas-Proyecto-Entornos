package com.pablo.y.lucas.parkingmanagerdemo.user;

import java.util.List;
import java.util.ArrayList;

import org.springframework.stereotype.Repository;

@Repository
public class UserRepository {

  List<User> usuarios = new ArrayList<>();


  public List<User> getAll(){
    usuarios.clear();
    usuarios.add(new User("pablule@gmail.com", "pablo","frias","campos"));
    usuarios.add(new User("daniel@gmail.com", "dani","frias","campos"));
    usuarios.add(new User("juanito@gmail.com", "juan","frias","campos"));
    usuarios.add(new User("paquirri@gmail.com", "paco","frias","campos"));
    usuarios.add(new User("deivid@gmail.com", "david","frias","campos"));
    return usuarios;

  }

}
