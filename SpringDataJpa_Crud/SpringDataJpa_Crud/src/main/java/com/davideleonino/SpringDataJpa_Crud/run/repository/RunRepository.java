package com.davideleonino.SpringDataJpa_Crud.run.repository;


import com.davideleonino.SpringDataJpa_Crud.run.model.Run;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RunRepository extends JpaRepository<Run, Integer> {
}
