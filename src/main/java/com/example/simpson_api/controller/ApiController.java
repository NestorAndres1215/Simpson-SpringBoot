package com.example.simpson_api.controller;


import com.example.simpson_api.model.Personaje;
import com.example.simpson_api.service.ApiService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class ApiController {

    private final ApiService apiService;

    public ApiController(ApiService apiService) {
        this.apiService = apiService;
    }

    @GetMapping("/personajes")
    public String mostrarPersonajes(Model model) {
        List<Personaje> personajes = apiService.obtenerPersonajes();
        model.addAttribute("personajes", personajes);
        return "personajes"; // Nombre de la vista Thymeleaf
    }
}