package com.example.MongoDBConn.Repository;


import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.MongoDBConn.model.Team;
@Repository
public interface TeamRepository extends MongoRepository<Team, String>{
	
    @Query("{name:'?0'}")
    Team findTeamByName(String name);
    
    //public long count();

}
