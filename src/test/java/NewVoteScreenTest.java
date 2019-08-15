import org.junit.Test;

import static org.junit.Assert.*;

public class NewVoteScreenTest {

    @Test
    public void setVotes() {
        //Given
        Selector selector = new Selector();

        //When
        selector.Selector();

        selector.newVote("Caio", "alibaba");
        selector.newVote("Gui", "hashtag");
        selector.newVote("joao", "alibaba");

        NewVoteScreen newScreen = new NewVoteScreen(selector);

        //Then
        assertEquals(selector, newScreen.getVotes());

    }

    @Test
    public void createVote() {

    }
}