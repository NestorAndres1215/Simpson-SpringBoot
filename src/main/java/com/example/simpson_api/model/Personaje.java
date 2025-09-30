package com.example.simpson_api.model;


import com.fasterxml.jackson.annotation.JsonProperty;

public class Personaje {
    @JsonProperty("_id")
    private String id;

    @JsonProperty("Nombre")
    private String nombre;

    @JsonProperty("Historia")
    private String historia;

    @JsonProperty("Imagen")
    private String imagen;

    @JsonProperty("Genero")
    private String genero;

    @JsonProperty("Estado")
    private String estado;

    @JsonProperty("Ocupacion")
    private String ocupacion;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getHistoria() {
        return historia;
    }

    public void setHistoria(String historia) {
        this.historia = historia;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }
}
