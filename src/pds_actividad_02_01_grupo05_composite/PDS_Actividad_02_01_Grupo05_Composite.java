/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pds_actividad_02_01_grupo05_composite;

import pds_actividad_02_01_grupo05_composite.Controller.ArchivoController;

/**
 *
 * @author Edison
 */
public class PDS_Actividad_02_01_Grupo05_Composite {

    /**
     * @param args the command line arguments
     */
    /*public static void main(String[] args) {
        // TODO code application logic here
        ArchivoController controller = new ArchivoController();

        // Crear archivos
        Archivo file1 = new Archivo("Documento1.docx", 1000);
        Archivo file2 = new Archivo("Documento2.pdf", 800);
        Archivo file3 = new Archivo("HojaCalculo.xlsx", 1500);

        // Crear carpetas
        Carpeta rootFolder = new Carpeta("Raíz");
        Carpeta subfolder1 = new Carpeta("Subcarpeta1");
        Carpeta subfolder2 = new Carpeta("Subcarpeta2");

        // Agregar archivos a carpetas
        subfolder1.agregarArchivo(file1);
        subfolder2.agregarArchivo(file2);
        subfolder2.agregarArchivo(file3);

        // Agregar carpetas a la raíz
        rootFolder.agregarArchivo(subfolder1);
        rootFolder.agregarArchivo(subfolder2);

        // Calcular el tamaño total de la carpeta raíz
        int totalSize = controller.calcularTotalTamaño(rootFolder);
        System.out.println("Tamaño total de la carpeta raíz: " + totalSize + " bytes");

        // Agregar un nuevo archivo a la subcarpeta 1
        Archivo newFile = new Archivo("NuevoDocumento.pdf", 500);
        controller.agregarArchivo(subfolder1, newFile);

        // Calcular el tamaño total nuevamente
        totalSize = controller.calcularTotalTamaño(rootFolder);
        System.out.println("Tamaño total de la carpeta raíz después de agregar un archivo: " + totalSize + " bytes");

        // Eliminar un archivo de la subcarpeta 2
        controller.removerArchivo(subfolder2, file2);

        // Calcular el tamaño total una vez más
        totalSize = controller.calcularTotalTamaño(rootFolder);
        System.out.println("Tamaño total de la carpeta raíz después de eliminar un archivo: " + totalSize + " bytes");
        
        rootFolder.mostrar();
        
    }*/
    
}
