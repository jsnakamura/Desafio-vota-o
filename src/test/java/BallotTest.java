import org.junit.Test;

import static org.junit.Assert.*;

public class BallotTest {

    @Test
    public void setVotes_number() {
        //Given
        Ballot ballot = new Ballot("Juliano", "Sakaes");

        //When
        ballot.setVotes_number(5);

        //Then
        assertEquals(5,ballot.getVotes_number());
    }
}