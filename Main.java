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
    public StudentInfo(String sname, String sbranch) {
        this.sname = sname;
        this.sbranch = sbranch;
        this.ssec = "unknown";
        this.sid = "unknown";
    }
    String displayInfo() {
        return "student name : " + sname + " \nstudent branch : " + sbranch + " \nstudent section : " + ssec+ " \nstudent ID : " + sid;

    }
    
}
public class Main {
    public static void main(String[] args) {
        StudentInfo Student1 = new StudentInfo("NAGA VEERANNA", "AIML", "section a", "24A95A6103");
        StudentInfo Student2 = new StudentInfo("GANESH", "AIML");

        System.out.println("\nStudent 1 Information:");
        System.out.println(Student1.displayInfo()); 

        System.out.println("\nStudent 2 Information:");
        System.out.println(Student2.displayInfo());
     }
}
