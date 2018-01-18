package com.ctech.ft.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TeamEntity {

	@Id
	private String id;
	private String name;
	private String conference;
	
	@Override
    public String toString() {
        return String.format(
                "Team[id=%d, name='%s', conference='%s']",
                id, name, conference);
    }
	
}
