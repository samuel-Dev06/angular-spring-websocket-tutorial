package org.example.studentmanagement.controler;

import org.example.studentmanagement.model.Student;
import org.example.studentmanagement.service.StudentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {
    private final StudentService studentService;

    public StudentController(StudentService studentServiceCons) {
        this.studentService = studentServiceCons;
    }
    @GetMapping("/get-all-students")
    public List<Student> getAllStudents() {
        return studentService.getAllStudents();
    }

    @PostMapping("/save-student")
    public Student addStudent(@RequestBody Student student) {
        return studentService.saveStudent(student);
    }

    @DeleteMapping("/delete-student/{id}")
    public void deleteStudent(@PathVariable Long id) {
        studentService.deleteStudent(id);
    }

    @PutMapping("/update-student")
    public Student updateStudent(@RequestBody Student student) {
        return studentService.updateStudent(student);
    }

}
