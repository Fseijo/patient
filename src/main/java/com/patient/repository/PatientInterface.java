package com.patient.repository;

import com.patient.model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientInterface extends JpaRepository<Patient, Integer> {
}
