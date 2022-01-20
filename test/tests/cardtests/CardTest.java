package tests.cardtests;

import blackjack.cards.Ace;
import blackjack.cards.Card;
import blackjack.cards.PipCard;
import blackjack.cards.TenValueCard;
import org.junit.Test;
import static org.junit.Assert.*;

public class CardTest {
    
    @Test
    public void testCard_getValue_with_Ace() {
        Card ace = new Ace();
        
        assertEquals(11, ace.getValue());
    }
    
    @Test
    public void testCard_getSecondValue_with_Ace() {
        Ace ace = new Ace();
        
        assertEquals(1, ace.getSecondValue());
    }
    
    @Test
    public void testCard_getValue_with_TenValueCard() {
        Card tenValueCard = new TenValueCard();
        
        assertEquals(10, tenValueCard.getValue());
    }
   
    @Test
    public void testCard_getValue_with_PipCard_value_2() throws Exception {
        Card pipCard = new PipCard(2);
        
        assertEquals(2, pipCard.getValue());
    }
    
    @Test
    public void testCard_getValue_with_PipCard_value_9() throws Exception {
        Card pipCard = new PipCard(9);
        
        assertEquals(9, pipCard.getValue());
    }
    
    @Test
    public void testCard_getValue_with_PipCard_value_5() throws Exception {
        Card pipCard = new PipCard(5);
        
        assertEquals(5, pipCard.getValue());
    }
    
}
