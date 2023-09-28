/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pds_actividad_02_01_grupo05_composite;

/**
 *
 * @author Edison
 */
public class Archivo extends ArchivoComponent{
    
    private int tamaño;
    
    public Archivo (String nombre, int tamaño){
        super(nombre);
        this.tamaño = tamaño;
    }
    
    @Override
    public int getTamaño() {
        return tamaño;
    }
}