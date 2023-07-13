/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete11;

/**
 *
 * @author denis
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class LecturaArchivo {

    private Scanner entrada;
    private String nombreArchivo;
    private String rutaArchivo;
    private ArrayList<UsuarioMovie> lista;

    public LecturaArchivo (String n) {
        nombreArchivo = n;
        rutaArchivo = String.format("datos/%s",
                obtenerNombreArchivo());

        File f = new File(rutaArchivo);
        if (f.exists()) {
            try {
                entrada = new Scanner(new File(rutaArchivo));
                // entrada = new Scanner(f);
            } // fin de try
            catch (FileNotFoundException e) {
                System.err.println("Error al leer del archivo: " + e);

            } // fin de catch
        }
    }

    public void establecerNombreArchivo(String n) {
        nombreArchivo = n;
    }

    public void establecerRutaArchivo() {
        rutaArchivo = String.format("datos/%s",
                obtenerNombreArchivo());
    }

    public String obtenerNombreArchivo() {
        return nombreArchivo;
    }

    public String obtenerRutaArchivo() {
        return rutaArchivo;
    }

  
    public void establecerLista() {
        lista = new ArrayList<>();

        File f = new File(rutaArchivo);

        if (f.exists()) {

            while (entrada.hasNext()) {
                String linea = entrada.nextLine();

                ArrayList<String> lineaPartes = new ArrayList<>(
                        Arrays.asList(linea.split(";")));
                
                UsuarioMovie usuario = new UsuarioMovie(lineaPartes.get(1),
                        lineaPartes.get(2));
                
                lista.add(usuario);
                
            } 
        }
    }
    
    public ArrayList<UsuarioMovie> obtenerLista() {
    
        return lista;
    }
    
    public void cerrarArchivo() {
        if (entrada != null) {
            entrada.close();
            
        } 
        
    }
    
}