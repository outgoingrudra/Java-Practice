// find length without length()

class q1{
    public static void main(String[] args) {
        int c = 0;
        String s = "Hello Bhai";
        for(char x : s.toCharArray()){
            c+=1;
        }
        System.out.println("String Length :"+c);
    }
}