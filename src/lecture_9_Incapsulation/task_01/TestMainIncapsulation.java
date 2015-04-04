package lecture_9_Incapsulation.task_01;



public class TestMainIncapsulation {

    public static void main(String[] args) {

        Employee employee = new Employee();
        
        System.out.println(employee.name);
        System.out.println(employee.age);
        System.out.println(employee.salary);
        
        employee.name="Vasya";
        System.out.println(employee.name);
        
    }

}
