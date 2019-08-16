public class NewVoteScreen {

    private Selector  selector;
    private Printer printer;
    private Reader reader;

    public NewVoteScreen(Selector selector, Printer printer, Reader reader)
    {
        this.selector = selector;
        this.printer = printer;
        this.reader = reader;
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

        if(name.isEmpty())
            return 4;

        if(restaurant.isEmpty())
            return 5;

        return voted;
    }

    public Selector getVotes() {
        return selector;
    }

    public void setVotes(Selector selector) {
        this.selector = selector;
    }
}
