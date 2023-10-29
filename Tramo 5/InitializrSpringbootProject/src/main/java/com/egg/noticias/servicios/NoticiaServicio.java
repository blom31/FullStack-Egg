
package com.egg.noticias.servicios;

import com.egg.noticias.entidades.Noticias;
import com.egg.noticias.repositorios.NoticiaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NoticiaServicio {
    
    @Autowired
    private NoticiaRepositorio noticiarepositorio;
    
    public void guardarNoticia(String titulo, String cuerpo){
        
        Noticias noticia = new Noticias();
        
        noticia.setTitulo(titulo);
        noticia.setCuerpo(cuerpo);
        
        noticiarepositorio.save(noticia);
    }
}
