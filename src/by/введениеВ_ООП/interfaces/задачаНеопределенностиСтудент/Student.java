package by.введениеВ_ООП.interfaces.задачаНеопределенностиСтудент;

import java.util.Objects;

public class Student implements Comparable<Student> {
    private int age;
    private String firstName;
    private String lastName;


    public Student(String firstName, String lastName, int age) {
        this.age = age;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Student(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age &&
                firstName.equals(student.firstName) &&
                lastName.equals(student.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, firstName, lastName);
    }

    @Override
    public int compareTo(Student o) {
        int result = lastName.compareToIgnoreCase(o.getLastName());
        if(result==0){
            result=firstName.compareToIgnoreCase(o.getFirstName());
            if(result==0){
                result=age-o.getAge();
            }

        }
        return result;
    }
    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
