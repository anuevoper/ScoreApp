package com.example.MongoDBConn;


import com.example.MongoDBConn.Service.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;


@SpringBootApplication
@EnableMongoRepositories
public class MongoDbConnApplication implements CommandLineRunner {

    @Autowired
    TeamService teamRepo;

    public static void main(String[] args) {
        SpringApplication.run(MongoDbConnApplication.class, args);
    }

    public void run(String... args) {
    }

}
