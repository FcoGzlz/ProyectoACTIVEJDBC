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
@Table("patrocinador")
public class Patrocinador extends Model{
    
    static{
    validatePresenceOf("nombrePatrocinador").message("Debe Ingresar un Nombre");
    }
}
