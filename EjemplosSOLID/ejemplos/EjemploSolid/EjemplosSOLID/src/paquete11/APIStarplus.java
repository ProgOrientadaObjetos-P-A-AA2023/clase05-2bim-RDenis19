/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete11;

import java.util.Random;

/**
 *
 * @author denis
 */
public class APIStarplus implements APIMovie{
    
    private String apiKey;
    private Random random = new Random();
    @Override
    public void establecerApiKey(String ak){
        apiKey = ak+"STARPULS" + random.nextInt(900000) + 100000;
    }
    
    @Override
    public String obtenerApiKey(){
        return apiKey;
    }
}
