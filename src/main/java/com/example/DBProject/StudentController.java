package com.example.DBProject;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;
import java.util.List;


@RestController
public class StudentController {

    @GetMapping("/Student")
    public Student details(){
        return new Student ("Demon" , "King");
    }

    @GetMapping("/StudentList")
    public List<Student> getStudent(){
        List<Student> students = new ArrayList<>();

        students.add(new Student("Demon","King"));
        students.add(new Student("White","Devil"));
        students.add(new Student("Dark","Angel"));
        students.add(new Student("Optimus","Prime"));
        students.add(new Student("Cypher","King"));
        return students;
    }
    @GetMapping("student/{firstname}/{lastname}")
    public Student studentPathVariyable(@PathVariable("firstname") String firstname1,
                                        @PathVariable("lastname") String lastname1){
        return new Student(firstname1,lastname1);
    }

    @GetMapping("/StudentSearch")
    public Student studentQuery(@RequestParam(name = "firstName") String firstName,
                                @RequestParam(name = "lastName") String lastName){
        return new Student (firstName,lastName);
    }
}
