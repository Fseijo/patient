package com.patient.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDate;


@Entity
public class Patient {

      @Id
      @GeneratedValue(strategy = GenerationType.AUTO)
      private Long id;
      private String lastName;
      private String firstName;
      private LocalDate birthdate;
      private String address;
      private String gender;


//      Constructeur par défaut
      public Patient(){

      }
//      Constructeur par surchargé
      public Patient(Long id, String lastName, String firstName, LocalDate birthdate, String address, String gender) {
            this.id = id;
            this.lastName = lastName;
            this.firstName = firstName;
            this.birthdate = birthdate;
            this.address = address;
            this.gender = gender;
      }


      public Long getId() {
            return id;
      }

      public void setId(Long id) {
            this.id = id;
      }

      public String getLastName() {
            return lastName;
      }

      public void setLastName(String lastName) {
            this.lastName = lastName;
      }

      public String getFirstName() {
            return firstName;
      }

      public void setFirstName(String firstName) {
            this.firstName = firstName;
      }

      public LocalDate getBirthdate() {
            return birthdate;
      }

      public void setBirthdate(LocalDate birthdate) {
            this.birthdate = birthdate;
      }

      public String getAddress() {
            return address;
      }

      public void setAddress(String address) {
            this.address = address;
      }

      public String getGender() {
            return gender;
      }

      public void setGender(String gender) {
            this.gender = gender;
      }


      @Override
      public String toString() {
            return "Patient{" + "id=" + id + ", lastName='" + lastName + '\'' + ", firstName='" + firstName + '\'' + ", birthdate=" + birthdate + ", address='" + address + '\'' + ", gender='" + gender + '\'' + '}';
      }
}
