package com.contralupa.ingestion.application.mappers;

import com.contralupa.ingestion.domain.ContratoSecopResponse;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

import java.io.IOException;

public class ContratoSecopMapper {

    private static final ObjectMapper objectMapper = new ObjectMapper();

    public static ContratoSecopResponse[] toContratoSecop(String response) throws IOException, InterruptedException {

        objectMapper.registerModule(new JavaTimeModule());

        String result = objectMapper.writeValueAsString(response);

        return objectMapper.readValue(response, ContratoSecopResponse[].class);
    }
}
