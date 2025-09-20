class my{
    final int min = 1;
    final int gen ;
    final int max;

    public my() {
        this.gen = 0;
       
    }
    {
        max=3;
    }
    

}

class q1{
    public static void main(String[] args) {
        my m = new my();
        System.out.println(m.min+" "+m.gen+" "+m.max);

        
    }
}