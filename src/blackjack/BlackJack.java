package blackjack;

import blackjack.players.Player;
import blackjack.cards.Card;
import blackjack.cards.Ace;
import java.util.ArrayList;
import java.util.List;

public class BlackJack {
    
    public static boolean isBlackJack(List<Card> bet) {
        return getTotalValueOfBet(bet) == 21 && bet.size() == 2;
    }
    
    public static int getTotalValueOfBet(List<Card> bet) {
        int totalValue = 0;
        int numberAces = 0;
        
        for (Card card : bet) {
            totalValue += card.getValue();
            if (card instanceof Ace)
                numberAces++;
        }
        
        while (totalValue > 21 && numberAces > 0) {
            totalValue -= 10;
            numberAces--;
        }
        
        return totalValue;
    }
    
    public static List<String> getWinners(Player player1, Player player2, Player player3, Player crupier, List<Card> deck) throws Exception {
        List<String> winners = new ArrayList<>();

        while (getTotalValueOfBet(crupier.getBet()) < 17) {
            crupier.getBet().add(deck.remove(0));
        }
        
        if (player1.isWinner(crupier))
            winners.add("Player1");
        if (player2.isWinner(crupier))
            winners.add("Player2");
        if (player3.isWinner(crupier))
            winners.add("Player3");
        if (winners.isEmpty())
            winners.add("Crupier");
        
        return winners;
    }

}
