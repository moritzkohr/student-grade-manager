# Student Grade Management System

A comprehensive console-based application for managing student records and calculating grades with persistent data storage.

## Table of Contents
- [Overview](#overview)
- [Features](#features)
- [Technical Skills Demonstrated](#technical-skills-demonstrated)
- [Getting Started](#getting-started)
- [Usage](#usage)
- [System Architecture](#system-architecture)
- [File Structure](#file-structure)
- [Testing](#testing)
- [Future Enhancements](#future-enhancements)

## Overview

The Student Grade Management System is a Java-based console application designed to efficiently manage student records, course enrollments, and grade calculations. The system provides a complete solution for educational institutions to track student performance with robust data persistence and comprehensive search capabilities.

## Features

### Core Functionality (MVP)

#### 📚 Student Management
- **Student Records**: Store student information including name, unique ID, and grades
- **GPA Calculation**: Automatic computation of Grade Point Average
- **Grade Tracking**: Maintain comprehensive grade history for each student

#### 🎓 Course Management  
- **Course Creation**: Define courses with unique codes and names
- **Student Enrollment**: Manage student enrollment in multiple courses
- **Course-based Analytics**: Track performance metrics per course

#### 📖 GradeBook System
- **Multi-Course Support**: Manage multiple courses and their enrolled students
- **Centralized Data**: Single point of access for all academic records
- **Batch Operations**: Perform operations across multiple students/courses

#### 💾 Data Persistence
- **File-based Storage**: Save and load student data using Java serialization
- **Data Integrity**: Ensure data consistency across application sessions
- **Backup Support**: Maintain reliable data storage and recovery

#### 🔍 Search & Filter Capabilities
- **ID-based Search**: Quick student lookup by unique identifier
- **Name Search**: Find students by partial or complete name matching
- **GPA Range Filtering**: Filter students within specific GPA ranges
- **Advanced Queries**: Support for complex search criteria

#### 📊 Statistical Analysis
- **Class Averages**: Calculate mean GPA and grade distributions
- **Performance Metrics**: Identify highest and lowest performing students
- **Trend Analysis**: Track academic performance over time

#### ✅ Input Validation & Error Handling
- **Grade Validation**: Ensure grades fall within acceptable ranges
- **Duplicate Prevention**: Handle duplicate student IDs gracefully
- **Robust Error Handling**: Comprehensive exception management
- **User-Friendly Messages**: Clear feedback for invalid operations

## Technical Skills Demonstrated

### Object-Oriented Programming
- **Inheritance Hierarchies**: Well-structured class relationships
- **Encapsulation**: Proper data hiding and access control
- **Polymorphism**: Interface-based design patterns
- **Abstraction**: Clean separation of concerns

### Data Structures & Collections
- **ArrayList Implementation**: Dynamic list management for grades and students
- **HashMap Optimization**: Fast O(1) lookups for student and course data
- **Custom Collections**: Specialized data structures for academic records

### Advanced Java Features
- **Exception Handling**: Comprehensive try-catch mechanisms
- **File I/O Operations**: Robust file reading and writing
- **Serialization**: Object persistence and data marshalling
- **Interface Implementation**: Comparable interface for custom sorting

### Algorithm Implementation
- **Sorting Algorithms**: Custom sorting by GPA, name, and other criteria
- **Search Algorithms**: Efficient data retrieval and filtering
- **Statistical Calculations**: Mathematical operations for grade analysis

### Software Engineering Practices
- **Unit Testing**: Comprehensive test coverage for grade calculations
- **Code Documentation**: Well-documented methods and classes
- **Error Handling**: Graceful failure management
- **Modular Design**: Reusable and maintainable code structure

## Getting Started

### Prerequisites
- Java Development Kit (JDK) 8 or higher
- Java IDE (IntelliJ IDEA, Eclipse, or VS Code with Java extensions)
- Git for version control

### Installation

1. **Clone the repository**
   ```bash
   git clone https://github.com/moritzkohr/student-grade-manager.git
   cd student-grade-manager
   ```

2. **Compile the project**
   ```bash
   javac -d bin src/**/*.java
   ```

3. **Run the application**
   ```bash
   java -cp bin com.gradebook.Main
   ```

### Quick Start

1. Launch the application
2. Create a new course using the course management menu
3. Add students to the system
4. Enroll students in courses
5. Input grades for students
6. Use search and analytics features to review performance

## Usage

### Main Menu Options

```
=== Student Grade Management System ===
1. Student Management
2. Course Management  
3. Grade Operations
4. Search & Filter
5. Statistics & Reports
6. Data Management
7. Exit
```

### Example Workflows

#### Adding a New Student
1. Select "Student Management" from main menu
2. Choose "Add New Student"
3. Enter student details (name, ID)
4. Confirm student creation

#### Recording Grades
1. Navigate to "Grade Operations"
2. Select student by ID or name
3. Choose course for grade entry
4. Input grade value
5. System automatically updates GPA

#### Generating Reports
1. Access "Statistics & Reports"
2. Choose report type (class average, top performers, etc.)
3. Apply filters if needed
4. View or export results

## System Architecture

### Class Structure

```
GradeBook
├── Student
│   ├── String name
│   ├── String studentId  
│   ├── List<Double> grades
│   └── double calculateGPA()
├── Course
│   ├── String courseName
│   ├── String courseCode
│   └── List<Student> enrolledStudents
└── GradeBookManager
    ├── Map<String, Student> students
    ├── Map<String, Course> courses
    └── FileManager fileManager
```

### Design Patterns
- **Singleton Pattern**: Single GradeBookManager instance
- **Factory Pattern**: Object creation for students and courses
- **Observer Pattern**: Grade change notifications
- **Strategy Pattern**: Different sorting and filtering strategies

## File Structure

```
student-grade-manager/
├── src/
│   ├── com/gradebook/
│   │   ├── models/
│   │   │   ├── Student.java
│   │   │   ├── Course.java
│   │   │   └── Grade.java
│   │   ├── managers/
│   │   │   ├── GradeBookManager.java
│   │   │   └── FileManager.java
│   │   ├── utils/
│   │   │   ├── InputValidator.java
│   │   │   └── StatisticsCalculator.java
│   │   └── Main.java
├── test/
│   ├── StudentTest.java
│   ├── CourseTest.java
│   └── GradeBookManagerTest.java
├── data/
│   └── students.dat
├── docs/
│   └── API_Documentation.md
└── README.md
```

## Testing

### Running Unit Tests

```bash
# Compile test files
javac -cp "bin:lib/junit-4.13.2.jar" -d test-bin test/**/*.java

# Run all tests
java -cp "bin:test-bin:lib/junit-4.13.2.jar" org.junit.runner.JUnitCore TestSuite
```

### Test Coverage
- ✅ Student GPA calculations
- ✅ Grade validation logic
- ✅ Course enrollment operations
- ✅ Search and filter functionality
- ✅ File I/O operations
- ✅ Statistical calculations

## Future Enhancements

### Planned Features
- [ ] **Web Interface**: Browser-based UI using Spring Boot
- [ ] **Database Integration**: MariaDB/PostgreSQL support
- [ ] **Grade History**: Detailed academic transcripts
- [ ] **Email Notifications**: Automated grade reports
- [ ] **Export Features**: PDF and Excel report generation
- [ ] **Multi-User Support**: Role-based access control

### Technical Improvements
- [ ] **REST API**: RESTful web services
- [ ] **Caching Layer**: Redis integration for performance
- [ ] **Logging Framework**: Comprehensive application logging
- [ ] **Configuration Management**: External configuration files
- [ ] **Docker Support**: Containerized deployment

---

## Contact

**Project Maintainer**: Moritz Kohr  
**Email**: moritz.kohr@mail.de  
**LinkedIn**: [Moritz Kohr](https://linkedin.com/in/moritz-r-kohr-b4a921333)  
**GitHub**: [@moritzkohr](https://github.com/moritzkohr)

---

*Built with ❤ for educational excellence*
