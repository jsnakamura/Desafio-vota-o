import org.junit.Test;

import static org.junit.Assert.*;

public class SelectorTest {

    @Test
    public void setWinners() {
        //Given
        Selector selector = new Selector();
        String[] test = {"String", "", "", "Ola", "", "", ""};
        String[] test2 = {"String", "", "", "Ola", "", "", ""};
        selector.Selector();

        //When
        selector.setWinners(test);

        //Then
        assertArrayEquals(test2, selector.getWinners());
    }

    @Test
    public void addNewVote() {
        //Given
        Selector selector = new Selector();

        //When
        selector.Selector();
        selector.pushQueue("Red Velvet");

        selector.newVote("Juliano", "Sakaes");
        selector.newVote("Antonia", "Sakura");

        //Then
        assertEquals(-1, selector.newVote("Carlos", "Sakaes"));
    }

    @Test
    public void voteOnPastWinner() {
        //Given
        Selector selector = new Selector();

        //When
        selector.Selector();
        selector.pushQueue("Red Velvet");

        selector.newVote("Juliano", "Sakaes");
        selector.newVote("Antonia", "Sakura");

        //Then
        assertEquals(2, selector.newVote("Fabio", "Red Velvet"));
    }

    @Test
    public void repeatVoter() {
        //Given
        Selector selector = new Selector();

        //When
        selector.Selector();
        selector.pushQueue("Red Velvet");

        selector.newVote("Juliano", "Sakaes");
        selector.newVote("Antonia", "Sakura");

        //Then
        assertEquals(3, selector.newVote("Juliano", "Enodo"));
    }

    @Test
    public void isRepeatVoterIfRepeatVoterAndRestaurant() {
        //Given
        Selector selector = new Selector();

        //When
        selector.Selector();
        selector.pushQueue("Red Velvet");

        selector.newVote("Juliano", "Sakaes");
        selector.newVote("Antonia", "Sakura");

        //Then
        assertEquals(3, selector.newVote("Juliano", "Sakaes"));
    }

    @Test
    public void pushQueue() {
        //Given
        Selector selector = new Selector();
        String[] winners = {"titi", "tata", "Hello", "Ok", "Sakaes", "Enodo", ""};
        String[] test = {"Hi", "titi", "tata", "Hello", "Ok", "Sakaes", "Enodo"};

        //When
        selector.Selector();
        selector.setWinners(winners);

        selector.pushQueue("Hi");

        //Then
        assertArrayEquals(test, selector.getWinners());
    }

    @Test
    public void falseIfContainRestaurant() {
        //Given
        Selector selector = new Selector();
        String[] test = {"titi", "tata", "Hello", "Ok", "Sakaes", "Enodo", ""};

        //When
        selector.Selector();
        selector.setWinners(test);

        //Then
        assertEquals(false, selector.verifyRestaurant("Sakaes"));
    }

    @Test
    public void trueIfNotContainRestaurant() {
        //Given
        Selector selector = new Selector();
        String[] test = {"titi", "tata", "Hello", "Ok", "Sakaes", "Enodo", ""};

        //When
        selector.Selector();
        selector.setWinners(test);

        //Then
        assertEquals(true, selector.verifyRestaurant("Hi"));
    }

    @Test
    public void falseIfContainName() {
        //Given
        Selector selector = new Selector();
        selector.Selector();

        //When
        selector.newVote("Juliano", "Sakaes");
        selector.newVote("Lu", "Sakaes");
        selector.newVote("Gui", "Sakaes");

        //Then
        assertEquals(false, selector.verifyName("Juliano"));
    }

    @Test
    public void trueIfNotContainName() {
        //Given
        Selector selector = new Selector();
        selector.Selector();

        //When
        selector.newVote("Juliano", "Sakaes");
        selector.newVote("Lu", "Sakaes");
        selector.newVote("Gui", "Sakaes");

        //Then
        assertEquals(true, selector.verifyName("Carlos"));
    }

    @Test
    public void mostVoted() {
        //Given
        Selector selector = new Selector();
        selector.Selector();

        //When

        selector.newVote("Juliano", "Alien");
        selector.newVote("Lu", "Sakaes");
        selector.newVote("jo", "Alien");
        selector.newVote("Gui", "Sakura");
        selector.newVote("Shinji", "Alien");
        selector.newVote("Choi", "Sakura");

        //Then
        assertEquals("Alien", selector.mostVoted());
    }

    @Test
    public void onDrawWinsTheFirst() {
        //Given
        Selector selector = new Selector();
        selector.Selector();

        //When

        selector.newVote("Juliano", "Enodo");
        selector.newVote("Lu", "Sakaes");
        selector.newVote("Gui", "Sakura");
        selector.newVote("jo", "Alien");
        selector.newVote("Shinji", "Alien");
        selector.newVote("Choi", "Sakura");

        //Then
        assertEquals("Sakura", selector.mostVoted());
    }
}