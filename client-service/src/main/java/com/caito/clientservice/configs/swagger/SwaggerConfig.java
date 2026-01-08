package com.caito.clientservice.configs.swagger;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeIn;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeType;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.security.SecurityScheme;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpHeaders;

/**
 * Swagger configuration class for the Client Service API.
 * This class sets up the OpenAPI definition and security scheme for the API documentation.
 *
 * @author caito
 *
 */
@Configuration
@OpenAPIDefinition(
        info = @Info(
                title = "Payments Platform / Client Service API",
                version = "1.0.0",
                description = "Client Service API Documentation for Payments Platform Application",
                contact = @Contact(name = "caito Vilas", email = "caitocd@gmail.com")
        )
)
@SecurityScheme(
        name = "security token",
        type = SecuritySchemeType.HTTP,
        paramName = HttpHeaders.AUTHORIZATION,
        in = SecuritySchemeIn.HEADER,
        scheme = "Bearer",
        bearerFormat = "JWT"
)
public class SwaggerConfig {
}
