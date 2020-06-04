package by.введениеВ_ООП.interfaces.задачаНеопределенностиСтудент;

public class FromFileStudentProvider implements StudentProvider {
    @Override
    public Student[] getStudents() { //считает данные из файла и преобразует в массив студентов
        return new Student[0];
    }
}
