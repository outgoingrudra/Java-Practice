
import java.lang.reflect.Field;
import java.lang.reflect.Method;

class My{
    private  int a ;
    protected  int b ;
    public int c;
    int d ;
    public My(){}

    public My(int a, int b, int c, int d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    public My(int a ,int b){}

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getC() {
        return c;
    }
}

class q5{
    public static void main(String[] args) {
        Class<?> c = My.class;
        System.out.println("Class name: " + c.getName());
        Field f[] = c.getDeclaredFields();
        for(Field i : f){
            System.out.print(" --- "+i);
        }

        Method m[] = c.getMethods();
        for(Method i : m){
            System.out.print(" --- "+i);
        }

        
    }
}