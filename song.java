// Zacharia Kornas
// 4/6/2021
// CSE142
// Paul George Druta
// Take-home Assessment #1
//
// This program will produce the song "There was an old woman who swallowed a fly".
// This program will also include a custom verse.
public class Song {
   public static void main(String[] args) {
      fly();
      spider();
      bird();
      cat();
      dog();
      phone();
      horse();
   }
   
   //Prints the 3 lines found at the end of the first 6 verses.
   public static void perhapsDie() {
      System.out.println("I don't know why she swallowed that fly,");
      System.out.println("Perhaps she'll die.");
      System.out.println();
   }
   
   // Prints the beginning of the spider verses
   // Calls method to print the end of the spider verse
   public static void spider() {
      System.out.println("There was an old woman who swallowed a spider,");
      System.out.println("That wriggled and iggled and jiggled inside her.");
      spiderDie();
   }
   
   // Prints the beginning of the bird verse 
   public static void bird() {
      System.out.println("There was an old woman who swallowed a bird,");
      System.out.println("How absurd to swallow a bird.");
      birdDie();
   }
   
   // Prints the beginning of the cat verse
   // Calls method to print the end of the cat verse 
   public static void cat() {
      System.out.println("There was an old woman who swallowed a cat,");
      System.out.println("Imagine that to swallow a cat.");
      catDie();
   }
   
   // Prints the beginning of the dog verse 
   public static void dog() {
      System.out.println("There was an old woman who swallowed a dog,");
      System.out.println("What a hog to swallow a dog.");
      dogDie();
   }
   
   // Prints the beginning of the phone verse
   public static void phone() {
      System.out.println("There was an old woman who swallowed a phone,");
      System.out.println("She did not know how to use a phone.");
      phoneDie();
   }
   
   // Prints the horse verse 
   public static void horse() {
      System.out.println("There was an old woman who swallowed a horse,");
      System.out.println("She died of course.");
   }
   
   // Prints the beginning of the fly verse
   public static void fly() {
      System.out.println("There was an old woman who swallowed a fly.");
      perhapsDie();
   }
   
   // Prints redundant line found in verses 2 through 6
   public static void spiderDie() {
      System.out.println("She swallowed the spider to catch the fly,");
      perhapsDie();
   }
   
   // Prints redundant line found in verses 3 through 6
   public static void birdDie() {
      System.out.println("She swallowed the bird to catch the spider,");
      spiderDie();
   }
   
   // Prints redundant line found in verses 4 through 6
   public static void catDie() {
      System.out.println("She swallowed the cat to catch the bird,");
      birdDie();
   }
   
   // Prints redundant line found in verses 5 and 6
   public static void dogDie() {
      System.out.println("She swallowed the dog to catch the cat,");
      catDie();
   }
   
   // Prints the end the 6th verse 
   public static void phoneDie() {
      System.out.println("She swallowed the phone to call the dog,");
      dogDie();
   }
}
