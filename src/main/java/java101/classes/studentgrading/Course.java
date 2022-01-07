package java101.classes.studentgrading;

public class Course {
    Teacher teacher;
    String courseName;
    String courseCode;
    String prefix;
    int testGrade;
    int verbalGrade;

    public Course(String courseName, String courseCode, String prefix) {
        this.courseName = courseName;
        this.courseCode = courseCode;
        this.prefix = prefix;
        this.testGrade = 0;
        this.verbalGrade = 0;
    }

    void addTeacher(Teacher teacher) {
        if (teacher.branch.equals(this.prefix))
            this.teacher = teacher;
        else
            System.out.println("Branch and prefix does not match!");
    }

    float calculateAverage(String courseName) {
        float verbalGradePct = getVerbalGradePct(courseName);
        return Math.round(this.verbalGrade * verbalGradePct) + ((1 - verbalGradePct) * this.testGrade);
    }

    float getVerbalGradePct(String courseName) {
        float verbalGradePct = 0;

        switch (courseName) {
            case ("Physics"):
                verbalGradePct = 0.2F;
                break;
            case ("Maths"):
                verbalGradePct = 0.15F;
                break;
            case ("Chemistry"):
                verbalGradePct = 0.12F;
                break;
            default:
                verbalGradePct = 0.1F;
        }
        return verbalGradePct;
    }


}
