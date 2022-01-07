package java101.classes.studentgrading;

/**
 * Enter the verbal grade part of the course in the Course class and specify the effect
 * on the average for each course separately. Include your oral grades with the percentage of impact on the average
 */
public class Student {
    Course maths;
    Course physics;
    Course chemistry;
    String name;
    String stuNo;
    int classOfStudent;
    double average;
    boolean isPassed;

    public Student(Course maths, Course physics, Course chemistry, String name, String stuNo, int classOfStudent) {
        this.maths = maths;
        this.physics = physics;
        this.chemistry = chemistry;
        this.name = name;
        this.stuNo = stuNo;
        this.classOfStudent = classOfStudent;
        this.average = 0.0;
        this.isPassed = false;
    }

    void addBulkTestGrades(int grade1, int grade2, int grade3) {
        if (grade1 >= 0 && grade1 <=100) {
            this.maths.testGrade = grade1;
        }

        if (grade2 >= 0 && grade2 <=100) {
            this.physics.testGrade = grade2;
        }

        if (grade3 >= 0 && grade3 <=100) {
            this.chemistry.testGrade = grade3;
        }
    }

    void addBulkVerbalGrades(int grade1, int grade2, int grade3) {
        if (grade1 >= 0 && grade1 <=100) {
            this.maths.verbalGrade = grade1;
        }

        if (grade2 >= 0 && grade2 <=100) {
            this.physics.verbalGrade = grade2;
        }

        if (grade3 >= 0 && grade3 <=100) {
            this.chemistry.verbalGrade = grade3;
        }
    }



    void isPassed() {
        this.average = (this.maths.calculateAverage(this.maths.courseName) +
                        this.physics.calculateAverage(this.physics.courseName) +
                        this.chemistry.calculateAverage(this.chemistry.courseName))
                        / 3.0;
        System.out.println("=======================");
        if (this.average > 50) {
            System.out.println("You have passed!");
        } else {
            System.out.println("You have failed!");
        }
        System.out.println("Your average grade " + this.average);
        printGrades();
    }

    void printGrades() {
        System.out.println(maths.courseName + " test grade\t:" +
                maths.testGrade + "\n\tverbal grade\t: " + maths.verbalGrade);
        System.out.println(physics.courseName + " test grade\t:" +
                physics.testGrade+ "\n\tverbal grade\t:" + physics.verbalGrade);
        System.out.println(chemistry.courseName + " test grade\t:" +
                chemistry.testGrade+ "\n\tverbal grade\t:" + chemistry.verbalGrade);
    }

}
