package com.conversor;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class ClientApi {
    private static final String API_URL = "https://v6.exchangerate-api.com/v6/07c422082f80a520e6f1a9d2/latest/USD";
    private final HttpClient client;

    public ClientApi() {
        client = HttpClient.newHttpClient();
    }

    public JSONObject getRatesChange() throws Exception {
        HttpRequest solicitud = HttpRequest.newBuilder()
                .uri(URI.create(API_URL))
                .build();

        HttpResponse<String> answer = client.send(solicitud, HttpResponse.BodyHandlers.ofString());

        if (answer.statusCode() != 200) {
            throw new RuntimeException("Error getting exchange rates: " + answer.statusCode());
        }

        JSONParser parser = new JSONParser();
        return (JSONObject) parser.parse(answer.body());
    }
}