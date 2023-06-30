package com.example.MongoDBConn;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.example.MongoDBConn.Repository.TeamRepository;
import com.example.MongoDBConn.model.Team;




@SpringBootApplication
@EnableMongoRepositories
public class MongoDbConnApplication implements CommandLineRunner{

	@Autowired
	TeamService teamRepo;
	
	public static void main(String[] args) {
		SpringApplication.run(MongoDbConnApplication.class, args);
	}

	public void run(String... args) throws Exception {
		
		getTeamById("649937367041f1a2f10fa796");
		
	}
	
	public void getTeamById(String id) {
        System.out.println("Getting Team by id: " + id);
        
        Team team = teamRepo.findTeamById(id);

        System.out.println("La base de datos funciona OK y el nombre es: " + team.getName());
    }


}
