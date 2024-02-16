package cohorte16.homeservice;

import cohorte16.homeservice.models.Direction;
import cohorte16.homeservice.repositories.DirectionRepository;
import cohorte16.homeservice.services.DirectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HomeserviceApplication {

	public static void main(String[] args) throws Exception {

		SpringApplication.run(HomeserviceApplication.class, args);


	}

}
