package com.example.MongoDBConn;

import com.example.MongoDBConn.Repository.TeamRepository;
import com.example.MongoDBConn.model.Team;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Component
public class TeamService {
    TeamRepository repository;
    public TeamService(TeamRepository repository) {
        this.repository = repository;
    }

    public Team findTeamById(String id){
        Optional<Team> teamOP = repository.findTeamById(id);
        if(teamOP.isEmpty()){
            throw new IllegalArgumentException("Group Id Not Found");
        }
        return teamOP.get();
    }

    public void saveTeam(Team team){
        repository.save(team);
    }
}
