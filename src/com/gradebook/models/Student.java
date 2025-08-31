/**
 * Student class for managing individual student records and grades
 *
 * MILESTONE 1: Basic Class Structure
 * TODO M1-1: Create basic Student class with core fields
 * TODO M1-2: Add constructor with validation
 * TODO M1-3: Implement basic getters and setters
 * TODO M1-4: Override toString() method for display
 * TODO M1-5: Implement equals() and hashCode() for collections
 *
 * MILESTONE 2: Grade Management & Calculations
 * TODO M2-1: Implement calculateGPA() method with different scales support
 * TODO M2-2: Add addGrade(double grade) method with validation
 * TODO M2-3: Add removeGrade(int index) method
 * TODO M2-4: Add updateGrade(int index, double newGrade) method
 * TODO M2-5: Add getGradeCount() method
 * TODO M2-6: Add getAverageGrade() method
 * TODO M2-7: Handle empty grade lists in calculations
 * TODO M2-8: Add rounding to appropriate decimal places for GPA
 *
 * MILESTONE 3: Data Persistence
 * TODO M3-1: Make class implement Serializable interface
 * TODO M3-2: Add serialVersionUID for version compatibility
 * TODO M3-3: Ensure all fields are serializable
 *
 * MILESTONE 4: Search & Filter Support
 * TODO M4-1: Implement Comparable<Student> interface for sorting
 * TODO M4-2: Add compareTo() method for natural ordering (by GPA or name)
 * TODO M4-3: Consider adding multiple comparison methods for different sort criteria
 *
 * MILESTONE 7: Testing Support
 * TODO M7-1: Add validation methods for testing edge cases
 * TODO M7-2: Add debug/toString methods showing detailed state
 * TODO M7-3: Ensure all methods handle null inputs gracefully
 */
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
