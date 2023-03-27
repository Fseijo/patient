package com.patient.controller;


import com.patient.model.Patient;
import com.patient.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PatientController {

      @Autowired
      private PatientService patientService;

//      Injecter la liste de patients

      @PostMapping("/addPatient")
      public Patient postPatient(@RequestBody Patient patient){
            return patientService.addPatient(patient);
      }

      @PostMapping("/addListPatient")
      public void postListPatient(@RequestBody List<Patient> patients){
            patientService.saveAllPatients(patients);
      }

      @GetMapping("/ListPatient")
      public List<Patient> getListPatient(){
            return patientService.findAllPatients();
      }

}
