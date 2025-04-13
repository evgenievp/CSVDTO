package com.example.CSVdto.controller;

import com.example.CSVdto.interfaces.PlayerRepository;
import com.example.CSVdto.dto.PlayerDTO;
import com.example.CSVdto.interfaces.TeamRepository;
import com.example.CSVdto.mapper.PlayerMapper;
import com.example.CSVdto.models.Player;
import com.example.CSVdto.models.Team;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/players")
public class PlayerController {

    private final PlayerRepository playerRepo;
    private final TeamRepository teamRepo;

    @Autowired
    public PlayerController(PlayerRepository playerRepo, TeamRepository teamRepo) {
        this.playerRepo = playerRepo;
        this.teamRepo = teamRepo;
    }

    @GetMapping
    public List<PlayerDTO> getAllPlayers() {
        return playerRepo.findAll().stream()
                .map(PlayerMapper::toDTO)
                .collect(Collectors.toList());
    }

    @PostMapping
    public String addPlayer(@RequestBody PlayerDTO playerDTO) {
        Team team = teamRepo.findById(playerDTO.getTeamId()).orElse(null);
        if (team == null) {
            return " Team not found!";
        }

        Player player = PlayerMapper.toEntity(playerDTO, team);
        playerRepo.save(player);
        return " Player added!";
    }
}
