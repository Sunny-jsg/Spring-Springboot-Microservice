package in.ashokit.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;

@Configuration
public class SwaggerConfig {
	@Bean
	public OpenAPI apiDoc() {
        return new OpenAPI()
                .info(new Info()
                        .title("Contact Details Info")
                        .description("This API is for managing Contact Details ")
                        .version("1.0.0"));
    }



}
