import org.junit.Test;

import static org.junit.Assert.*;

public class SelectorTest {

    @Test
    public void setWinners() {
        //Given
        Selector selector = new Selector();
        String[] test = new String[7];
        String[] test2 = new String[7];

        //When
        selector.Selector();

        for(int i = 0; i < 7; i++) {
            test[i] = "";
            test2[i] = "";
        }


        test[0] = "String";
        test2[0] = "String";

        selector.setWinners(test);

        //Then
        assertArrayEquals(test2, selector.getWinners());
    }

    @Test
    public void newVote() {
        //Given
        Selector selector = new Selector();

        //When
        selector.Selector();
        selector.pushQueue("Red Velvet");

        selector.newVote("Juliano", "Sakaes");
        selector.newVote("Antonia", "Sakura");

        //Then
        assertEquals(-1, selector.newVote("Carlos", "Sakaes"));
        assertEquals(2, selector.newVote("Fabio", "Red Velvet"));
        assertEquals(3, selector.newVote("Juliano", "Enodo"));
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
    public void verifyRestaurant() {
        //Given
        Selector selector = new Selector();
        String[] test = {"titi", "tata", "Hello", "Ok", "Sakaes", "Enodo", ""};

        //When
        selector.Selector();
        selector.setWinners(test);

        //Then
        assertEquals(true, selector.verifyRestaurant("Sakaes"));
        assertEquals(false, selector.verifyRestaurant("Hi"));
    }

    @Test
    public void verifyName() {
        //Given
        Selector selector = new Selector();

        //When
        selector.Selector();

        selector.newVote("Juliano", "Sakaes");
        selector.newVote("Lu", "Sakaes");
        selector.newVote("Gui", "Sakaes");

        //Then
        assertEquals(true, selector.verifyName("Juliano"));
        assertEquals(false, selector.verifyName("Carlos"));
    }

    @Test
    public void mostVoted() {
        //Given
        Selector selector = new Selector();

        //When
        selector.Selector();

        selector.newVote("Juliano", "ko");
        selector.newVote("Lu", "Sakaes");
        selector.newVote("jo", "Alien");
        selector.newVote("Gui", "Sakura");
        selector.newVote("Shinji", "Alien");
        selector.newVote("Choi", "Sakura");


        //Then
        assertEquals("Alien", selector.mostVoted());

    }
}