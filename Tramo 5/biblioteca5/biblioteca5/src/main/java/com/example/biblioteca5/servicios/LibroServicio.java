
package com.example.biblioteca5.servicios;

import com.example.biblioteca5.entidades.Autor;
import com.example.biblioteca5.entidades.Editorial;
import com.example.biblioteca5.entidades.Libro;
import com.example.biblioteca5.excepciones.MiException;
import com.example.biblioteca5.repositorios.AutorRepositorio;
import com.example.biblioteca5.repositorios.EditorialRepositorio;
import com.example.biblioteca5.repositorios.LibroRepositorio;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LibroServicio {
    
    @Autowired
    private LibroRepositorio libroRepositorio;
    @Autowired
    private AutorRepositorio autorRepositorio;
    @Autowired
    private EditorialRepositorio editorialRepositorio;
    
    @Transactional
    public void crearLibro(Long isbn, String titulo, Integer ejemplares, String idAutor, String idEditorial) throws MiException{
        
        validar(isbn, titulo, ejemplares, idAutor, idEditorial);
        
        Autor autor = autorRepositorio.findById(idAutor).get();
        
        Editorial editorial = editorialRepositorio.findById(idEditorial).get();
        
        Libro libro = new Libro();
        
        libro.setIsbn(isbn);
        libro.setTitulo(titulo);
        libro.setEjemplares(ejemplares);
        libro.setAlta(new Date());
      
        libro.setAutor(autor);
        libro.setEditorial(editorial);
        
        libroRepositorio.save(libro);
    }
    
    public List<Libro> listarLibros(){
        
        List<Libro> libros = new ArrayList();
        libros = libroRepositorio.findAll();
        
        return libros;
    }
    
    public void modificarLibro(Long isbn, String titulo, String idAutor, String idEditorial, Integer ejemplares)throws MiException{
        
        validar(isbn, titulo, ejemplares, idAutor, idEditorial);
        
        Optional<Libro> respuesta = libroRepositorio.findById(isbn);
        Optional<Autor> respuestaAutor = autorRepositorio.findById(idAutor);
        Optional<Editorial> respuestaEditorial = editorialRepositorio.findById(idEditorial);
        
        Autor autor = new Autor();
        Editorial editorial = new Editorial();
        
        if(respuestaAutor.isPresent()){
            autor = respuestaAutor.get();
        }
        
        if(respuestaEditorial.isPresent()){
            editorial = respuestaEditorial.get();
        }
       
        if (respuesta.isPresent()){
            Libro libro = respuesta.get();
            libro.setTitulo(titulo);
            libro.setAutor(autor);
            libro.setEditorial(editorial);
            libro.setEjemplares(ejemplares);
            
            libroRepositorio.save(libro);
            
        }
    }
    
private void validar(Long isbn, String titulo, Integer ejemplares, String idAutor, String idEditorial) throws MiException{
        
        if(isbn == null){
            throw new MiException("El isbn no puede ser null o vacio");
        }
        if(titulo.isEmpty() || titulo == null){
            throw new MiException("El título no puede ser null o vacio");
        }
        if(ejemplares == null){
            throw new MiException("El ejemplares no puede ser null o vacio");
        }
        if(idAutor.isEmpty()){
            throw new MiException("El id del autor no puede ser null o vacio");
        }
        if(idEditorial.isEmpty()){
            throw new MiException("El id del Editorial no puede ser null o vacio");
        }
    }
}
