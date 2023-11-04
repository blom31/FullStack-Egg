package com.egg.noticias.servicios;

import com.egg.noticias.entidades.Noticias;
import com.egg.noticias.excepciones.MiExcepcion;
import com.egg.noticias.repositorios.NoticiaRepositorio;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NoticiaServicio {

    @Autowired
    private NoticiaRepositorio noticiarepositorio;

    @Transactional
    public void guardarNoticia(String titulo, String cuerpo) throws MiExcepcion {

        validar(titulo, cuerpo);
        Noticias noticia = new Noticias();

        noticia.setTitulo(titulo);
        noticia.setCuerpo(cuerpo);

        noticiarepositorio.save(noticia);
    }

    public List<Noticias> listarNoticia() {
        List<Noticias> noticias = new ArrayList();

        noticias = noticiarepositorio.findAll();
        return noticias;
    }

    @Transactional
    public void modificarNoticia(Long id, String titulo, String cuerpo) throws MiExcepcion{

          validar(titulo, cuerpo);
        Optional<Noticias> respuesta = noticiarepositorio.findById(id);

        if (respuesta.isPresent()) {
            Noticias noticia = respuesta.get();

            noticia.setTitulo(titulo);
            noticia.setCuerpo(cuerpo);

            noticiarepositorio.save(noticia);
        }
    }

    private void validar( String titulo, String cuerpo) throws MiExcepcion {

        
        if (titulo == null || titulo.isEmpty()) {
            throw new MiExcepcion("El título no puede ser nulo ni vacio");
        }
        if (cuerpo == null || cuerpo.isEmpty()) {
            throw new MiExcepcion("El cuerpo no puede ser nulo ni vacio");
        }
    }
}