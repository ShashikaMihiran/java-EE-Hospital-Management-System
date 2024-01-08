package com.hospital_ms.api.controller;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hospital_ms.api.model.Doctor;
import com.hospital_ms.api.service.DoctorService;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PutMapping;





@RestController
@RequestMapping("/doctor")
@CrossOrigin
public class DoctorController {

    @Autowired
    private DoctorService doctorService;

    @PostMapping("/add")
    public String add(@RequestBody Doctor doctor){
        doctorService.addDoctor(doctor);
        return "New Doctor is added successfully";
    }
    
    @GetMapping("/getAll")
    public List<Doctor> getAllDoctors() {
        return doctorService.getAllDoctors();
    }
    
    @GetMapping("/{id}")
    public ResponseEntity<Doctor> getDoctor(@PathVariable Integer id) {
        // process Get by id request
        try {
            Doctor doctor = doctorService.getDoctor(id);
            return new ResponseEntity<Doctor>(doctor,HttpStatus.OK);
        } catch (NoSuchElementException e) {
            // handle exception
            return new ResponseEntity<Doctor>(HttpStatus.NOT_FOUND);
        }
    }
    
    @PutMapping("/{id}")
    public ResponseEntity<Doctor> update(@RequestBody Doctor doctor, @PathVariable Integer id) {
        // process PUT request
        try {
            Doctor existingDoctor= doctorService.getDoctor(id);
            doctorService.addDoctor(doctor);
            return new ResponseEntity<Doctor>(HttpStatus.OK);


        } catch (Exception e) {
            // handle exception
            return new ResponseEntity<Doctor>(HttpStatus.NOT_FOUND); 
        }

    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable Integer id){
        doctorService.deleteDoctor(id);
        return "Deleted Doctor id = " +id;
    }
    
}
