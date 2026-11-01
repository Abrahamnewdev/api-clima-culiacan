package api_clima.service;

import api_clima.dto.ClimaResponse;
import tools.jackson.databind.JsonNode;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

@Service
public class ClimaService {

    private final RestClient restClient;

    @Value("${openweather.api-key}")
    private String apiKey;

    public ClimaService(RestClient.Builder builder) {
        this.restClient = builder.build();
    }

    public ClimaResponse consultarClima() {

        JsonNode respuesta = restClient.get()
                .uri(uriBuilder -> uriBuilder
                        .scheme("https")
                        .host("api.openweathermap.org")
                        .path("/data/2.5/weather")
                        .queryParam("q", "Culiacan,MX")
                        .queryParam("units", "metric")
                        .queryParam("appid", apiKey)
                        .queryParam("lang", "es")
                        .build())
                .retrieve()
                .body(JsonNode.class);

        double temperatura = respuesta
                .path("main")
                .path("temp")
                .asDouble();

        String descripcion = respuesta
                .path("weather")
                .path(0)
                .path("description")
                .asText();

        return new ClimaResponse(
                "Culiacán",
                temperatura,
                descripcion
        );
    }
}