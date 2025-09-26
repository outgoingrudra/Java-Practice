//switch case
// enum
enum dept {
    CS , IT , CIVIL , ECE
}

public  class  q3{
    public static void main(String[] args) {
       
      dept d= dept.CIVIL;

      switch(d){
          case CS:
                System.out.println("Computer Science ");
                break;
         case IT:
                System.out.println("Information Tch ");
                break;
         case CIVIL :
            System.out.println("Civil ");
            break;
         case ECE:
            System.out.println("ECE");
            break;
            
              
            
          default:
              throw new AssertionError();
      }
       

        
    }
}