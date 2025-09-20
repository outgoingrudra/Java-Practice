
import java.util.Date;

class Student{
    private  String roll ;
    private static  int count = 1;
    private String generateRoll(){
        Date d = new Date();
        return  "SVU"+"-"+(+d.getYear()+1900)+"-"+count;
    }

    public Student() {
        roll = generateRoll();
        count++;
    }

    public String getRoll() {
        return roll;
    }
    
    
}

class q4{
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();
        Student s4 = new Student();
        System.out.println("-> "+s1.getRoll());
        System.out.println("-> "+s2.getRoll());
        System.out.println("-> "+s3.getRoll());
        System.out.println("-> "+s4.getRoll());
    }
}