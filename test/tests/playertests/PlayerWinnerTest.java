package tests.playertests;

import blackjack.cards.Card;
import blackjack.players.Player;
import blackjack.cards.Ace;
import blackjack.cards.PipCard;
import blackjack.cards.TenValueCard;
import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;

public class PlayerWinnerTest {

    @Test
    public void testPlayer_isWinner_with_BlackJack_and_Crupier_with_BlackJack() {
        List<Card> playerBet = new ArrayList<>();
        playerBet.add(new Ace());
        playerBet.add(new TenValueCard());
        
        List<Card> crupierBet = new ArrayList<>();
        crupierBet.add(new Ace());
        crupierBet.add(new TenValueCard());
        
        Player player = new Player(playerBet);
        Player crupier = new Player(crupierBet);
        
        assertFalse(player.isWinner(crupier));
    }
    
    @Test
    public void testPlayer_isWinner_with_BlackJack_and_Crupier_without_BlackJack() {
        List<Card> playerBet = new ArrayList<>();
        playerBet.add(new Ace());
        playerBet.add(new TenValueCard());
        
        List<Card> crupierBet = new ArrayList<>();
        crupierBet.add(new TenValueCard());
        crupierBet.add(new TenValueCard());
        
        Player player = new Player(playerBet);
        Player crupier = new Player(crupierBet);
        
        assertTrue(player.isWinner(crupier));
    }
    
    @Test
    public void testPlayer_isWinner_with_total_value_20_and_Crupier_with_total_value_20() {
        List<Card> playerBet = new ArrayList<>();
        playerBet.add(new TenValueCard());
        playerBet.add(new TenValueCard());
        
        List<Card> crupierBet = new ArrayList<>();
        crupierBet.add(new TenValueCard());
        crupierBet.add(new TenValueCard());
        
        Player player = new Player(playerBet);
        Player crupier = new Player(crupierBet);
        
        assertFalse(player.isWinner(crupier));
    }
    
    @Test
    public void testPlayer_isWinner_with_total_value_18_and_Crupier_with_total_value_17() throws Exception {
        List<Card> playerBet = new ArrayList<>();
        playerBet.add(new TenValueCard());
        playerBet.add(new PipCard(8));
        
        List<Card> crupierBet = new ArrayList<>();
        crupierBet.add(new TenValueCard());
        crupierBet.add(new PipCard(7));
        
        Player player = new Player(playerBet);
        Player crupier = new Player(crupierBet);
        
        assertTrue(player.isWinner(crupier));
    }
    
    @Test
    public void testPlayer_isWinner_with_total_value_20_and_Crupier_with_total_value_22() throws Exception {
        List<Card> playerBet = new ArrayList<>();
        playerBet.add(new TenValueCard());
        playerBet.add(new TenValueCard());
        
        List<Card> crupierBet = new ArrayList<>();
        crupierBet.add(new TenValueCard());
        crupierBet.add(new PipCard(5));
        crupierBet.add(new PipCard(7));
        
        Player player = new Player(playerBet);
        Player crupier = new Player(crupierBet);
        
        assertTrue(player.isWinner(crupier));
    }
    
    @Test
    public void testPlayer_isWinner_with_total_value_24_and_Crupier_with_total_value_17() throws Exception {
        List<Card> playerBet = new ArrayList<>();
        playerBet.add(new TenValueCard());
        playerBet.add(new PipCard(6));
        playerBet.add(new PipCard(8));
        
        List<Card> crupierBet = new ArrayList<>();
        crupierBet.add(new TenValueCard());
        crupierBet.add(new PipCard(7));
        
        Player player = new Player(playerBet);
        Player crupier = new Player(crupierBet);
        
        assertFalse(player.isWinner(crupier));
    }
    
}
