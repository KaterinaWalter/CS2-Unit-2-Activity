public class Main {

   public static void main(String []args) {
      System.out.println("Welcome to Magic 8 Ball! 🔮 Think of a question...");

      // Generate a random integer btwn 1-10
      int num = (int) (Math.random() * 10 + 1); 
      System.out.println(num);

      // Conditional block to test the value of NUM
      if ( num == 10 ) {
         System.out.println("Doubtful...");
      }
      else if ( num == 9 ) {
         System.out.println("Absolutely!!! NOT.");
      }




   } // close main method
} // close class
