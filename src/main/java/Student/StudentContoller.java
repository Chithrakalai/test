package Student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/WelcomeMessage")
public class StudentContoller {

    @Autowired
    private final StudentService studentService;

    public StudentContoller(StudentService studentService) {
        this.studentService = studentService;
    }
        @GetMapping
        public List<Student> getStudents() {
            return studentService.getStudents();
        }
    @GetMapping("/{id}")
    public List<Student> getStudent(@PathVariable Integer id) {
        System.out.println("id value :"+id);
        return studentService.getStudent(id);


    }
    @PostMapping("/student")
    public List<Student> getStudentDetails(@RequestBody Student student) {
        System.out.println("Inside getStudentDetails");

         Student stud=new Student("jack",34,7654);

        return studentService.getStudentDetails(stud);


    }
}