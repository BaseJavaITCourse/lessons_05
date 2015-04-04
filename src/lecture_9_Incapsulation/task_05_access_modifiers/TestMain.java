package lecture_9_Incapsulation.task_05_access_modifiers;

import lecture_9_Incapsulation.task_5_mod.Student;


public class TestMain {
    public static void main(String[] args) {
        Student student = new Student();
        student.lastName = "Ivanov";
        System.out.println(student);


        Employee employee = new Employee();
        employee.salary=56;

    }
}
