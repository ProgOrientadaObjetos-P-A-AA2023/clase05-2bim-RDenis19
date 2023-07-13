/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete11;

/**
 *
 * @author denis
 */
public class UsuarioMovie {

    private String user;
    private String tipo;

    public UsuarioMovie(String use, String tip) {
        user = use;
        tipo = tip;
    }

    public void establecerUser(String n) {
        user = n;
    }

    public void establecerTipo(String n) {
        tipo = n;
    }

    public String obtenerUser() {
        return user;
    }

    public String obtenerTipo() {
        return tipo;
    }

}
