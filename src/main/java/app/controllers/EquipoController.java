/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.controllers;

import app.models.Equipo;
import app.models.Patrocinador;
import java.util.List;
import org.javalite.activejdbc.LazyList;
import org.javalite.activeweb.AppController;
import org.javalite.activeweb.annotations.DELETE;
import org.javalite.activeweb.annotations.POST;

/**
 *
 * @author Francisco
 */
public class EquipoController extends AppController{
    
    public void index(){
        if("json".equals(format())){
            render().noLayout().contentType("application/json");
        }
        List<Equipo> equipo = Equipo.findAll();
        view("equipos", equipo);
    
    }
    
    @POST
    public void addEquipo(){
        Equipo equipo = new Equipo();
        equipo.fromMap(params1st());
        view("equipos", equipo);
        
        if (equipo.save()) {
            redirect(EquipoController.class);
        }
        else{
            view("errores", equipo.errors());
            render("formularioEquipo");
        }
    
    }
    
    @DELETE
    public void eliminarEquipo(){
        Equipo equipo = Equipo.findById(getId());
        equipo.delete();
        redirect(EquipoController.class);
    
    }
    
    public void patrocinadoresDeEquipo(){
        
        //System.out.println(Equipo.belongsTo(Patrocinador.class));
        Equipo equipo = Equipo.findById(getId());
        
        List<Patrocinador> patrocinadoresDeEquipo = equipo.getAll(Patrocinador.class);
        
                if (patrocinadoresDeEquipo.size()!=0) {
            view("patrocinadoresDeEquipo", patrocinadoresDeEquipo);
            view("equipo", equipo);
        }
        else{
            view("errores", "Este Patrocinador no Patrocina a ningún equipo Actualmente");
            redirect(EquipoController.class);
            
        }
    }
    
    public void formularioEquipo(){
    
    }
}
