package com.healthcare.backend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/doctors")
public class DoctorController {

    @Autowired
    private DoctorRepository repo;

    @PostMapping
    public Doctor addDoctor(@RequestBody Doctor doctor){
        return repo.save(doctor);
    }

    @GetMapping
    public List<Doctor> getDoctors(){
        return repo.findAll();
    }
}