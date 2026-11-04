package com.contralupa;

import com.contralupa.ingestion.application.mappers.ContratoSecopMapper;
import com.contralupa.ingestion.infrastructure.socrata.SocrataClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.util.Arrays;

public class Main {

    static {
        System.setProperty(
                "org.slf4j.simpleLogger.logFile",
                "System.out"
        );
    }

    private static final Logger log = LoggerFactory.getLogger(Main.class);

    static void main() {

        log.info("Starting Socrata Client");

        SocrataClient client = new SocrataClient();

        try {
            String response = client.simpleSocrataRequest();

            Arrays.stream(ContratoSecopMapper.toContratoSecop(response)).forEach(contratoSecopResponse -> {
                log.info(contratoSecopResponse.toString());
            });

        } catch (IOException | InterruptedException e) {
            log.error(e.getMessage());
        }

        log.info("Connected to Socrata Server");

    }
}
