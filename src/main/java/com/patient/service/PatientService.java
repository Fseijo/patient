package com.patient.service;


import com.patient.model.Patient;
import com.patient.repository.PatientInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientService {

      @Autowired
      private PatientInterface patientInterface;

      public void saveAllPatients(List<Patient> patients){
            patientInterface.saveAll(patients);
      }

      public List<Patient> findAllPatients(){
            return patientInterface.findAll();
      }
}
