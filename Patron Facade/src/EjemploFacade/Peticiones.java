/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjemploFacade;

import EjemploFacade.ServicioCliente;

/**
 *
 * @author Tonny
 */
public class Peticiones extends ServicioCliente {

    public Peticiones(String nombre) {
        super(nombre);
    }

    @Override
    public String getNombre() {
        return nombre;
    }

}
