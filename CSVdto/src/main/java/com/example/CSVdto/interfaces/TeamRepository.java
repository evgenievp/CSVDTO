package com.example.CSVdto.interfaces;

import com.example.CSVdto.models.Team;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeamRepository extends JpaRepository<Team, Long> {}