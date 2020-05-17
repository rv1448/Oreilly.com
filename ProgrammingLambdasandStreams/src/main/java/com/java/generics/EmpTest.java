package com.java.generics;

import java.util.*;

public class EmpTest {
    public static List<Employee> getEmployees(){
      return   Arrays.asList(
                Employee.DEFAULT,
                new Employee(1,"PETER",78_000),
                new Employee(2,"SAMIR",96_000),
                new Employee(3,"MICHEAL",69_000),
                new Employee(4,"ANDREW",20_000),
                new Employee(5,"DAVE",88_000),
                new Employee(6,"ZICA",99_000),
                new Employee(7,"STEPHANIE",81_000)
        );
    }



    public static void main(String[] args) {
        List<Employee> employees = getEmployees();
        employees.stream().max(
                new Comparator<Employee>() {
                    @Override
                    public int compare(Employee o1, Employee o2) {
                        return Double.compare(o1.getSalary(),o2.getSalary());
                    }
                }
        );

        employees.stream().max(new Comparator<Object>() {
            @Override
            public int compare(Object o1, Object o2) {
                return o1.toString().compareTo(o2.toString());
            }
        });
    }
}
