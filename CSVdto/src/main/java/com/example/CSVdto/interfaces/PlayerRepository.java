package com.example.CSVdto.interfaces;


import com.example.CSVdto.models.Player;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlayerRepository extends JpaRepository<Player, Long> {}