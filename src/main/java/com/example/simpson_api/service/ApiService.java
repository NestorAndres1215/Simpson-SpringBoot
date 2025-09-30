package com.example.simpson_api.service;


import com.example.simpson_api.model.Personaje;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import java.util.List;

@Service
public class ApiService {

    private final RestTemplate restTemplate = new RestTemplate();
    private final String URL_API = "https://apisimpsons.fly.dev/api/personajes?limit=900"; // Reemplaza con tu API real

    public List<Personaje> obtenerPersonajes() {
        ApiResponse response = restTemplate.getForObject(URL_API, ApiResponse.class);
        return response != null ? response.getDocs() : List.of();
    }
}