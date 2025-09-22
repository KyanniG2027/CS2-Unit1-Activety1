// 1. IMPORT Scanner CLASS 
import java.util.Scanner; 


public class Main {

   public static void main(String []args) {
      System.out.println("Welcome to Madlibs!");

      // 2. Set up a Scanner OBJECT 
      Scanner input = new Scanner(System.in);
      // System .in refers to the physical keyboard!

      // 3. Use the Scanner to take input 
      System.out.println("Type your name then press enter");
      String player = input.nextLine();
      System.out.println("Welcome," + player);
      String adjective = "scary";
      String adverbs = "together";
      String noun = "friend"; 
      String article = "the";
      String verb = "has";
      String noun = "basket"; 
      String number = "third";
      String color = "green"
      String number =  "fourth";
      String verb = "has";
      String noun = "pillow";
      System.out.println("On a " + adjective + " Halloween night."); 
      
   }
}
