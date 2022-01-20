package blackjack.cards;

public class PipCard extends Card {
    private final int value;

    public PipCard(int value) throws Exception {
        if (value < 2 || value > 9) {
            throw new Exception("Error, el valor debe estar entre 2 y 9.");
        } else {
            this.value = value;
        }
    }

    @Override
    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "PipCard" + value;
    }
    
}
