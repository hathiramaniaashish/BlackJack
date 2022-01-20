package blackjack.cards;

public class Ace extends Card {

    @Override
    public int getValue() {
        return 11;
    }
    
    public int getSecondValue() {
        return 1;
    }

    @Override
    public String toString() {
        return "Ace";
    }

}
