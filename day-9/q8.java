class q8{
    public static void main(String[] args) {
        int a[]= new int[5];
        try {
          for (int i = 0; i < 10; i++) {
              System.out.println(" "+a[i]);
          }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.toString());
        }
    }
}