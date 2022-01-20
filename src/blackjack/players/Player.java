package blackjack.players;

import blackjack.BlackJack;
import blackjack.cards.Card;
import java.util.List;

public class Player {
    private final List<Card> bet;

    public Player(List<Card> bet) {
        this.bet = bet;
    }

    public List<Card> getBet() {
        return bet;
    }
    
    public boolean isWinner(Player crupier) {
        if (BlackJack.isBlackJack(crupier.getBet())) {
            return false;
        } else if (BlackJack.isBlackJack(bet)) {
            return true;
        }
        
        int totalAmountCroupier = BlackJack.getTotalValueOfBet(crupier.getBet());
        int totalAmountPlayer = BlackJack.getTotalValueOfBet(bet);
        
        if (totalAmountPlayer > 21) {
            return false;
        } else if (totalAmountCroupier > 21) {
            return true;
        } else if (totalAmountPlayer > totalAmountCroupier) {
            return true;
        } else {
            return false;
        }
    }
    
}
