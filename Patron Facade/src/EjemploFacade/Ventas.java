/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjemploFacade;

/**
 *
 * @author Tonny
 */
public abstract class  Ventas {
    
        protected String nombre;

    public Ventas (String nombre) {
        this.nombre = nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public abstract String getNombre();
    
}
