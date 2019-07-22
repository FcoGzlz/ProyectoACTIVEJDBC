/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.controllers;

import app.models.Equipo;
import app.models.Patrocinador;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import org.javalite.activejdbc.LazyList;
import org.javalite.activeweb.AppController;
import org.javalite.activeweb.annotations.DELETE;
import org.javalite.activeweb.annotations.POST;
import org.javalite.activeweb.annotations.RESTful;

/**
 *
 * @author Francisco
 */
@RESTful
public class EquipoController extends AppController{
    
    private ObjectMapper mapper = new ObjectMapper();
    public void index(){
        List<Equipo> equipos = Equipo.findAll();
    view("equipos", equipos);
    render().contentType("application/json");
    }
    
    public void create() throws IOException{
        Map datos = mapper.readValue(getRequestString(), Map.class);
        /*Equipo e = new Equipo();
        e.fromMap(params1st());
        e.save();*/
        if (datos.isEmpty()) {
            view("message", "Debe ingresar todos los campos", "code", 200);
            render("message");
        } else {
            Equipo e = new Equipo();
            e.fromMap(datos);
            e.saveIt();
            view("message", "El equipo"+" "+"''"+e.getString("nombreEquipo").toUpperCase()+"''"+" "+"ha sido agregado", "code", 200);
            render("message");
        }
     
    }
    
    public void update() throws IOException{
    Map datos = mapper.readValue(getRequestString(), Map.class);
    String id = getId();
    Equipo e = Equipo.findById(id);
        if (e == null) {
            view("message", "La id de Equipo" + id + "no se ha encontrado", "code", 200);
            render("message");
            return;
        } else {
            e.fromMap(datos);
            e.saveIt();
            
        }
    }
        public void show(){
        String id = getId();
        Equipo e = Equipo.findById(id);
            if (e == null) {
                view("message", "La id de Equipo" + id + "no se ha encontrado", "code", 200);
                render("message");
                return;
            } else {
                view("equipo", e);
                render("index");
            }
        }
        
        public void destroy(){
        String id = getId();
        Equipo e = Equipo.findById(id);
        
            if (e == null) {
                view("message", "La ID ingresada no se ha encontrado", "code", 200);
                render("message");
            }else{
            view("message", "El equipo" + " " +"''"+e.get("nombreEquipo").toString().toUpperCase()+"''"+ " "+"se ha eliminado" , "code", 200);
            e.delete();
            render("message");}
        }
        
        @Override
        protected String getContentType(){
            return "application/json";
        }
        
        @Override
        protected String getLayout(){
            return null;
        }
    
 
}
