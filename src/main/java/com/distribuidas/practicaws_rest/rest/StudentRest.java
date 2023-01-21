package com.distribuidas.practicaws_rest.rest;

import com.distribuidas.practicaws_rest.models.Student;
import com.distribuidas.practicaws_rest.services.StudentServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/")
public class StudentRest {
    @Autowired
    private StudentServices sServicio;
    @GetMapping
    private ResponseEntity<List<Student>> listarTodasLasPersona (){
        return ResponseEntity.ok(sServicio.getAllPersonas());
    }

}
