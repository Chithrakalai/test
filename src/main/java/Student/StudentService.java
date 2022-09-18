package Student;

import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class StudentService {

    public List<Student> getStudents() {
        return List.of(new Student("Akila", 21, 1234));
    }

    public List<Student> getStudent(int id) {
        //Student student =new Student("sathees",23,5678);
        return List.of(new Student("sathees", 23, 5678));
    }

    public List<Student> getStudentDetails(Student student) {
        System.out.println("in getStudentDetails service");
         return List.of(student);
    }

}