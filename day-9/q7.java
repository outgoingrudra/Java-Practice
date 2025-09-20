class q7{
    public static void main(String[] args) {
        int a=3,b=0;
        try {
            a=a/b;
        } catch (ArithmeticException e) {
            System.out.println(e.toString());
        }
    }
}