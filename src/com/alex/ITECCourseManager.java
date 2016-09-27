package com.alex;

import java.util.ArrayList;

public class ITECCourseManager {

    public static void main(String[] args) {

        ArrayList<ITECCourse> courses = new ArrayList<>();

        //add the maintenance course
	    ITECCourse maintenanceCourse = new ITECCourse("Microcomputer Systems Maintenance", 1310, 20);
        //add the course students
        maintenanceCourse.addStudent("Anna");
        maintenanceCourse.addStudent("Bill");
        maintenanceCourse.addStudent("Carl");
        //carl is out
        maintenanceCourse.removeStudent("Carl");
        //change max students to show you can
        maintenanceCourse.setMaxStudents(24);
        System.out.println("The max amount of students is now " + maintenanceCourse.getMaxStudents());
        //add the course to the array list
        courses.add(maintenanceCourse);

        //add the datacom course
        ITECCourse datacomCourse = new ITECCourse("Data Communications", 1425, 30);
        //add students
        datacomCourse.addStudent("Dave");
        datacomCourse.addStudent("Ed");
        datacomCourse.addStudent("Flora");
        //add course to list
        courses.add(datacomCourse);

        //do with java as you did with datacom
        ITECCourse javaCourse = new ITECCourse("Java Programming", 2545, 24);

        javaCourse.addStudent("Gus");
        javaCourse.addStudent("Harry");
        javaCourse.addStudent("Izzy");

        courses.add(javaCourse);

        //do with concepts as you did with datacom/java
        ITECCourse conceptsCourse = new ITECCourse("Info Tech Concepts", 1100, 30, "T3050");

        conceptsCourse.addStudent("Max");
        conceptsCourse.addStudent("Nancy");
        conceptsCourse.addStudent("Orson");

        courses.add(conceptsCourse);

        //go through each courses' info, and display how many seats are left in each
        for (ITECCourse course : courses){
            course.writeCourseInfo();
            System.out.println("There are " + course.getSeatsRemaining() + " seat(s) left in " + course.getName());
        }



    }
}
