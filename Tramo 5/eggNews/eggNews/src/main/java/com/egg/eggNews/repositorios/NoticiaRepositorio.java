package com.egg.eggNews.repositorios;

import com.egg.eggNews.entidades.Noticia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NoticiaRepositorio extends JpaRepository <Noticia, Long>{

    //public Noticia GuargarActualizarNoticia();
    
    //LIST?
    //@Query ("SELECT n FROM Noticia n WHERE n.titulo = :titulo")
   // public Noticia ConsultaNoticiaTitulo(@Param("titulo") String titulo );
    
    //@Query ("SELECT n FROM Noticia n WHERE n.cuerpo = :cuerpo")
   // public Noticia ConsultaNoticiaCuerpo(@Param("cuerpo") String cuerpo );
    
    
    
    
    //public Noticia DarBajaNoticia();
    
    
}
