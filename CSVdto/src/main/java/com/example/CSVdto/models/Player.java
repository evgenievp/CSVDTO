package com.example.CSVdto.models;

import jakarta.persistence.*;

@Entity
public class Player {
    private String name;
    private String position;
    @ManyToOne
    @JoinColumn(name = "team_id") // или каквото ти е името на колоната
    private Team team;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public Player() {}

    public Player(String name, String position, Team team) {}


    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    public long getId() {
        return id;
    }

    public Team getTeam() {
        return team;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setTeam(Team team) {
        this.team = team;
    }

    public void setId(long id) {
        this.id = id;
    }
}
