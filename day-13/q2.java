// enum
enum dept {
    CS , IT , CIVIL , ECE
}

public  class  q2{
    public static void main(String[] args) {
       
       dept vals[] = dept.values();
       for (Object v : vals) {
        System.out.print(" "+v);
           
       }
        

        
    }
}