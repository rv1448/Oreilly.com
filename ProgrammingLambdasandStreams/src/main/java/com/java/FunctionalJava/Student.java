package com.java.FunctionalJava;
import java.util.function.Function;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Student {
    String name;
    List<String> courses;
    Double gpa;

    public Student() {

    }

    public static Student of(String name, double gpa, String... courses){
        Student self = new Student();
        self.name = name;
        self.courses = Arrays.asList(courses);
        return self;
    }

    public String getName() {
        return name;
    }

    public List<String> getCourses() {
        return Collections.unmodifiableList(courses);
    }

    public Double getGpa() {
        return gpa;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", courses=" + courses +
                ", gpa=" + gpa +
                '}';
    }

    public static void main(String[] args) {
        Function<Integer, Integer> square = x -> x*x;
        Function<Integer,Integer> linear = x -> x;
        List<Integer> listnum = Arrays.asList(1,2,3,4,5,6);
        listnum.stream().mapToInt(x -> square.apply(x)).toArray();



    }
}
