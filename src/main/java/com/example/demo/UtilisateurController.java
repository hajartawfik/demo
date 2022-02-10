package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping (path = "/user")

public class UtilisateurController {
    @Autowired
    private UtilisateurRepository userRepository;
    //Persister l'utilisateur
    @PostMapping (path = "/create")
    public @ResponseBody Utilisateur addNewUser(@RequestParam String name,@RequestParam String email){
    Utilisateur user = new Utilisateur();
    user.setFullName(name);
    user.setEmail(email);
    return userRepository.save(user);
    }
    //Lister l'utilisateur
    @GetMapping (path = "/all")
    public @ResponseBody List<Utilisateur> getAllUsers(){
        return userRepository.findAll();
    }
}
