package com.alex;

import java.util.ArrayList;

public class ITECCourse {
    private String name;
    private int code;
    private ArrayList<String> students;
    private int maxStudents;
    private String room;


    //constructor if you don't know the room
    public ITECCourse(String courseName, int courseCode, int courseMaxStudents){
        this.name = courseName;
        this.code = courseCode;
        this.students = new ArrayList<String>();
        this.maxStudents = courseMaxStudents;
    }
    //constructor if you do know the room
    public ITECCourse(String courseName, int courseCode, int courseMaxStudents, String courseRoom){
        this.name = courseName;
        this.code = courseCode;
        this.students = new ArrayList<String>();
        this.maxStudents = courseMaxStudents;
        this.room = courseRoom;
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
    //add a student to the course if it isn't full
    //if it is full, notify the user that the student couldn't be added
    public void addStudent(String studentName){
        if (students.size() == maxStudents){
            System.out.println("Course is full - can't add " + studentName);
            System.out.println("The maximum number of students is " + maxStudents);
        } else {
            students.add(studentName);
        }
    }

    //remove a student if they are in the class
    public void removeStudent(String studentName){
        if (students.contains(studentName)){
            students.remove(studentName);
            System.out.println(studentName + " was removed from " + this.name);
        } else{
            System.out.println(studentName + " wasn't found in " + this.name);
        }
    }
    /*write out the info for the class. Name, Code, Room(if there is one),
    student list, how many are enrolled, and what the max students that can be
    in this class are*/
    public void writeCourseInfo(){
        System.out.println("Course Name: " + name);
        System.out.println("Course Code: " + code);

        if (room != null){
            System.out.println("Course Room: " + room);
        }

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

    public int getSeatsRemaining(){
        return this.maxStudents - this.students.size();
    }
}
