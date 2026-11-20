package com.davideleonino.SpringDataJpa_Crud.run.dto;

import com.davideleonino.SpringDataJpa_Crud.run.model.Location;
import jakarta.validation.constraints.*;
import java.time.LocalDateTime;

public record RunRequest(

        @NotBlank(message = "Il titolo non può essere vuoto")
        @Size(min = 3, max = 100)
        String title,

        @NotNull(message = "La data di inizio è obbligatoria")
        LocalDateTime startedOn,

        @NotNull(message = "La data di fine è obbligatoria")
        LocalDateTime completedOn,

        @Positive(message = "Le miglia devono essere positive")
        double miles,

        @NotNull(message = "La location è obbligatoria")
        Location location

) {}