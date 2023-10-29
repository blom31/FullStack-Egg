
package com.egg.noticias.repositorios;

import com.egg.noticias.entidades.Noticias;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface NoticiaRepositorio extends JpaRepository<Noticias, Long>{
     @Query("SELECT n FROM Noticia n WHERE n.titulo = :titulo")
    public Noticias buscarPorTitulo(@Param("titulo") String titulo);
    
}
