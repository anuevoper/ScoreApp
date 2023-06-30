package com.example.MongoDBConn.Repository;


import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.MongoDBConn.model.Team;

import java.util.Optional;

@Repository
public interface TeamRepository extends MongoRepository<Team, String>{
	
    @Query("{id:'?0'}")
    Optional<Team> findTeamById(String id);
}
