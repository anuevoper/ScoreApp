package com.example.MongoDBConn.Controller;

import com.example.MongoDBConn.TeamService;
import com.example.MongoDBConn.model.Team;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
public class TeamController {

    /**** Following Spring organizaction recommendations, I inject dependencies through a constructor *****/
    TeamService teamService;
    public TeamController(TeamService teamService) {
        this.teamService = teamService;
    }

    @GetMapping("/team/{id}")
    public Team retrieveTeamById(@PathVariable String id){
        return teamService.findTeamById(id);
    }

    @PostMapping("/team/save")
    public void addTeam(Team team){
        teamService.saveTeam(team);
    }

}
