package tests.blackjacktests;

import blackjack.BlackJack;
import blackjack.cards.Card;
import blackjack.cards.Ace;
import blackjack.cards.TenValueCard;
import blackjack.cards.PipCard;
import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;

public class BlackJackTest {
    
    @Test
    public void testBlackJack_isBlackJack_with_TenValueCard_and_Ace() {
        List<Card> bet = new ArrayList<>();
        bet.add(new Ace());
        bet.add(new TenValueCard());
        
        assertTrue(BlackJack.isBlackJack(bet));
    }
    
    @Test
    public void testBlackJack_isBlackJack_with_Ace_and_two_PipCard() throws Exception {
        List<Card> bet = new ArrayList<>();
        bet.add(new Ace());
        bet.add(new PipCard(6));
        bet.add(new PipCard(4));
        
        assertFalse(BlackJack.isBlackJack(bet));
    }
    
    @Test
    public void testBlackJack_isBlackJack_with_two_TenValueCard_and_Ace() {
        List<Card> bet = new ArrayList<>();
        bet.add(new TenValueCard());
        bet.add(new TenValueCard());
        bet.add(new Ace());
        
        assertFalse(BlackJack.isBlackJack(bet));
    }
    
    @Test
    public void testBlackJack_isBlackJack_with_all_PipCard() throws Exception {
        List<Card> bet = new ArrayList<>();
        bet.add(new PipCard(7));
        bet.add(new PipCard(5));
        bet.add(new PipCard(4));
        bet.add(new PipCard(3));
        bet.add(new PipCard(2));
        
        assertFalse(BlackJack.isBlackJack(bet));
    }
    
}
