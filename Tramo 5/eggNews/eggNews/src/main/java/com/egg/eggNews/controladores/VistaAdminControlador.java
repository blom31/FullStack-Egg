package com.egg.eggNews.controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.egg.eggNews.entidades.Noticia;
import com.egg.eggNews.excepciones.MiException;
import com.egg.eggNews.servicios.NoticiaServicio;

@Controller
@RequestMapping("/vistaAdmin")
public class VistaAdminControlador {

    @Autowired
    public NoticiaServicio noticiaServicio;

    @GetMapping("/vistaCrearNoticia")
    public String CrearNoticia() {

        return "vistaCrearNoticia.html";
    }

    @PostMapping("/crearN")
    public String CrearN(
            @RequestParam String titulo,
            @RequestParam String cuerpo) throws MiException {

        noticiaServicio.crearNoticia(titulo, cuerpo);

        return "index.html";
    }

    @GetMapping("/vistaEliminarYModificar")
    public String EliminarYModificar(ModelMap modelo) {

        List<Noticia> noticias = noticiaServicio.ListarConsultaNoticias();

        modelo.addAttribute("noticias", noticias);

        return "vistaEliminarYModificar.html";
    }

    @GetMapping("/vistaModificarNoticia/{id}")
    public String ModificarNoticia(ModelMap modelo, @PathVariable Long id) {

        Noticia noticia = noticiaServicio.ListarPorID(id);
        modelo.addAttribute("noticia", noticia);

        return "vistaModificarNoticia.html";

    }

    @PostMapping("vistaModificarNoticia/{id}")
    public String NoticiaModificada(@PathVariable Long id,
            String titulo,
            String cuerpo,
            ModelMap modelo) throws MiException {

        noticiaServicio.modificarNoticia(id, titulo, cuerpo);
        modelo.put("éxito", "Se modificó correctamente la noticia");

        return "redirect:../vistaEliminarYModificar";
    }


    @GetMapping("eliminar/{id}")
    public String eliminar(@PathVariable Long id, String titulo, String cuerpo) throws MiException {
        //Noticia noticia = noticiaServicio.ListarPorID(id);
        //noticia.setAlta(false);
        noticiaServicio.eliminarNoticia(id);
        //noticiaServicio.modificarNoticia(id, titulo, cuerpo);
        return "redirect:../vistaEliminarYModificar";
    }





   // @PostMapping("eliminar/{id}")
   // public String eliminar(@PathVariable Long id,String titulo, String cuerpo) throws MiException{
   //     Noticia noticia = noticiaServicio.ListarPorID(id);
        
   //     noticia.setAlta(false);
   //     noticiaServicio.modificarNoticia(id, titulo, cuerpo);
    //    return "redirect:../vistaEliminarYModificar";
   // }





}
