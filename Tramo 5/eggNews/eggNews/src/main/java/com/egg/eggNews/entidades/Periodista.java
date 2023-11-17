package com.egg.eggNews.entidades;

import enumeraciones.Rol;
import java.util.ArrayList;
import java.util.Date;
import javax.persistence.Entity;



@Entity
public class Periodista extends Usuario {

    private ArrayList<Noticia> misNoticias;
    private Integer sueldoMensual;
    private Boolean altaPeriodista; //(modificar el atributo activo)

    public Periodista() {
    }

    public Periodista(ArrayList<Noticia> misNoticias, Integer sueldoMensual, Boolean altaPeriodista) {
        this.misNoticias = misNoticias;
        this.sueldoMensual = sueldoMensual;
        this.altaPeriodista = altaPeriodista;
    }

    public Periodista(ArrayList<Noticia> misNoticias, Integer sueldoMensual, Boolean altaPeriodista, String id, String nombreUsuario, String password, String email, Date fechaDeAlta, Boolean Activo, Rol rol) {
        super(id, nombreUsuario, password, email, fechaDeAlta, Activo, rol);
        this.misNoticias = misNoticias;
        this.sueldoMensual = sueldoMensual;
        this.altaPeriodista = altaPeriodista;
    }

    public ArrayList<Noticia> getMisNoticias() {
        return misNoticias;
    }

    public void setMisNoticias(ArrayList<Noticia> misNoticias) {
        this.misNoticias = misNoticias;
    }

    public Integer getSueldoMensual() {
        return sueldoMensual;
    }

    public void setSueldoMensual(Integer sueldoMensual) {
        this.sueldoMensual = sueldoMensual;
    }

    public Boolean getAltaPeriodista() {
        return altaPeriodista;
    }

    public void setAltaPeriodista(Boolean altaPeriodista) {
        this.altaPeriodista = altaPeriodista;
    }

    
    


    
}
