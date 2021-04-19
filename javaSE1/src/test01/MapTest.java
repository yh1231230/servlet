package test01;

import java.util.HashMap;
import java.util.Map;

public class MapTest {
    public static void main(String[] args) {
        Map<Integer, String> m1 = new HashMap<>();
        m1.put(1, "一");
        m1.put(2, "二");
        m1.put(3, "三");
        System.out.println(m1.get(1));
        System.out.println(m1.size());
        System.out.println(m1.isEmpty());
        System.out.println(m1.containsKey(2));
        System.out.println(m1.containsValue("四"));

        Map<Integer, String> m2 = new HashMap<>();
        m2.put(4, "四");
        m2.put(5, "五");
        m1.putAll(m2);
        System.out.println(m1);
        m1.put(4, "four");//当相同键（equals判断）存放值时，新的值会将旧值覆盖
        System.out.println(m1);

        //==========================================

        Employee e1 = new Employee(1001, "老大", 8000);
        Employee e2 = new Employee(1002, "老二", 6000);
        Employee e3 = new Employee(1003, "老三", 5000);
        Map<Integer, Employee> map=new HashMap<>();
        map.put(e1.getId(),e1);
        map.put(e2.getId(),e2);
        map.put(e3.getId(),e3);

        Employee emp=map.get(1001);
        System.out.println(emp.getName());
        System.out.println(emp.hashCode());


        
    }
}

class Employee {
    private int id;
    private String name;
    private double salary;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Employee() {
    }

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
