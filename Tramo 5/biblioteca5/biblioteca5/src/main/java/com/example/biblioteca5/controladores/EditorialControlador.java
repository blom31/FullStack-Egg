
package com.example.biblioteca5.controladores;


import com.example.biblioteca5.entidades.Editorial;
import com.example.biblioteca5.excepciones.MiException;
import com.example.biblioteca5.servicios.EditorialServicio;

import java.util.logging.Level;
import java.util.logging.Logger;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/editorial")
public class EditorialControlador {
    @Autowired
    private EditorialServicio editorialServicio;
    
    @GetMapping("/registrar")//localhost: 8080/autor/registrar
    public String registrar(){
        
        return "editorial_form.html";
    }  
    
    @PostMapping("/registro")
    public String registro(@RequestParam String nombre, ModelMap modelo){
        
        try {
            editorialServicio.crearEditorial(nombre);
            
            modelo.put("exito", "La Editorial fue registrada correctamente!");
        } catch (MiException ex) {
                       
            modelo.put("error", ex.getMessage());
            return "editorial_form.html";
        }
        
        return "index.html";        
    }

    @GetMapping("/lista")
    public String listar(ModelMap modelo){

        List <Editorial> editoriales = editorialServicio.listarEditoriales();

        modelo.addAttribute("editoriales", editoriales);

        return "editorial_list.html";
        
    }
    
    @GetMapping("/modificar/{id}")
    public String modificar(@PathVariable String id, ModelMap modelo) {
        modelo.put("editorial", editorialServicio.getOne(id));

        return "editorial_modificar.html";
    }

    @PostMapping("/modificar/{id}")
    public String modificar(@PathVariable String id, String nombre, ModelMap modelo) {
        try {
            editorialServicio.modificarEditorial(nombre, id);

            return "redirect:../lista";
        } catch (MiException ex) {
            modelo.put("error", ex.getMessage());
            return "editorial_modificar.html";
        }
    }
}
