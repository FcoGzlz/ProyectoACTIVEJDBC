/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.models;

import org.javalite.activejdbc.Model;
import org.javalite.activejdbc.annotations.Many2Many;
import org.javalite.activejdbc.annotations.Table;

/**
 *
 * @author Francisco
 */
@Table("equipo")
@Many2Many(other = Patrocinador.class, join = "patrocinio", sourceFKName = "idEquipo", targetFKName = "idPatrocinador")
public class Equipo extends Model{
    
   
    
}
