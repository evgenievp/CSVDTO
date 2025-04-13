package com.example.CSVdto.mapper;

import com.example.CSVdto.dto.PlayerDTO;
import com.example.CSVdto.models.Player;
import com.example.CSVdto.models.Team;

public class PlayerMapper {

    public static PlayerDTO toDTO(Player player) {
        return new PlayerDTO(
                player.getId(),
                player.getName(),
                player.getPosition(),
                player.getTeam().getId()
        );
    }

    public static Player toEntity(PlayerDTO dto, Team team) {
        return new Player(
                dto.getName(),
                dto.getPosition(),
                team
        );
    }
}
