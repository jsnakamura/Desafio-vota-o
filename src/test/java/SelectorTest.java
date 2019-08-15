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
    public void mostVoted() {
        //Given
        Selector selector = new Selector();

        //When
        selector.Selector();


        //Then
    }

    @Test
    public void pushQueue() {
        //Given
        //When
        //Then
    }

    @Test
    public void verifyRestaurant() {
        //Given
        //When
        //Then
    }

    @Test
    public void verifyName() {
        //Given
        //When
        //Then
    }
}