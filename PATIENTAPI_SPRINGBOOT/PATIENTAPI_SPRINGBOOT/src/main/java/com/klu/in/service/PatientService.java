package com.klu.in.service;

import java.util.List;
import com.klu.in.model.Patient;

public interface PatientService {
    Patient addPatient(Patient patient);
    List<Patient> getAllPatients();
    Patient getPatientById(int id);
    Patient updatePatient(Patient patient);
    void deletePatientById(int id);
}
