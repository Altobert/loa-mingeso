package cl.usach.backend.loa.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cl.usach.backend.loa.entity.Student;
import cl.usach.backend.loa.services.StudentService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
@RequestMapping("/estudiantes")
public class ControllerEstudiantes {

    @Autowired
    private StudentService studentService;

    @GetMapping("/getAllStudents")
    public ResponseEntity<List<Student>>  getAllStudents() {
        List<Student> listStudents =  studentService.getAllStudents();
        return ResponseEntity.ok(listStudents);
    }
        

}
