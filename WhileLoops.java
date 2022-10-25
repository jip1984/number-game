public class WhileLoops {
    public static void main(String[] args) {
        // use a while loop when it is not clear how many times it will run.
       double choice = 0.01;
       double guess = 0.99;

       while(guess > choice){
         guess = Math.random();
         System.out.println(guess);
       }
    }
}
