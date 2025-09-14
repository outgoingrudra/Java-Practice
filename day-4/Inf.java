interface A{
    void work();
    static void play(){
        System.out.println("Play !!!!");
    }
}

class Inf implements A{
        public void work(){
            System.out.println("Working!!!");
        }

        public static void main(String[] args) {
            Inf i = new Inf();
             i.work();
             A.play();
             


        }

}