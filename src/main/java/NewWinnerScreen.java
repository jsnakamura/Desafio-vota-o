public class NewWinnerScreen {

    private Selector  selector;
    private Printer printer;
    private String newWinner;

    public NewWinnerScreen(Selector oldVotes)
    {
        selector = oldVotes;
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

    public void setWinners(String[] winner) {
        selector.setWinners(winner);
    }

    public void setVotes(Selector oldVotes)
    {
        selector = oldVotes;
    }

}
