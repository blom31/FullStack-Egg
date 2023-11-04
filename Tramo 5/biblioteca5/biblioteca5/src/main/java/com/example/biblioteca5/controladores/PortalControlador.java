package com.example.biblioteca5.controladores;

import com.example.biblioteca5.excepciones.MiException;
import com.example.biblioteca5.servicios.UsuarioServicio;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/")
public class PortalControlador { // localhost: 8080/

    @Autowired
    private UsuarioServicio usuarioServicio;

    @GetMapping("/")
    public String index() {

        return "index.html";
    }

    @GetMapping("/libro")
    public String libro() {

        return "libro_list.html";
    }

    @GetMapping("/registrar")
    public String registrar() {

        return "libro_form.html";
    }

    @GetMapping("/autor")
    public String autor() {

        return "autor_form.html";
    }

    @GetMapping("/editorial")
    public String editorial() {

        return "editorial_form.html";
    }

    @GetMapping("/registrarse")
    public String registrarse() {

        return "registro_usuario.html";
    }

    @PostMapping("/registro")
    public String registro(@RequestParam String nombre, @RequestParam String email, @RequestParam String password,
            String password2, ModelMap modelo) {

        try {
            usuarioServicio.registrar(nombre, email, password, password2);
            modelo.put("exito", "Usuario registrado correctamente!");

            return "index.html";
        } catch (MiException ex) {
            modelo.put("error", ex.getMessage());
            modelo.put("nombre", nombre);
            modelo.put("email", email);

            return "registro_usuario.html";
        }
    }

    @GetMapping("/login")
    public String login(@RequestParam(required = false)String error, ModelMap modelo) {
        
        if(error != null){
            modelo.put("error", "Usuario o Contraseña invalidos¡");
    }
        return "login.html";
    }
    
    @PreAuthorize("hasAnyRole('ROLE_USER', 'ROLE_ADMIN')")
    @GetMapping("/inicio")
    public String inicio(){
        
        return "inicio.html";
    }
}
