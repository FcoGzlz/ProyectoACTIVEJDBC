/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.controllers;

import app.models.Equipo;
import app.models.Patrocinador;
import java.util.List;
import org.javalite.activeweb.AppController;
import org.javalite.activeweb.annotations.DELETE;
import org.javalite.activeweb.annotations.POST;
import org.javalite.activeweb.annotations.RESTful;

/**
 *
 * @author Francisco
 */

public class PatrocinadorController extends AppController{
    
   
    public void index(){
        
        if("json".equals(format())){
            render().noLayout().contentType("application/json");
        }
         
    List<Patrocinador> patrocinadores = Patrocinador.findAll();
    view("patrocinadores", patrocinadores);
    
    }
    
    public void app() {
        render().noLayout().contentType("text/html");
    }
    @POST
    public void addPatrocinador(){
    Patrocinador patrocinador = new Patrocinador();
    
    patrocinador.fromMap(params1st());
    view("patrocinadores", patrocinador);
    
        if (patrocinador.save()) {
            redirect(PatrocinadorController.class);
        }
        else{
        view("errores", patrocinador.errors());
        render("formularioPatrocinador");
        }
        
    }
    
    @DELETE
    public void eliminar(){
        Patrocinador patrocinador = Patrocinador.findById(getId());
        patrocinador.delete();
        redirect(PatrocinadorController.class);
        
        
        
    }
    
    public void equiposPatrocinados(){
    //System.out.println(Patrocinador.belongsTo(Equipo.class));
        
    Patrocinador patrocinador = Patrocinador.findById(getId());
    List<Equipo> equiposPatrocinados = patrocinador.getAll(Equipo.class);
    
        if (equiposPatrocinados.size()!=0) {
            view("equiposPatrocinados", equiposPatrocinados);
            view("patrocinador", patrocinador);
        }
        else{
            view("errores", "Este Patrocinador no Patrocina a ningún equipo Actualmente");
            redirect(PatrocinadorController.class);
            
        }
    }
    public void formularioPatrocinador(){
    
    }
}
