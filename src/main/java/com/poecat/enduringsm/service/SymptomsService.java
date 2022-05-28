package com.poecat.enduringsm.service;

import com.poecat.enduringsm.exception.SymptomNotFoundException;
import com.poecat.enduringsm.model.Symptoms;
import com.poecat.enduringsm.repository.SymptomsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Optional;

@Service
public class SymptomsService {

    @Autowired
    private SymptomsRepository symptomsRepository;

    public void save(Symptoms symptoms) {
        symptomsRepository.save(symptoms);
    }

    public Symptoms get(Long id) throws SymptomNotFoundException {
        Optional<Symptoms> symptoms = symptomsRepository.findById(id);

        if (symptoms.isPresent()) {
            return symptoms.get();
        }
        throw new SymptomNotFoundException("Couldn't find any symptom with ID " + id);
    }


    public void delete(Long id) throws SymptomNotFoundException {
        Long count = symptomsRepository.countById(id);
        if(count == null || count == 0) {
            throw new SymptomNotFoundException("Couldn't find any symptom with ID " + id);
        }
        symptomsRepository.deleteById(id);
    }
}
