package lecture_9_Incapsulation.task_5_mod;

import lecture_9_Incapsulation.task_05_access_modifiers.Employee;


public class Student extends Employee{
    private String firstName;
    public String lastName;
    int age;
    protected double salary;

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}
