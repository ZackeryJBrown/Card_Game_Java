
public class Deck {
    
    final int maxCards = 20;
    int currentCardCount;
    int[] deckContents;

    void deckConstructor() {
        this.currentCardCount = 20;
        this.deckContents = new int[20];
    }


    void cardSetter() {
        /*
        method:
        -randomly assigns an integer (card ID) to a variable only needed in this method
        -uses that integer to reference the corresponding card ID from a separate list of cards
        -does the following for loop 20 times (Int i = 0 ; i < deckContents.length ; i++):
            -instantiates an object of that card named "[player or computer][CardName]"
            -assigns that object (or array?) to the i index of deckContents
        */
    }


    //construction testing
    public static void main(String[] args){
        Deck playerDeck = new Deck();
        Deck computerDeck = new Deck();

        playerDeck.deckConstructor();

        System.out.println("MaxCards:");
        System.out.println(playerDeck.maxCards);
        System.out.println("Current cards:");
        System.out.println(playerDeck.currentCardCount);
        System.out.println("Deck Contents");
        System.out.println(playerDeck.deckContents[0]);
        System.out.println(playerDeck.deckContents[1]);

    }
    
}
