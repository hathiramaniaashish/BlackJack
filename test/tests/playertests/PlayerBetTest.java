package tests.playertests;

import blackjack.cards.Ace;
import blackjack.cards.Card;
import blackjack.cards.PipCard;
import blackjack.cards.TenValueCard;
import blackjack.players.Player;
import java.util.ArrayList;
import java.util.List;
import blackjack.BlackJack;
import org.junit.Test;
import static org.junit.Assert.*;

public class PlayerBetTest {

    @Test
    public void testPlayer_getBet_with_Ace_and_two_PipCard() throws Exception {
        List<Card> playerBet = new ArrayList<>();
        playerBet.add(new Ace());
        playerBet.add(new PipCard(7));
        playerBet.add(new PipCard(3));
        
        List<Card> expectedBet = new ArrayList<>();
        expectedBet.add(new Ace());
        expectedBet.add(new PipCard(7));
        expectedBet.add(new PipCard(3));
        
        Player player = new Player(playerBet);
        
        assertEquals(expectedBet.toString(), player.getBet().toString());
    }
    
    @Test
    public void testPlayer_getBet_with_Ace_and_TenValueCard() {
        List<Card> playerBet = new ArrayList<>();
        playerBet.add(new Ace());
        playerBet.add(new TenValueCard());
        
        List<Card> expectedBet = new ArrayList<>();
        expectedBet.add(new Ace());
        expectedBet.add(new TenValueCard());
        
        Player player = new Player(playerBet);
        
        assertEquals(expectedBet.toString(), player.getBet().toString());
    }
    
    @Test
    public void testPlayer_getTotalValueOfBet_with_Ace_and_two_PipCard() throws Exception {
        List<Card> playerBet = new ArrayList<>();
        playerBet.add(new Ace());
        playerBet.add(new PipCard(7));
        playerBet.add(new PipCard(3));
        
        Player player = new Player(playerBet);
        
        assertEquals(21, BlackJack.getTotalValueOfBet(player.getBet()));
    }
    
    @Test
    public void testPlayer_getTotalValueOfBet_with_Ace_and_TenValueCard() {
        List<Card> playerBet = new ArrayList<>();
        playerBet.add(new Ace());
        playerBet.add(new TenValueCard());
        
        Player player = new Player(playerBet);
        
        assertEquals(21, BlackJack.getTotalValueOfBet(player.getBet()));
    }
    
    @Test
    public void testPlayer_getTotalValueOfBet_with_two_TenValueCard_and_PipCard() throws Exception {
        List<Card> playerBet = new ArrayList<>();
        playerBet.add(new TenValueCard());
        playerBet.add(new TenValueCard());
        playerBet.add(new PipCard(5));
        
        Player player = new Player(playerBet);
        
        assertEquals(25, BlackJack.getTotalValueOfBet(player.getBet()));
    }
    
    @Test
    public void testPlayer_getTotalValueOfBet_with_all_PipCard() throws Exception {
        List<Card> playerBet = new ArrayList<>();
        playerBet.add(new PipCard(5));
        playerBet.add(new PipCard(5));
        playerBet.add(new PipCard(9));
        
        Player player = new Player(playerBet);
        
        assertEquals(19, BlackJack.getTotalValueOfBet(player.getBet()));
    }
    
    @Test
    public void testPlayer_getTotalValueOfBet_with_two_Ace() {
        List<Card> playerBet = new ArrayList<>();
        playerBet.add(new Ace());
        playerBet.add(new Ace());
        
        Player player = new Player(playerBet);
        
        assertEquals(12, BlackJack.getTotalValueOfBet(player.getBet()));
    }
    
}
