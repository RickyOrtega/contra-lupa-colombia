package com.contralupa.ingestion.infrastructure.socrata;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SocrataClient {

    private static final Logger logger = LoggerFactory.getLogger(SocrataClient.class);

    private final String URISocrataSECOP = "https://www.datos.gov.co/resource/jbjy-vk9h.json?$limit=10000";

    public String simpleSocrataRequest() throws IOException, InterruptedException {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(URISocrataSECOP))
                .GET()
                .build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        return response.body();

    }
}