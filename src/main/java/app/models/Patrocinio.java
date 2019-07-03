/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.models;

import org.javalite.activejdbc.Model;
import org.javalite.activejdbc.annotations.Table;

/**
 *
 * @author Francisco
 */
@Table("patrocinio")
public class Patrocinio extends Model{
    
    static{
        validatePresenceOf("idEquipo").message("Ingrese Equipo");
        validatePresenceOf("idPatrocinador").message("Ingrese Patrocinador");
    }
    
}
