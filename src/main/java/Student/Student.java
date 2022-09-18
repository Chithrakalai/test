package Student;

public class Student {
private String name;
    private Integer age;
    private Integer rollno;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", rollno=" + rollno +
                '}';
    }

    public Student(String name, Integer age, Integer rollno) {
        this.name = name;
        this.age = age;
        this.rollno = rollno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getRollno() {
        return rollno;
    }

    public void setRollno(Integer rollno) {
        this.rollno = rollno;
    }
}
