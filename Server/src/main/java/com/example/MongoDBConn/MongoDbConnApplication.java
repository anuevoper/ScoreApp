package com.example.MongoDBConn;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.example.MongoDBConn.model.Team;


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
