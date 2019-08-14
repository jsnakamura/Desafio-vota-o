public class NewWinnerScreen {

    private Selector  votes;
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

        votes.pushQueue(newWinner);

        votes.cleanList();

        return newWinner;
    }

    public String[] getOldwinner() { return votes.getWinners(); }

    public void setWinners(String[] winner) {
        votes.setWinners(winner);
    }

    public void setVotes(Selector oldVotes)
    {
        votes = oldVotes;
    }

}
