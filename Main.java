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

      // Making the variables interactive
      System.out.println("Type an adjective: ");
      String adjective = input.nextLine();

      String adverbs = "together";
      String noun = "friend"; 
      String article = "the";
      String verb = "has";
      String noun1 = "basket"; 
      String number = "third";
      String color = "green";
      String number2 =  "fourth";
      String verb2 = "has";
      String noun2 = "pillow";

      // PRINT OUT STORY WITH VARIABLES (finish first)
      System.out.println("On a " + adjective + " Halloween night."); 
      System.out.println("Four friends get" + adverb+ "to go" + verb);
      System.out.println("One" + noun + "has a pumkin basket");
      System.out.println(article + "second friend" + verb + "a ghost" + noun);
      System.out.println("The" + number + "friend has a" + color + "monster basket");
      System.out.println("And the" + number + "friend" + verb + "a vampire" + noun + "case");

   }
}
