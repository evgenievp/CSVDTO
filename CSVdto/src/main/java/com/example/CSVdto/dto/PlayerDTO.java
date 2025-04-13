package com.example.CSVdto.dto;

public class PlayerDTO {
    private Long id;
    private String name;
    private String position;
    private Long teamId;

    public PlayerDTO() {}

    public PlayerDTO(Long id, String name, String position, Long teamId) {
        this.id = id;
        this.name = name;
        this.position = position;
        this.teamId = teamId;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getPosition() { return position; }
    public void setPosition(String position) { this.position = position; }

    public Long getTeamId() { return teamId; }
    public void setTeamId(Long teamId) { this.teamId = teamId; }
}
