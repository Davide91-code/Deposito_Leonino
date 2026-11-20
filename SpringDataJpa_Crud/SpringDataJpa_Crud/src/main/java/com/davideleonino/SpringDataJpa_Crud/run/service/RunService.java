package com.davideleonino.SpringDataJpa_Crud.run.service;

import com.davideleonino.SpringDataJpa_Crud.run.dto.RunRequest;
import com.davideleonino.SpringDataJpa_Crud.run.dto.RunResponse;
import com.davideleonino.SpringDataJpa_Crud.run.exception.RunNotFoundException;
import com.davideleonino.SpringDataJpa_Crud.run.model.Run;
import com.davideleonino.SpringDataJpa_Crud.run.repository.RunRepository;

import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class RunService {

    private final RunRepository runRepository;

    public RunService(RunRepository runRepository) {
        this.runRepository = runRepository;
    }

    public List<RunResponse> findAll() {

        return runRepository.findAll()
                .stream()
                .map(this::toResponse)
                .toList();
    }

    public RunResponse findById(Integer id) {

        Run run = runRepository.findById(id)
                .orElseThrow(() -> new RunNotFoundException(id));

        return toResponse(run);
    }

    public RunResponse save(RunRequest request) {

        Run run = toEntity(request);

        Run saved = runRepository.save(run);

        return toResponse(saved);
    }

    // Conversione da RunRequest a Run :  toEntity trasforma i dati ricevuti dal client in Jpa.
    // il repository non può lavorare con i dto

    private Run toEntity(RunRequest request) {

        return new Run(
                request.title(),
                request.startedOn(),
                request.completedOn(),
                request.miles(),
                request.location()
        );
    }

    // Conversione da Run a RunResponse : toResponse fa il contrario, in modo tale da non esporre le entità
    private RunResponse toResponse(Run run) {

        return new RunResponse(
                run.getId(),
                run.getTitle(),
                run.getStartedOn(),
                run.getCompletedOn(),
                run.getMiles(),
                run.getLocation().name()
        );
    }
}