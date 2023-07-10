package com.example.MongoDBConn.Controller;

import com.example.MongoDBConn.TeamService;
import com.example.MongoDBConn.model.Activity;
import com.example.MongoDBConn.model.Team;
import org.springframework.web.bind.annotation.*;

import java.util.AbstractCollection;
import java.util.List;

@RestController
@RequestMapping("/teams")
public class TeamController {

    /**Following Spring organization recommendations, I inject dependencies through a constructor *****/
    TeamService teamService;

    public TeamController(TeamService teamService) {
        this.teamService = teamService;
    }

    /**General endpoints*/
    @GetMapping
    public List<Team> getAllTeams() {return teamService.getAllTeams();}

    @PostMapping
    public void addTeam(@RequestBody Team team) {
        teamService.saveTeam(team);
    }

    @GetMapping("/{id}")
    public Team retrieveTeamById(@PathVariable String id) {
        return teamService.findTeam(id);
    }

    @PutMapping("/{id}")
    public Team editTeam(@RequestBody Team team, @PathVariable String id) {return teamService.editTeam(team, id);}

    @DeleteMapping("/{id}")
    public void deleteTeamById(@PathVariable String id) {teamService.deleteById(id);}

    /**Endpoints for team activities*/

    @GetMapping("/{id}/activities")
    public List<Activity> seeTeamActivities(@PathVariable String id){
        return teamService.showTeamActivities(id);
    }

    @PutMapping("/{id}/activities")
    public Team addActivity(@RequestBody Activity activity, @PathVariable String id){
        return teamService.addActivityToTeam(activity, id);
    }

    /**Endpoints for team participants*/

    @GetMapping("/{id}/participants")
    public List<String> seeTeamParticipants(@PathVariable String id){
        return teamService.showTeamParticipants(id);
    }

    @PutMapping("/{id}/participants")
    public Team addParticipant(@RequestBody String participantName, @PathVariable String id){
        return teamService.addParticipantToTeam(participantName, id);
    }
}
