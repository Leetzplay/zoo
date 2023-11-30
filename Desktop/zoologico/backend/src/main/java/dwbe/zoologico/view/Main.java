package dwbe.zoologico.view;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "dwbe.zoologico")
public class Main {
	public static void main(String[] args) {
		SpringApplication.run(Main.class, args);
	}
}


