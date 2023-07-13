/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete11;

import java.util.Random;

public class APINetflix implements APIMovie {

    private String apiKey;
    private Random random = new Random();

    @Override
    public void establecerApiKey(String ak) {
        apiKey = ak + "NETFLIX" + random.nextInt(900000) + 100000;
    }

    @Override
    public String obtenerApiKey() {
        return apiKey;
    }

}
