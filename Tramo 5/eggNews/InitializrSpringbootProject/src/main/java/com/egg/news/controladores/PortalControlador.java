
package com.egg.news.controladores;

import com.egg.news.service.NoticiaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class PortalControlador {
    
@Autowired
private NoticiaService noticiaServicio;
    
@GetMapping("/")
 public String index(){
     return "index.html";
 }
}
@GetMapping("/noticia")
