package org.sergey_white.comfortsofttask.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;

@Configuration
public class SwaggerConfig {
    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("Number Finder API")
                        .version("1.0")
                        .description("API для поиска N-го минимального числа в XLSX файле"));
    }
}