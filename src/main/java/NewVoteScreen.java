public class NewVoteScreen {

    private Selector  selector;
    private Printer printer;
    private Reader reader;

    public NewVoteScreen(Selector oldVotes)
    {
        selector = oldVotes;
        printer = new Printer();
        reader = new Reader();
    }

    public int createVote()
    {
        int voted;
        String name;
        String restaurant;

        printer.print("Type your name: ");
        name = reader.read();

        printer.print("Type your vote: ");
        restaurant = reader.read();

        voted = selector.newVote(name, restaurant);

        return voted;
    }

    public Selector getVotes() {
        return selector;
    }

    public void setVotes(Selector selector) {
        this.selector = selector;
    }

}
