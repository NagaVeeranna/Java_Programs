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
        return "student name : " + sname + " \nstudent branch : " + sbranch + " \nstudent section : " + ssec + " \nstudent ID : " + sid;

    }
}
public class Student {
    public static void main(String[] args) {
        StudentInfo student = new StudentInfo("NAGA VEERANNA", "AIML", "section a", "24A95A6103");
System.out.println(student.displayInfo()); 
    }
}
