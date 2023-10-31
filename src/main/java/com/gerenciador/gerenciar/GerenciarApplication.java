package com.gerenciador.gerenciar;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.gerenciador.Entidades.Usuario;

@SpringBootApplication
public class GerenciarApplication {

	public static void main(String[] args) {
		SpringApplication.run(GerenciarApplication.class, args);

		Usuario u1 = new Usuario("pp@outlook", "040404", "Paulo");
		u1.status();

	

	}

}
