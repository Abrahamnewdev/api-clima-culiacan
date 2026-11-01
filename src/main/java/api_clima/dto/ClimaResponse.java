package api_clima.dto;

public record ClimaResponse(
        String ciudad,
        double temperatura,
        String descripcion
) {}
