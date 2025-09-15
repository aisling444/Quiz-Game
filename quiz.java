import java.util.Scanner;

public class Quiz {

  public static void main (String[] args) {
    //quiz qs + ans
    String[][] quiz = {
      {"What is the capital of Burkina Faso?" , "Ouagadougou"}, {"What is the term used for a group of flamingos?" , "Flamboyance"} ,
      {"What year was Heinz established?" , "1869"} , {"What is Oology the study of?" , "Eggs"} , {"What does 'Fitz' mean at the beginning of a surname?" , "Son of"}
      , {"Which country is known as the Land of the Thunder Dragon?" , "Bhutan"} , {"How many eyes does a bee have?" , "5"} , {"Who invented scissors?" , "Da Vinci"}
      , {"What is the hottest planet in our solar system?" , "Venus"} , {"What is a more popular name for the portrait titled 'La Gioconda'?" , "The Mona Lisa"} ,
      {"What is the longest running band still featuring it's original lineup?" , "U2"}
    };

    int score = 0;
    for (int i = 0; i < quiz.length; i++) {
      String question = quiz[i][0];
      String answer = quiz[i][1];

      System.out.println(question);
      Scanner scanner = new Scanner(System.in);
      String userInput = scanner.nextLine();

      if (userInput.equalsIgnoreCase(answer)) {
        System.out.println("Correct!!");
      } else {
        System.out.println("Wrong!! The answer is " + answer + ".");
      }
    }

    System.out.println("Your final score is " + score + " out of " + quiz.length + ".");
  }
}

