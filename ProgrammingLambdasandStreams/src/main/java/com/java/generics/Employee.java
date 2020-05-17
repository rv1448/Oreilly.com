package com.java.generics;

import java.util.Objects;

public class Employee {
    final double salary;
    final String name;
    final int empid;
    static final Employee DEFAULT = new Employee();

    Employee(){
        this.name = "DEFAULT_EMP";
        this.salary = 1_000_000;
        this.empid = 0;
    }

    public Employee(double salary, String name, int empid) {
        this.salary = salary;
        this.name = name;
        this.empid = empid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Double.compare(employee.salary, salary) == 0 &&
                empid == employee.empid &&
                Objects.equals(name, employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(salary, name, empid);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "salary=" + salary +
                ", name='" + name + '\'' +
                ", empid=" + empid +
                '}';
    }

    public double getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    public int getEmpid() {
        return empid;
    }
}
