# API Clima Culiacán

API REST en Java 21 + Spring Boot que consulta el clima y temperatura actual de Culiacán, Sinaloa, consumiendo OpenWeatherMap.

Repo: `api-clima-culiacan` | Owner: `Abrahamnewdev`

# Endpoint principal

GET localhost:8080

** Respuesta Real (200 OK - Probada en Postman): **
```json
{
 "ciudad": "Culiacán",
 "temperatura": 27.79,
 "descripcion": "cielo claro"
}
```
Stack Tecnológico:

1. Java 21
2. Spring Boot 4 (Spring Web, RestTemplate)
3. OpenWeather APE
4. Maven Wrapper (mvnw)
5. Postman para pruebas

Como correr localmente:

1. Clonar repo:
git clone https://github.com/Abrahamnewdev/api-clima-culiacan.git

2. Configurar API KEY (No se sube a Github por seguridad):

En WindowsPowerShell ejecutar:
$env:OPENWEATHER_API_KEY="tu_key_aqui"

En Linux/Mac:
export OPENWEATHER_API_KEY="tu_key_aqui"

3. Correr:
./mvnw spring-boot:run

O desde IntelliJ IDEA Run > ApiClimaApplication
Probar: http://localhost:8080/api/clima

Regla de Seguridad:
La API KEY se lee como variable de entorno ${OPENWEATHER_API_KEY} en application.properties, no hardcodeada.

Desarrollado por Abraham Hermosillo como Proyecto de integración de APIs REST.
  
