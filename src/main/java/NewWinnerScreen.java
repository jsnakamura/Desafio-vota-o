import java.util.ArrayList;

public class NewWinnerScreen {

    private Selector  selector;
    private String newWinner;
    private Printer printer;

    public NewWinnerScreen(Selector selector)
    {
        this.selector = selector;
        printer = new Printer();
    }

    public String getWinner()
    {
        newWinner = selector.mostVoted();

        selector.pushQueue(newWinner);

        selector.cleanList();

        return newWinner;
    }

    public String[] getOldwinner() { return selector.getWinners(); }

    public void setWinners(String[] winners) {
        selector.setWinners(winners);
    }

    public void setVotes(Selector selector)
    {
        this.selector = selector;
    }

    public Selector getVotes()
    {
        return selector;
    }
}
