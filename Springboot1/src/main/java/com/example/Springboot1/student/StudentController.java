package com.example.Springboot1.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@RestController

public class StudentController {

    @Autowired
    private StudentService studentService;
    //Hello api call to check....
    @RequestMapping("/hello")
    public String getAllStudent()
    {
        return "Hello students";
    }

    //list of the students...
    @RequestMapping("/students")
    public List<Student> getAll()
    {
        return studentService.getAll();
    }

    //Get All the Students (fetch from database st_mg)
    @GetMapping("/all")
    public List<Student> getAllStudents()
    {
      return studentService.getAllStudents();
    }
    //Get Student By Id
    @GetMapping("/all/{id}")
    public Optional<Student> getStById(@PathVariable("id") int id)
    {
        return studentService.getStById(id);
    }
    //Add Student to the database
    // @RequestMapping(method = RequestMethod.POST,value="/all")
    @PostMapping("/add")
    public String addSt(@RequestBody Student student)
    {
     studentService.addSt(student);
     return "Successfully Add into database....";
    }
    //Update student to the database
    //@RequestMapping(method=RequestMethod.PUT,value="/all/{id}")
    @PutMapping("/update/{id}")
    public void UpdateSt(@RequestBody Student student, @PathVariable("id") int id)
    {
         studentService.updateSt(id,student);
    }
    //Delete by Id from the database
    //@RequestMapping(method=RequestMethod.DELETE,value="/all/{id}")
    @DeleteMapping("/delete/{id}")
    public void deleteStudentById(@PathVariable("id") int id)
    {
     studentService.deleteStudentById(id);
    }

}