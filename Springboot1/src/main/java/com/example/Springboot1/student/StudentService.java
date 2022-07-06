package com.example.Springboot1.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.config.ConfigDataResourceNotFoundException;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;
    private List<Student> students =  Arrays.asList(

            new Student(5,"Nosiba","F","nosiba@gmail.com", LocalDate.of(2000,03,1)),
            new Student(6,"Hena","F","hena@gmail.com", LocalDate.of(1999,02,1))
            );

    public List<Student> getAll()
    {
        List<Student> students = new ArrayList<>(Arrays.asList(

                new Student(5,"Nosiba","F","nosiba@gmail.com", LocalDate.of(2000,03,1)),
                new Student(6,"Hena","F","hena@gmail.com", LocalDate.of(1999,02,1))
        ));
        return students;
    }

    public List<Student> getAllStudents() {
        return (List<Student>) studentRepository.findAll();
    }

    public Optional<Student> getStById(int id) {
        return studentRepository.findById(id);

    }

    public String addSt(Student student) {
        studentRepository.save(student);
        return "Successfully Add into database....";
    }

    public void updateSt(int id, Student student) {
      studentRepository.save(student);
    }

    public void deleteStudentById(int id) {
        studentRepository.deleteById(id);
    }

}
