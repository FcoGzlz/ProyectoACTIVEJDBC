/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.controllers;

import app.models.Equipo;
import app.models.Patrocinador;
import app.models.Patrocinio;
import java.util.List;
import org.javalite.activeweb.AppController;
import org.javalite.activeweb.annotations.DELETE;
import org.javalite.activeweb.annotations.POST;

/**
 *
 * @author Francisco
 */
public class PatrocinioController extends AppController {

    public void index() {
        if("json".equals(format())){
            render().noLayout().contentType("application/json");
        }
        
        List<Patrocinio> patrocinio = Patrocinio.findAll();
        view("patrocinio", patrocinio);

        List<Patrocinador> patrocinador = Patrocinador.findAll();
        
        view("patrocinadores", patrocinador);
        

        List<Equipo> equipos = Equipo.findAll();
        view("equipos", equipos);
        
        
        
        System.out.println();
    }

    @POST
    public void addPatrocinio() {
        
        List<Patrocinador> patrocinador = Patrocinador.findAll();
        view("patrocinadores", patrocinador);

        List<Equipo> equipos = Equipo.findAll();
        
        view("equipos", equipos);

        Patrocinio patrocinio = new Patrocinio();
        patrocinio.fromMap(params1st());
        view("patrocinio", patrocinio);

        if (patrocinio.save()) {
            redirect(PatrocinioController.class);
        } else {
            view("errores", patrocinio.errors());
            render("formularioPatrocinio");
        }
    }
    
    @DELETE
    public void eliminar() {
        Patrocinio patrocinio = Patrocinio.findById(getId());
        patrocinio.delete();
        redirect(PatrocinioController.class);
        
    }
    public void formularioPatrocinio() {
         
        List<Patrocinador> patrocinador = Patrocinador.findAll();
        view("patrocinadores", patrocinador);

        List<Equipo> equipos = Equipo.findAll();
        view("equipos", equipos);
        
       
    }
    

}
