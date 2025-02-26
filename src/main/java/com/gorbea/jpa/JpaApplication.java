package com.gorbea.jpa;

import com.github.javafaker.Faker;
import com.gorbea.jpa.models.Author;
import com.gorbea.jpa.models.Video;
import com.gorbea.jpa.repositories.AuthorRespository;
import com.gorbea.jpa.repositories.VideoRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class JpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(JpaApplication.class, args);
	}

	// Ingresa un dato a la base de datos cuando se levanta
	@Bean
	public CommandLineRunner commandLineRunner(
		AuthorRespository repository,
		VideoRepository videoRepository
	){
		return args -> {
			/*for(int i=0; i<50;i++){
				Faker faker = new Faker();
				var author = Author.builder()
						.firstName(faker.name().firstName())
						.lastName(faker.name().lastName())
						.age(faker.number().numberBetween(19,50))
						.email(faker.name().username() + "@gorbea.com")
						.build();
				repository.save(author);
			}*/
			/*var author = Author.builder()
					.firstName("John")
					.lastName("Doe")
					.age(42)
					.email("john@doe.com")
					.build();
			repository.save(author);*/
			/*var video = Video.builder()
					.name("abc")
					.length(5)
					.build();
			videoRepository.save(video);*/
		};
	}

}

