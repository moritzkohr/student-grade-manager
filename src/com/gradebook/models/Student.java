package com.gradebook.models;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Student extends Person implements Comparable<Student>, Serializable {
    private List<Double> grades;
    private Map<String, Double> courseGrades;
    private double gpa;

    public Student(String name, String id) {
        super(name, id);
        this.grades = new ArrayList<>();
        this.courseGrades = new HashMap<>();
        this.gpa = 0.0;
    }

    public void addGrade(String course, double grade) {
        if (grade < 0 || grade > 100) {
            throw new IllegalArgumentException("Grade must be between 0 and 100");
        }
        this.grades.add(grade);
        this.courseGrades.put(course, grade);
        calculateGPA();
    }

    public double calculateGPA() {
        if (grades.isEmpty()) {
            return 0.0;
        }
        double sum = grades.stream().mapToDouble(Double::doubleValue).sum();
        this.gpa = sum / grades.size();
        return this.gpa;
    }

    @Override
    public int compareTo(Student o) {
        return Double.compare(this.gpa, o.gpa);
    }

    @Override
    public String toString() {
        return String.format("Student: %s (ID: %s): %.2f", name, id, gpa);
    }

    public List<Double> getGrades() {
        return new ArrayList<>(grades);
    }

    public Map<String, Double> getCourseGrades() {
        return new HashMap<>(courseGrades);
    }

    public double getGPA() {
        return gpa;
    }
}
