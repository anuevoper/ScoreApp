package com.example.MongoDBConn;

import com.example.MongoDBConn.Repository.TeamRepository;
import com.example.MongoDBConn.model.Activity;
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

    public List<Team> getAllTeams() {
        return repository.findAll();
    }

    public Team findTeam(String id) {
        Optional<Team> teamOP = repository.findTeamById(id);
        if (teamOP.isEmpty()) {
            throw new IllegalArgumentException("Group Id Not Found");
        }
        return teamOP.get();
    }

    public void saveTeam(Team team) {
        repository.save(team);
    }

    public Team editTeam(Team newTeam, String id) {
        Team team = findTeam(id);

        team.setName(newTeam.getName());
        team.setParticipants(newTeam.getParticipants());
        team.setActivities(newTeam.getActivities());

        return repository.save(team);
    }

    public List<Activity> showTeamActivities(String teamId){
        return findTeam(teamId).getActivities();
    }

    public Team addActivityToTeam(Activity newActivity, String teamId) {
        Team team = findTeam(teamId);
        team.getActivities().add(newActivity);

        return repository.save(team);
    }

    public List<String> showTeamParticipants(String teamId){
        return findTeam(teamId).getParticipants();
    }

    public Team addParticipantToTeam(String participantName, String teamId) {
        Team team = findTeam(teamId);
        team.getParticipants().add(participantName);

        return repository.save(team);
    }

    public void deleteById(String id) {
        repository.deleteById(id);
    }
}
