package com.example.MongoDBConn.Controller;

import com.example.MongoDBConn.TeamService;
import com.example.MongoDBConn.model.Team;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/teams")
public class TeamController {

    /**** Following Spring organization recommendations, I inject dependencies through a constructor *****/
    TeamService teamService;
    public TeamController(TeamService teamService) {
        this.teamService = teamService;
    }

    @GetMapping("")
    public List<Team> getAllTeams (){
        return teamService.getAllTeams();
    }
    @GetMapping("/{id}")
    public Team retrieveTeamById(@PathVariable String id){
        return teamService.findTeamById(id);
    }

    @PostMapping("/save")
    public void addTeam(@RequestBody Team team){
        teamService.saveTeam(team);
    }

    @PutMapping("/{id}")
    public Team editTeam(@RequestBody Team team, @PathVariable String id){
        return teamService.editTeam(team, id);

        // note: not yet implemented
    }

    @DeleteMapping("/{id}")
    public void deleteTeamById(@PathVariable String id){
        teamService.deleteById(id);
    }
}
