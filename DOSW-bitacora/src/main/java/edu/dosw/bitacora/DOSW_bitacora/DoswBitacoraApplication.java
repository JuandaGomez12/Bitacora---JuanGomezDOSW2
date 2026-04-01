package edu.dosw.bitacora.DOSW_bitacora;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "edu.dosw.bitacora")
public class DoswBitacoraApplication {

	public static void main(String[] args) {
		SpringApplication.run(DoswBitacoraApplication.class, args);
	}

}
