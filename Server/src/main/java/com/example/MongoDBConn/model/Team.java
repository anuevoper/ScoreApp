package com.example.MongoDBConn.model;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("Team")
public class Team {
	@Id
	private String id;
	
	private String name;
	private String participants;
	private String activities;
	
	public Team (String id, String name, String participants, String activities) { 
		super();
		this.id = id;
		this.setName(name);
		this.setParticipants(participants);
		this.setActivities(activities);
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getParticipants() {
		return participants;
	}

	public void setParticipants(String participants) {
		this.participants = participants;
	}

	public String getActivities() {
		return activities;
	}
	public void setActivities(String activities) {
		this.activities = activities;
	}
	
	
}