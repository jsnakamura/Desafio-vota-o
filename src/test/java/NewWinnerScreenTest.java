import org.junit.Test;

import static org.junit.Assert.*;

public class NewWinnerScreenTest {

    @Test
    public void getWinner() {
        //Given
        Selector selector = new Selector();

        //When
        selector.Selector();

        selector.newVote("Juliano", "Sakaes");
        selector.newVote("Lu", "Sakura");
        selector.newVote("Carlos", "Sakaes");

        NewWinnerScreen newScreen = new NewWinnerScreen(selector);

        //Then
        assertEquals("Sakaes", newScreen.getWinner());
        assertNotEquals("Cream", newScreen.getWinner());
    }

    @Test
    public void setWinners() {
        //Given
        Selector selector = new Selector();
        selector.Selector();

        //When
        NewWinnerScreen newScreem = new NewWinnerScreen(selector);

        String[] winners = {"titi", "tata", "Hello", "Ok", "Sakaes", "Enodo", ""};
        String[] test = {"titi", "tata", "Hello", "Ok", "Sakaes", "Enodo", ""};

        newScreem.setWinners(winners);

        //Then
        assertArrayEquals(test, newScreem.getOldwinner());
    }

    @Test
    public void setVotes() {
        //Given
        Selector selector = new Selector();

        //When
        selector.Selector();

        selector.newVote("Juliano", "Sakaes");
        selector.newVote("Lu", "Sakura");
        selector.newVote("Carlos", "Sakaes");

        NewWinnerScreen newScreen = new NewWinnerScreen(selector);

        //Then
        assertEquals(selector, newScreen.getVotes());
    }
}