package com.example.MongoDBConn;

import com.example.MongoDBConn.Repository.TeamRepository;
import com.example.MongoDBConn.model.Team;
import org.springframework.stereotype.Component;
import java.util.List;
import java.util.Optional;

@Component
public class TeamService {
    TeamRepository repository;
    public TeamService(TeamRepository repository) {
        this.repository = repository;
    }

    public List<Team> getAllTeams(){
        return repository.findAll();
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

    public Team editTeam(Team team, String id){
        //TODO: figure out how to implement this with a no-sql DDBB
        return findTeamById(id);
    }

    public void deleteById(String id){
        repository.deleteById(id);
    }
}
