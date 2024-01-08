package com.hospital_ms.api.service;



import java.util.List;

import com.hospital_ms.api.model.Doctor;

public interface DoctorService {
    public Doctor addDoctor(Doctor doctor);
    public List<Doctor> getAllDoctors();
    public Doctor getDoctor(Integer id);
    public void deleteDoctor(Integer id);
    
}
