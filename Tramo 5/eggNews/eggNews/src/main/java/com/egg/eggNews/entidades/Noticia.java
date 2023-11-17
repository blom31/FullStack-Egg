package com.egg.eggNews.entidades;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;



@Entity
public class Noticia {

   @Id
    //@GeneratedValue(strategy = GenerationType.AUTO)
    @GeneratedValue(strategy= GenerationType.SEQUENCE)
    //@GeneratedValue(generator = "uuid")
    private Long id;
    private String titulo;
    private String cuerpo;
    private Boolean alta;
    @ManyToOne
    private Periodista creador;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getCuerpo() {
        return cuerpo;
    }

    public void setCuerpo(String cuerpo) {
        this.cuerpo = cuerpo;
    }

    public Boolean getAlta() {
        return alta;
    }

    public void setAlta(Boolean alta) {
        this.alta = alta;
    }

    public Periodista getCreador() {
        return creador;
    }

    public void setCreador(Periodista creador) {
        this.creador = creador;
    }

    public Noticia(Long id, String titulo, String cuerpo, Boolean alta, Periodista creador) {
        this.id = id;
        this.titulo = titulo;
        this.cuerpo = cuerpo;
        this.alta = alta;
        this.creador = creador;
    }

    public Noticia() {
    }

    
   
    
    
}
