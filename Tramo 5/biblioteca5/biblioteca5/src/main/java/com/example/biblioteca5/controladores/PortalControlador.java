
package com.example.biblioteca5.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class PortalControlador { // localhost: 8080/

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
}
