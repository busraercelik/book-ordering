package java102.ordering.book;

import java.util.*;

class Student implements Comparable<Student>{
    private int id;
    private String fname;
    private double cgpa;
    public Student(int id, String fname, double cgpa) {
        super();
        this.id = id;
        this.fname = fname;
        this.cgpa = cgpa;
    }
    public int getId() {
        return id;
    }
    public String getFname() {
        return fname;
    }
    public double getCgpa() {
        return cgpa;
    }

//    The compareTo method compares the receiving object with the specified object
    public int compareTo(Student student){
// if students have same cgpa then compare their names, if their names are also same then compare id's
        if (this.cgpa == student.cgpa){
            if (this.fname.compareTo(student.fname) == 0) {
                return id - student.id;
            } else{
                return fname.compareTo(student.fname);
            }
        } else{
            if (student.cgpa > cgpa)
                return 1;
            else
                return -1;
        }
    }
}

//Complete the code
class Solution
{
    public static void main(String[] args){
        Student studentArr[] = {
                new Student(33,"Rumpa",3.68),
                new Student(85 ,"Ashis", 3.85),
                new Student(56 ,"Samiha" ,3.75),
                new Student(19 ,"Samara" ,3.75),
                new Student(22 ,"Fahim" ,3.76)
        };
        List<Student> studentList = Arrays.asList(studentArr);
        Collections.sort(studentList);

        for(Student st: studentList){
            System.out.println(st.getFname());
        }
    }
}



