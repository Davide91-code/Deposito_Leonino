package com.davideleonino.SpringDataJpa_Crud.run.dto;

import java.time.LocalDateTime;

public record RunResponse(
        Integer id,
        String title,
        LocalDateTime startedOn,
        LocalDateTime completedOn,
        double miles,
        String location
) {}