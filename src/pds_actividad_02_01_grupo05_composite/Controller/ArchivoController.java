/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pds_actividad_02_01_grupo05_composite.Controller;

import pds_actividad_02_01_grupo05_composite.Archivo;
import pds_actividad_02_01_grupo05_composite.ArchivoComponent;
import pds_actividad_02_01_grupo05_composite.Carpeta;

/**
 *
 * @author Edison
 */
public class ArchivoController {
    
    public int calcularTotalTamaño(ArchivoComponent component) {
        return component.getTamaño();
    }

    public void agregarArchivo(Carpeta carpeta, Archivo archivo) {
        carpeta.agregarArchivo(archivo);
    }

    public void removerArchivo(Carpeta carpeta, ArchivoComponent archivo) {
        carpeta.removerArchivo(archivo);
        
    }
}
