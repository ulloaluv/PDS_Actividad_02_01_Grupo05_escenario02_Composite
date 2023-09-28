/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pds_actividad_02_01_grupo05_composite;

import javax.swing.JTextArea;

/**
 *
 * @author Edison
 */
public abstract class ArchivoComponent {
    private String nombre;

    public ArchivoComponent(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public abstract int getTamaño();
    
    public void mostrar(JTextArea text){
    };
}
