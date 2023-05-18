package aop;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class University {
    private List<Student> students = new ArrayList<>();

    public void  addStudents(){
        Student st1 = new Student("Dmitrii Skakun", 4, 3.25);

        Student st2 = new Student("Sidorov Oleg", 3, 4.25);

        Student st3 = new Student("Bogdanov Nikita", 2, 2.25);

        students.add(st1);
        students.add(st2);
        students.add(st3);
    }

    public List<Student> getStudents(){
        System.out.println("Начало работы метода getStudents:");
        // System.out.println(students.get(3));
        System.out.println("Information from getStudents:");
        System.out.println(students);
        return students;

    }

}
