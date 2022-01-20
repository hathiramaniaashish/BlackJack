package tests.winnerstests;

import blackjack.cards.Ace;
import blackjack.cards.Card;
import blackjack.cards.PipCard;
import blackjack.cards.TenValueCard;
import blackjack.players.Player;
import java.util.ArrayList;
import blackjack.BlackJack;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;

public class WinnersTest {
    
    @Test
    public void testWinners_getWinners_winner_should_be_player1() throws Exception {
        List<Card> player1Bet = new ArrayList<>();
        player1Bet.add(new Ace());
        player1Bet.add(new TenValueCard());
        
        List<Card> player2Bet = new ArrayList<>();
        player2Bet.add(new TenValueCard());
        player2Bet.add(new PipCard(5));
        player2Bet.add(new PipCard(6));
        
        List<Card> player3Bet = new ArrayList<>();
        player3Bet.add(new PipCard(3));
        player3Bet.add(new PipCard(6));
        player3Bet.add(new Ace());
        player3Bet.add(new PipCard(3));
        player3Bet.add(new Ace());
        player3Bet.add(new TenValueCard());
        
        List<Card> crupierBet = new ArrayList<>();
        crupierBet.add(new PipCard(9));
        crupierBet.add(new PipCard(7));
        
        List<Card> deck = new ArrayList<>();
        deck.add(new PipCard(5));
        deck.add(new PipCard(4));
        deck.add(new TenValueCard());
        deck.add(new PipCard(2));
        
        Player player1 = new Player(player1Bet);
        Player player2 = new Player(player2Bet);
        Player player3 = new Player(player3Bet);
        Player crupier = new Player(crupierBet);
        
        List<String> winners = new ArrayList<>();
        winners.add("Player1");
        
        assertEquals(winners, BlackJack.getWinners(player1, player2, player3, crupier, deck));
    }
    
    @Test
    public void testWinners_getWinners_winners_should_be_player1_and_player3() throws Exception {
        List<Card> player1Bet = new ArrayList<>();
        player1Bet.add(new TenValueCard());
        player1Bet.add(new TenValueCard());
        
        List<Card> player2Bet = new ArrayList<>();
        player2Bet.add(new TenValueCard());
        player2Bet.add(new PipCard(2));
        player2Bet.add(new PipCard(6));
        
        List<Card> player3Bet = new ArrayList<>();
        player3Bet.add(new PipCard(8));
        player3Bet.add(new PipCard(8));
        player3Bet.add(new PipCard(5));
        
        List<Card> crupierBet = new ArrayList<>();
        crupierBet.add(new PipCard(5));
        crupierBet.add(new TenValueCard());
        
        List<Card> deck = new ArrayList<>();
        deck.add(new Ace());
        deck.add(new PipCard(3));
        deck.add(new TenValueCard());
        deck.add(new PipCard(2));
        
        Player player1 = new Player(player1Bet);
        Player player2 = new Player(player2Bet);
        Player player3 = new Player(player3Bet);
        Player crupier = new Player(crupierBet);
        
        List<String> winners = new ArrayList<>();
        winners.add("Player1");
        winners.add("Player3");
        
        assertEquals(winners, BlackJack.getWinners(player1, player2, player3, crupier, deck));
    }
    
    @Test
    public void testWinners_getWinners_winner_should_be_player2() throws Exception {
        List<Card> player1Bet = new ArrayList<>();
        player1Bet.add(new TenValueCard());
        player1Bet.add(new PipCard(5));
        player1Bet.add(new PipCard(9));
        
        List<Card> player2Bet = new ArrayList<>();
        player2Bet.add(new TenValueCard());
        player2Bet.add(new PipCard(6));
        player2Bet.add(new PipCard(4));
        
        List<Card> player3Bet = new ArrayList<>();
        player3Bet.add(new PipCard(9));
        player3Bet.add(new PipCard(5));
        player3Bet.add(new PipCard(8));
        
        List<Card> crupierBet = new ArrayList<>();
        crupierBet.add(new TenValueCard());
        crupierBet.add(new PipCard(7));
        
        List<Card> deck = new ArrayList<>();
        deck.add(new PipCard(6));
        deck.add(new PipCard(3));
        deck.add(new TenValueCard());
        deck.add(new PipCard(2));
        
        Player player1 = new Player(player1Bet);
        Player player2 = new Player(player2Bet);
        Player player3 = new Player(player3Bet);
        Player crupier = new Player(crupierBet);
        
        List<String> winners = new ArrayList<>();
        winners.add("Player2");
        
        assertEquals(winners, BlackJack.getWinners(player1, player2, player3, crupier, deck));
    }
    
    @Test
    public void testWinners_getWinners_winners_should_be_player1_player2_and_player3() throws Exception {
        List<Card> player1Bet = new ArrayList<>();
        player1Bet.add(new TenValueCard());
        player1Bet.add(new PipCard(9));
        
        List<Card> player2Bet = new ArrayList<>();
        player2Bet.add(new TenValueCard());
        player2Bet.add(new PipCard(2));
        
        List<Card> player3Bet = new ArrayList<>();
        player3Bet.add(new PipCard(8));
        player3Bet.add(new PipCard(8));
        
        List<Card> crupierBet = new ArrayList<>();
        crupierBet.add(new TenValueCard());
        crupierBet.add(new PipCard(6));
        
        List<Card> deck = new ArrayList<>();
        deck.add(new PipCard(9));
        deck.add(new PipCard(3));
        deck.add(new TenValueCard());
        deck.add(new PipCard(2));
        
        Player player1 = new Player(player1Bet);
        Player player2 = new Player(player2Bet);
        Player player3 = new Player(player3Bet);
        Player crupier = new Player(crupierBet);
        
        List<String> winners = new ArrayList<>();
        winners.add("Player1");
        winners.add("Player2");
        winners.add("Player3");
        
        assertEquals(winners, BlackJack.getWinners(player1, player2, player3, crupier, deck));
    }
    
    @Test
    public void testWinners_getWinners_winners_should_be_crupier() throws Exception {
        List<Card> player1Bet = new ArrayList<>();
        player1Bet.add(new TenValueCard());
        player1Bet.add(new Ace());
        
        List<Card> player2Bet = new ArrayList<>();
        player2Bet.add(new TenValueCard());
        player2Bet.add(new PipCard(2));
        
        List<Card> player3Bet = new ArrayList<>();
        player3Bet.add(new PipCard(8));
        player3Bet.add(new PipCard(8));
        
        List<Card> crupierBet = new ArrayList<>();
        crupierBet.add(new TenValueCard());
        crupierBet.add(new Ace());
        
        List<Card> deck = new ArrayList<>();
        deck.add(new PipCard(5));
        deck.add(new PipCard(3));
        deck.add(new TenValueCard());
        deck.add(new PipCard(2));
        
        Player player1 = new Player(player1Bet);
        Player player2 = new Player(player2Bet);
        Player player3 = new Player(player3Bet);
        Player crupier = new Player(crupierBet);
        
        List<String> winners = new ArrayList<>();
        winners.add("Crupier");
        
        assertEquals(winners, BlackJack.getWinners(player1, player2, player3, crupier, deck));
    }
    
}
