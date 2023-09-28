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

import java.util.ArrayList;
import java.util.List;
import javax.swing.JTextArea;

public class Carpeta extends ArchivoComponent {
    private String nombre;
    private StringBuilder text;
    private List<ArchivoComponent> archivos;

    public Carpeta(String nombre) {
        super(nombre);
        this.nombre = nombre;
        archivos = new ArrayList<>();
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public int getTamaño() {
        int tamañoTotal = 0;
        for (ArchivoComponent archivo : archivos) {
            tamañoTotal += archivo.getTamaño();
        }
        return tamañoTotal;
    }

    @Override
    public void mostrar(JTextArea text) {
        text.setText(text.getText() + "\n" + getNombre() + " (" + getTamaño() + " KB)\n");
        System.out.println("" + getNombre() + " (" + getTamaño() + " KB)");
        for (ArchivoComponent archivo : archivos) {
            archivo.mostrar(text);
            text.setText(text.getText() + "    -" + getNombre() + " : " + archivo.getNombre() + " (" + archivo.getTamaño() + " KB)\n");
            System.out.println("    -" + getNombre() + " : " + archivo.getNombre() + " (" + archivo.getTamaño() + " KB)");
        }
    }

    public void agregarArchivo(ArchivoComponent archivo) {
        archivos.add(archivo);
    }

    public void removerArchivo(ArchivoComponent archivo) {
        archivos.remove(archivo);
    }
    
    public List<ArchivoComponent> list() {
        return archivos;
    }
}