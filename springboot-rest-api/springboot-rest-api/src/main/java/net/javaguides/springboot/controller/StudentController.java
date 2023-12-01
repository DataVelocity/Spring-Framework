package net.javaguides.springboot.controller;

import net.javaguides.springboot.bean.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {

   
    @GetMapping("list")
    public Student getStudent(){
        Student student = new Student( 1, "Golu", "Sharma");
        return student;
    }

   
    @GetMapping("lists")
    public List<Student> getStudents(){
        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "Abhinav", "Singh"));
        students.add(new Student(2, "umesh", "Gupta"));
        students.add(new Student(3, "Mahatma", "Pandit"));
        students.add(new Student(4, "Sanjay", "Gandhi"));
        return students;
    }

    
    @GetMapping("lists/{id}/{first-name}/{last-name}")
    public Student studentPathVariable(@PathVariable("id") int studentId,
                                       @PathVariable("first-name") String firstName,
                                       @PathVariable("last-name") String lastName){
        return new Student(studentId, firstName, lastName);
    }

    // Spring boot REST API with Request Param
   
    @GetMapping("lists/query")
    public Student studentRequestVariable(@RequestParam int id,
                                          @RequestParam String firstName,
                                          @RequestParam String lastName){
        return new Student(id, firstName, lastName);
    }
}
