package com.egg.eggNews.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.egg.eggNews.entidades.Noticia;
import com.egg.eggNews.servicios.NoticiaServicio;

@Controller
@RequestMapping("/Noticia")
public class NoticiaControlador {

    @Autowired
    public NoticiaServicio noticiaServicio;

    @GetMapping("/VistaNoticia/{id}")
    public String MostrarNoticia(ModelMap modelo, @PathVariable Long id) {

        Noticia noticia = noticiaServicio.ListarPorID(id);

        modelo.addAttribute("noticia", noticia);

        return "vistaNoticia.html";
    }
}
