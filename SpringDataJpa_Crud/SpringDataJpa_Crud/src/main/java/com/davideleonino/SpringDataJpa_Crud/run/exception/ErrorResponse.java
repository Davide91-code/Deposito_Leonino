package com.davideleonino.SpringDataJpa_Crud.run.exception;

import java.time.LocalDateTime;

public record ErrorResponse(
        String message,
        int status,
        LocalDateTime timestamp
) {
}


// definisce la struttura della risposta di errore.