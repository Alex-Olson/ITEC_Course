package com.alex;

import java.util.ArrayList;

public class ITECCourse {
    private String name;
    private int code;
    private ArrayList<String> students;
    private int maxStudents;
    private String room;



    public ITECCourse(String courseName, int courseCode, int courseMaxStudents){
        this.name = courseName;
        this.code = courseCode;
        this.students = new ArrayList<String>();
        this.maxStudents = courseMaxStudents;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public int getMaxStudents() {
        return maxStudents;
    }

    public void setMaxStudents(int maxStudents) {
        this.maxStudents = maxStudents;
    }

    public void addStudent(String studentName){
        if (students.size() == maxStudents){
            System.out.println("Course is full - can't add " + studentName);
            System.out.println("The maximum number of students is " + maxStudents);
        } else {
            students.add(studentName);
        }
    }

    public void removeStudent(String studentName){
        if (students.contains(studentName)){
            students.remove(studentName);
            System.out.println(studentName + " was removed from " + this.name);
        } else{
            System.out.println(studentName + " wasn't found in " + this.name);
        }
    }

    public void writeCourseInfo(){
        System.out.println("Course Name: " + name);
        System.out.println("Course Code: " + code);
        System.out.println("Students enrolled:");
        for (String student : students){
            System.out.println(student);
        }
        System.out.println("There are " + getNumberOfStudents() + " students enrolled");
        System.out.println("The max number of students for this course is " + maxStudents);
    }

    public int getNumberOfStudents() {
        return this.students.size();
    }
}
