package com.egg.news.service;

import com.egg.news.entidad.Noticia;
import com.egg.news.excepciones.MyExcepcion;
import com.egg.news.repositorio.NoticiaRepositorio;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;

public class NoticiaService {

    @Autowired
    private NoticiaRepositorio noticiaRepositorio;

    @Transactional
    public void crearNoticia(String titulo, String cuerpo) throws MyExcepcion { //crear noticia
        validar(titulo,cuerpo);

        Noticia noticia = new Noticia();

        noticia.setTitulo(titulo);
        noticia.setCuerpo(cuerpo);
        noticia.setStatus(Boolean.TRUE);

        noticiaRepositorio.save(noticia);
    }

    @Transactional
    public void darDeBaja(Long id) {// modificar status.

        Optional<Noticia> respuesta = noticiaRepositorio.findById(id); //si hay una respuesta creame un objeto noticia

        if (respuesta.isPresent()) {
            Noticia noticia = respuesta.get();

            noticia.setStatus(false);
            
            noticiaRepositorio.save(noticia);
        }
    }
    
    @Transactional
    public void modificar(Long id, String titulo, String cuerpo)throws MyExcepcion {// modificar status.

        validar(titulo, cuerpo);
        Optional<Noticia> respuesta = noticiaRepositorio.findById(id); //si hay una respuesta creame un objeto noticia

        if (respuesta.isPresent()) {
            Noticia noticia = respuesta.get();

            noticia.setStatus(false);
            
            noticiaRepositorio.save(noticia);
        }
    }

    private void validar(String titulo, String cuerpo) throws MyExcepcion {

        if (titulo.isEmpty() || titulo == null) {
            throw new MyExcepcion("Titulo obligatorio");
        }
        if (cuerpo == null) {
            throw new MyExcepcion("llenar el campo");
        }
    }
}
