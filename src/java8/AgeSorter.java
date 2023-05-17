package java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class AgeSorter {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(new Student("raja", 37),
                new Student("sai", 28),
                new Student("Balu",39),
                new Student("lakshmi",65),
                new Student("Venkateswarlu",69));
        //students.sort(Comparator.comparing(Stud));
        System.out.println("---- Name Sort -----------");
        // Sorting on Name
        students.sort(Comparator.comparing(Student::getName).thenComparing(Student::getAge));
        students.forEach(System.out::println);
        //sorting on Age
        System.out.println("------- AGE Sort ----------");
        students.sort(Comparator.comparingInt(Student::getAge));
        students.forEach(System.out::println);
        //students.forEach(student -> System.out.print(student.getAge() + student.getName()));
    }
}
class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}