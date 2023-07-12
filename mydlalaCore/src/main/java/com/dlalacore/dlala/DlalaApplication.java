package com.dlalacore.dlala;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.AutoConfigurationPackage;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.dlalacore.dlala.entities.Utilisateur;
import com.dlalacore.dlala.reposetories.UtilisateurReposetorie;

@Configuration
@ComponentScan
@AutoConfigurationPackage
@EnableAutoConfiguration
@SpringBootApplication(scanBasePackages = { "com.spring.beans" })
public class DlalaApplication {
	private static final Logger log = LoggerFactory.getLogger(DlalaApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(DlalaApplication.class, args);
	}

	@Bean
	public CommandLineRunner demo(UtilisateurReposetorie repository) {
		return (args) -> {
			// fetch all customers
			log.info("users found with findAll():");
			log.info("-------------------------------");
			int cpt = 0;
			for (Utilisateur user : repository.findAll()) {
				// log.info(customer.toString());
				log.info(user.getNom_utilisateur());
				cpt++;
			}
			log.info("total user : " + cpt);
		};
	}
}
