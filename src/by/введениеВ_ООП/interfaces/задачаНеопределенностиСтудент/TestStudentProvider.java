package by.введениеВ_ООП.interfaces.задачаНеопределенностиСтудент;


//класс для тестирования
public class TestStudentProvider implements StudentProvider {
    @Override
    public Student[] getStudents() {
        return new Student[]{
                new Student(25), new Student(28), new Student(15)
        };
    }
}
