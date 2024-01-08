package com.hospital_ms.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hospital_ms.api.model.Doctor;

@Repository
public interface DoctorRepository extends JpaRepository<Doctor,Integer>{
    
}
