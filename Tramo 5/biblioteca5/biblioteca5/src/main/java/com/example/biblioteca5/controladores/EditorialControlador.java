
package com.example.biblioteca5.controladores;

import com.example.biblioteca5.excepciones.MiException;
import com.example.biblioteca5.servicios.EditorialServicio;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/editorial")
public class EditorialControlador {
    @Autowired
    private EditorialServicio editorialservicio;
    
    @GetMapping("/registrar")//localhost: 8080/autor/registrar
    public String registrar(){
        
        return "editorial_form.html";
    }  
    @PostMapping("/registro")
    public String registro(@RequestParam String nombre){
        
        try {
            editorialservicio.crearEditorial(nombre);
        } catch (MiException ex) {
            Logger.getLogger(AutorControlador.class.getName()).log(Level.SEVERE, null, ex);
            return "editorial_form.html";
        }
        
        return "index.html";
    }
}
