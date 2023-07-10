package com.example.MongoDBConn.model;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.lang.reflect.Array;
import java.util.List;

@AllArgsConstructor
@Getter
@Setter
@Document("Team")
public class Team {
	@Id
	private String id;

	private String name;

	private List<String> participants;

	private List<Activity> activities;
}