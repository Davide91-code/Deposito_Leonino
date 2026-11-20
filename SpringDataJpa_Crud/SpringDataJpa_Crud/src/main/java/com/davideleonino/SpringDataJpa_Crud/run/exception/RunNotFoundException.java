package com.davideleonino.SpringDataJpa_Crud.run.exception;

public class RunNotFoundException extends RuntimeException {

    public RunNotFoundException(Integer id) {
        super("Run not found with id: " + id);
    }
}

// segnala che una Run non è stata trovata. 404
