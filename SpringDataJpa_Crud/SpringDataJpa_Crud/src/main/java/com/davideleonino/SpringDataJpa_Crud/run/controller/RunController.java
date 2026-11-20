package com.davideleonino.SpringDataJpa_Crud.run.controller;

import com.davideleonino.SpringDataJpa_Crud.run.dto.RunRequest;
import com.davideleonino.SpringDataJpa_Crud.run.dto.RunResponse;
import com.davideleonino.SpringDataJpa_Crud.run.service.RunService;

import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/runs")
public class RunController {

    private final RunService runService;

    public RunController(RunService runService) {
        this.runService = runService;
    }

    @GetMapping
    public List<RunResponse> findAll() {
        return runService.findAll();
    }

    @GetMapping("/{id}")
    public RunResponse findById(@PathVariable Integer id) {
        return runService.findById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public RunResponse create(@Valid @RequestBody RunRequest request) {
        return runService.save(request);
    }
}