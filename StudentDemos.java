class StudentInfo {
    String sname;
    String sbranch;
    String ssec;
    String sid;
public StudentInfo(String sname, String sbranch, String ssec, String sid) {
        this.sname = sname;
        this.sbranch = sbranch;
        this.ssec = ssec;
        this.sid = sid;
    }
   	String displayInfo() {
        return "student name : " + sname;
    }
    String displayInfo(String sbranch) {
        return "student name : " + sname + " \nstudent branch : " + sbranch ;
    }
    String displayInfo(String sbranch, String sec) {
        return "student name : " + sname + " \nstudent branch : " + sbranch + " \nstudent section : " + ssec;

    }
    String displayInfo(String sbranch, String ssec, String sid) {
        return "student name : " + sname + " \nstudent branch : " + sbranch + " \nstudent section : " + ssec + " \nstudent ID : " + sid;
    }
}

public class StudentDemos{
    public static void main(String[] args) {
        StudentInfo Student = new StudentInfo("NAGA VEERANNA", "AIML", "section a", "24A95A6103");

        System.out.println(Student.displayInfo()); 
        System.out.println(Student.displayInfo(Student.sbranch));
        System.out.println(Student.displayInfo(Student.sbranch, Student.ssec )); 
        System.out.println(Student.displayInfo(Student.sbranch, Student.ssec , Student.sid));
    }
} 
