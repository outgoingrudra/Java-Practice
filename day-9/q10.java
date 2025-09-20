class q10{
    public static void main(String[] args) {
        int a=3,b=0;
        try {
            a=a/b;
            System.out.println(" "+a);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage()+" Hierarchy shown");
        }
        catch(RuntimeException e){
            System.out.println(" "+e.getMessage());
        }
        finally{
            System.out.println("Code Ended ");
        }
    }
}