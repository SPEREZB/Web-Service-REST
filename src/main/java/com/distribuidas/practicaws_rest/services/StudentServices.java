package com.distribuidas.practicaws_rest.services;

import com.distribuidas.practicaws_rest.models.Student;
import com.distribuidas.practicaws_rest.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StudentServices {
    @Autowired
    private StudentRepository sRepositorio;
    public List<Student> getAllPersonas (){
        return sRepositorio.findAll();
    }
}
