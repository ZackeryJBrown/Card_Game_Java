import java.util.Scanner;

public class Game {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        Instructions instructions = new Instructions();
        instructions.printInstructions();
        
        String userInput = scanner.nextLine();
        System.out.println(userInput);
        String userString = userInput.toString();

        //should resolve to true but doesn't, above tested output is string
        if (userString == "draw"){
            System.out.println("card drawn");
        }else{
            System.out.println("Error");
        }

        scanner.close();
    }
}
