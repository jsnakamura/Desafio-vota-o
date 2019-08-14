import java.util.Scanner;

public class NewWinnerScreen {

    private Selector  votes;
    private String[] oldwinner;
    private Printer write;
    private String newWinner;

    public NewWinnerScreen(Selector oldVotes)
    {
        votes = oldVotes;
        write = new Printer();
    }

    public String getWinner()
    {
        newWinner = votes.mostVoted();

        return newWinner;
    }

    public void setWinners(String[] winner) {
        this.oldwinner = winner;
    }

    public void setVotes(Selector oldVotes)
    {
        votes = oldVotes;
    }

}
