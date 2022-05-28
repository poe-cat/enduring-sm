package com.poecat.enduringsm.repository;

import com.poecat.enduringsm.model.Symptoms;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SymptomsRepository extends JpaRepository<Symptoms, Long> {
}
