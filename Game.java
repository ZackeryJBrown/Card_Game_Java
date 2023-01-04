import java.util.Scanner;

public class Game {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Boolean gameRunning = true;
        int turnNumber = 1;


        Instructions instructions = new Instructions();
        instructions.printInstructions();
        
        
        while (gameRunning) {
            System.out.println("Turn:" + turnNumber);
            
            
            String userInput = scanner.nextLine();
            if (userInput.equals("draw")){
                System.out.println("card drawn");
                //method to remove a card from a Deque class deck (top card)
            }else if (userInput.equals("help")){
                System.out.println("Type \"draw\" to draw a card, \"play card\" or \"end turn\"");
                
            }else if (userInput.equals("play card")){
                //ask user what card to play from hand
                //remove that card from the hand
                //place that card onto the 'table'
                //inform user which card has just been played to the table
            }else if (userInput.equals("end turn")){
                //create a separate method that will resolve combat between two cards
                turnNumber = turnNumber + 1;
            }else if (userInput.equals("exit")){
                System.out.println("Thanks for playing!");
                gameRunning = false;
            }else{
                System.out.println("Error, wrong input");
                gameRunning = false;
            }
        }

        scanner.close();
    }
}
