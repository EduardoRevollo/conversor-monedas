package com.clouddevelopers.conversormonedas.modelos;


import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaTasa {

    public TasaCambio tasaCambio() {

        String clave = "28a0e06bc9b6c03b3f614c94";
        String direccion = "https://v6.exchangerate-api.com/v6/"+clave+"/latest/USD";

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(direccion))
                .build();
        HttpResponse<String> response = null;
        try {
            response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }

        return new Gson().fromJson(response.body(),TasaCambio.class);

    }


}
