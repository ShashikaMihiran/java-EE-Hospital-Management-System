package com.hospital_ms.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hospital_ms.api.model.Doctor;
import com.hospital_ms.api.repository.DoctorRepository;

@Service
public class DoctorServiceImpl implements DoctorService{

    @Autowired
    private DoctorRepository doctorRepository;

    @Override
    public Doctor addDoctor(Doctor doctor) {
        // TODO Auto-generated method stub
        return doctorRepository.save(doctor);
    }

    @Override
    public List<Doctor> getAllDoctors() {
        // TODO Auto-generated method stub
        return doctorRepository.findAll();
    }

    @Override
    public Doctor getDoctor(Integer id) {
        // TODO Auto-generated method stub
        return doctorRepository.findById(id).get();
    }

    @Override
    public void deleteDoctor(Integer id) {
        // TODO Auto-generated method stub
        doctorRepository.deleteById(id);
    }
   
    
}
