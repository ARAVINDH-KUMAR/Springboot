package com.example.DBProject;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @GetMapping("/Student")
    public Student details(){
        return new Student ("Aravindh" , "Kumar");
    }

}
