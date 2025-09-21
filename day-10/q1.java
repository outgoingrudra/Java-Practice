class Student{
    String name ;
    int roll;
    int score ;

    public Student() {
         name ="";
         roll=-1;
         score=-1;
    }

    public Student(String name, int roll, int score) {
        this.name = name;
        this.roll = roll;
        this.score = score;
    }
    void display(){
        System.out.println("Name : "+name);
        System.out.println("Roll No : "+roll);
        System.out.println("score : "+score);
    }
   

}
class q1{
    public static void main(String[] args) {
        Student s1 = new Student("Rudra",12,67);
        s1.display();
    }
}