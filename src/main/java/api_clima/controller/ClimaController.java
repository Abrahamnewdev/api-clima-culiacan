package api_clima.controller;

import api_clima.dto.ClimaResponse;
import api_clima.service.ClimaService;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/clima")
public class ClimaController {

    private final ClimaService climaService;

    public ClimaController(ClimaService climaService) {
        this.climaService = climaService;
    }

    @GetMapping
    public ClimaResponse obtenerClima() {
        return climaService.consultarClima();
    }
}