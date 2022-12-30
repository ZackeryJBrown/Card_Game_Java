import java.util.HashMap;

public class Deck {
    
    int maxCards;
    int currentCardCount;
    HashMap<Integer, String> cardList;
    //int[] deckContents;
    

    public Deck() {
        this.currentCardCount = 20;
        this.maxCards = 20;
        //this.deckContents = new int[20];
        //Need map to contain the card objects
        HashMap<Integer, String> cardList = new HashMap<Integer, String>(maxCards);
    }


    void fillWithCards() {
        /*
        method:
        -randomly assigns an integer (card ID) to a variable only needed in this method
        -uses that integer to reference the corresponding card ID from a separate list of cards
        -does the following for loop 20 times (Int i = 0 ; i < deckContents.length ; i++):
            -instantiates an object of that card named "[player or computer][CardName]"
            -assigns that object (or array?) to the i index of deckContents
        */
        for (int i=0 ; i < cardList.size() ; i++){
            //add a random card
        }
    }


    //construction testing
    public static void main(String[] args){
        Deck playerDeck = new Deck();
        
        System.out.println("MaxCards:");
        System.out.println(playerDeck.maxCards);
        System.out.println("Current cards:");
        System.out.println(playerDeck.currentCardCount);

    }
    
}
