package com.example.easynotes.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class IndexController {

    @GetMapping
    public String sayHello() {
        return "Bienvenue sur l'application EasyNote. Vous pouvez creer une nouvelle note en faisant une requete POST sur le end point /api/notes";
    }
}
