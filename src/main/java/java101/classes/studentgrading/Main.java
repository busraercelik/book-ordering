package java101.classes.studentgrading;

public class Main {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Henry", "555", "PHY");
        Teacher t2 = new Teacher("Jack", "556", "CHE");
        Teacher t3 = new Teacher("Sawyer", "557", "MAT");

        Course physics = new Course("Physics", "101", "PHY");
        physics.addTeacher(t1);

        Course chemistry = new Course("Chemistry", "101", "CHE");
        chemistry.addTeacher(t2);

        Course maths = new Course("Maths", "101", "MAT");
        maths.addTeacher(t3);

        Student s1 = new Student(maths, physics, chemistry, "Kate", "010",3);
        s1.addBulkTestGrades(100, 0, 50);
        s1.addBulkVerbalGrades(100, 20, 40);
        s1.isPassed();
    }
}
