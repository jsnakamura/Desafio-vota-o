public class NewVoteScreen {

    private Selector  Votes;
    private Printer write;
    private Reader rdline;

    public NewVoteScreen(Selector oldVotes)
    {
        Votes = oldVotes;
        write = new Printer();
        rdline = new Reader();
    }

    public int createVote()
    {
        int voted;
        String name;
        String restaurant;

        write.print("Type your name: ");
        name = rdline.read();

        write.print("Type your vote: ");
        restaurant = rdline.read();

        voted = Votes.newVote(name, restaurant);

        return voted;
    }

    public Selector getVotes() {
        return Votes;
    }

    public void setVotes(Selector votes) {
        Votes = votes;
    }

}