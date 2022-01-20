package blackjack.cards;

public class TenValueCard extends Card {

    @Override
    public int getValue() {
        return 10;
    }

    @Override
    public String toString() {
        return "TenValueCard";
    }
    
}
