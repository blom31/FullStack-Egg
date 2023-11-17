package com.egg.eggNews.servicios;

import com.egg.eggNews.entidades.Noticia;
import com.egg.eggNews.excepciones.MiException;
import com.egg.eggNews.repositorios.NoticiaRepositorio;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NoticiaServicio {

    @Autowired
    private NoticiaRepositorio noticiaRepositorio;

    // CREACION DE NOTICIAS
    @Transactional
    public void crearNoticia(String titulo, String cuerpo) throws MiException {

        validarEdicion(titulo, cuerpo);
        Noticia noticia = new Noticia();

        noticia.setTitulo(titulo);
        noticia.setCuerpo(cuerpo);
        noticia.setAlta(true);
        noticiaRepositorio.save(noticia);
        //return noticia;
    }

    // CONSULTA DEL LISTADO DE LAS NOTICIAS
    public List<Noticia> ListarConsultaNoticias() {

        List<Noticia> noticias = new ArrayList<>();
        noticias = noticiaRepositorio.findAll();
        return noticias;

    }

    // MODIFICAR NOTICIAS CREADAS
    public void modificarNoticia(Long id, String titulo, String cuerpo) throws MiException {
        validarCreacion(id, titulo, cuerpo);
        Optional<Noticia> respuesta = noticiaRepositorio.findById(id);

        if (respuesta.isPresent()) {
            Noticia noticia = respuesta.get();

            noticia.setTitulo(titulo);
            noticia.setCuerpo(cuerpo);

            noticiaRepositorio.save(noticia);
        }
    }

    // BUSCAR NOTICIA POR ID
    public Noticia ListarPorID(Long id) {

        return noticiaRepositorio.getOne(id);
    }

    // ELIMINAR NOTICIAS
    public void eliminarNoticia(Long id) {
        Optional<Noticia> validacion = noticiaRepositorio.findById(id);
        if (validacion.isPresent()) {
            Noticia noticia = validacion.get();
            noticia.setAlta(false);
            noticiaRepositorio.save(noticia);
           
        }
    }







    // VALIDACIONES
    private void validarCreacion(Long id, String titulo, String cuerpo) throws MiException {
        if (id == null) {
            throw new MiException("El ID no puede ser nulo");
        }
        if (titulo == null || titulo.isEmpty()) {
            throw new MiException("El nombre no puede estar vacío o ser nulo");
        }

        if (cuerpo == null || cuerpo.isEmpty()) {
            throw new MiException("El cuerpo no puede estar vacío o ser nulo");
        }
    }

    private void validarEdicion(String titulo, String cuerpo) throws MiException {
        if (titulo == null || titulo.isEmpty()) {
            throw new MiException("El nombre no puede estar vacío o ser nulo");
        }

        if (cuerpo == null || cuerpo.isEmpty()) {
            throw new MiException("El cuerpo no puede estar vacío o ser nulo");
        }
    }

}
