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
	TeamRepository teamRepo;
	
	public static void main(String[] args) {
		SpringApplication.run(MongoDbConnApplication.class, args);
	}

	public void run(String... args) throws Exception {
		
		getTeamByName("NZ team");
		
	}
	
	public void getTeamByName(String name) {
        System.out.println("Getting Team by name: " + name);
        
        Team team = teamRepo.findTeamByName(name);

        System.out.println("La base de datos funciona OK y el team es: " + team.getName());
    }


}
