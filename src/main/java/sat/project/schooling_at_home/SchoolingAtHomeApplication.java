package sat.project.schooling_at_home;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import sat.project.schooling_at_home.admin.AdminController;

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan("sat.project.schooling_at_home")
public class SchoolingAtHomeApplication {

	public static void main(String[] args) {
		SpringApplication.run(SchoolingAtHomeApplication.class, args);
	}
	@Bean
	public WebMvcConfigurer corsConfigurer() {
		return new WebMvcConfigurer() {
			@Override
			public void addCorsMappings(CorsRegistry registry) {
				registry.addMapping("/**").allowedOrigins("http://localhost:4200").allowedMethods("POST","PUT","GET","DELETE");
			}
		};
	}

}
