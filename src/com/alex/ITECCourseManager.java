package com.alex;

public class ITECCourseManager {

    public static void main(String[] args) {
	    ITECCourse maintenanceCourse = new ITECCourse("Microcomputer Systems Maintenance", 1310, 20);

        maintenanceCourse.addStudent("Anna");
        maintenanceCourse.addStudent("Bill");
        maintenanceCourse.addStudent("Carl");

        maintenanceCourse.removeStudent("Carl");

        maintenanceCourse.writeCourseInfo();

        maintenanceCourse.setMaxStudents(24);
        System.out.println("The max amount of students is now " + maintenanceCourse.getMaxStudents());


        ITECCourse datacomCourse = new ITECCourse("Data Communications", 1425, 30);

        datacomCourse.addStudent("Dave");
        datacomCourse.addStudent("Ed");
        datacomCourse.addStudent("Flora");

        datacomCourse.writeCourseInfo();


        ITECCourse javaCourse = new ITECCourse("Java Programming", 2545, 24);

        javaCourse.addStudent("Gus");
        javaCourse.addStudent("Harry");
        javaCourse.addStudent("Izzy");

        javaCourse.writeCourseInfo();





    }
}
