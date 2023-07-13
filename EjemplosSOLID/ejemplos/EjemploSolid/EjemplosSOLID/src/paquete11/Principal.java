/*
 * 
 * D - Dependency inversion principle (Principio de inversión de dependencias)
 */
package paquete11;

import java.util.ArrayList;


public class Principal {

     public static void main(String[] args) {
        /*
        Usar el txt llamado usuarios.txt; por cada línea del archivo
        crer un API en función de su servicio; además el API ahora genera
        información estática (no cambia el API), se debe buscar la forma que el 
        API sea dinámico totalmente (usar alguna librería propia de JAVA, tipo 
        Random); la url final debe contener el tipo de servicio y el user
        Por cada objeto de tipo GeneradoPelicula presentar la información 
        a través de un toString
         */

        ArrayList<GeneradorPelicula> generador = new ArrayList<>();
        ArrayList<UsuarioMovie> users;
        String nombreArchivo = "usuarios.txt";

        LecturaArchivo lectura = new LecturaArchivo(nombreArchivo);
        lectura.establecerLista();
        users = lectura.obtenerLista();
        lectura.cerrarArchivo();

        for (UsuarioMovie user : users) {
            switch (user.obtenerTipo()) {
                case "Netflix":
                    APINetflix api1 = new APINetflix();
                    api1.establecerApiKey("123133");

                    GeneradorPelicula gp1 = new GeneradorPelicula();
                    gp1.establecerLlave(api1);
                    gp1.establecerUser(user.obtenerUser());
                    gp1.establecerUrl("http://a21321wsa=");
                    generador.add(gp1);
                    break;
                case "Disney":
                    APIDisney api2 = new APIDisney();
                    api2.establecerApiKey("214134");

                    GeneradorPelicula gp2 = new GeneradorPelicula();
                    gp2.establecerLlave(api2);
                    gp2.establecerUser(user.obtenerUser());
                    gp2.establecerUrl("http://apasadsadq2=");
                    generador.add(gp2);
                    break;
                case "Amazon":
                    APIAmazonMovie api3 = new APIAmazonMovie();
                    api3.establecerApiKey("123123");

                    GeneradorPelicula gp3 = new GeneradorPelicula();
                    gp3.establecerLlave(api3);
                    gp3.establecerUser(user.obtenerUser());
                    gp3.establecerUrl("http://dqw2e2wd=");
                    generador.add(gp3);
                    break;
                case "StarPlus":
                    APIStarplus api4 = new APIStarplus();
                    api4.establecerApiKey("123123");

                    GeneradorPelicula gp4 = new GeneradorPelicula();
                    gp4.establecerLlave(api4);
                    gp4.establecerUser(user.obtenerUser());
                    gp4.establecerUrl("http://Uty7tgt=");
                    generador.add(gp4);
                    break;
            }
        }
        for (GeneradorPelicula gp : generador) {
            System.out.println(gp);
        }
    }
}