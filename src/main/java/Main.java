public class Main {


    public static void main(String[] args) {


        /*-----------variables----------*/

        Selector selector = new Selector();
        Printer printer = new Printer();
        Reader reader = new Reader();
        NewVoteScreen voteScreen = new NewVoteScreen(selector, printer, reader);
        NewWinnerScreen winnnerScreen = new NewWinnerScreen(selector);

        String[] oldwinners = new String[7];
        String Option;

        /*------------------------------*/

        selector.Selector();

          // Begin true main logic
        while(true)
            {
                printer.print("Type your option (New vote, Winner, Help, Exit): ");
                Option = reader.read();

                switch (Option) {
                    case "New vote":

                        voteScreen.setVotes(selector);
                        int flag = voteScreen.createVote();

                        if(flag == -1)
                        {
                            selector = voteScreen.getVotes();
                            printer.print("You have successfully voted!");
                        }
                        else if(flag == 2) {
                            printer.print("You can't vote for this restaurant!");
                        }
                        else if (flag == 3) {
                            printer.print("You have already voted!");
                        }
                        else if (flag == 4) {
                            printer.print("You must Type your name!");
                        }
                        else if(flag == 5)  {
                            printer.print("You must type the restaurant's name!");
                        }

                        break;

                    case "Winner":

                        String win;

                        winnnerScreen.setWinners(oldwinners);

                        winnnerScreen.setVotes(selector);

                        win = winnnerScreen.getWinner();

                        oldwinners = winnnerScreen.getOldwinner();


                        if(win == "") {
                            printer.print("There were no votes for this election!");
                        }
                        else {
                            printer.print("The winner is: ");
                            printer.print(win);
                        }

                        break;

                    case "Help":
                        printer.print("New vote: Type your name and the restaurant of your choice. You can't vote twice per election. You can't vote in a restaurant that won in the last 7 elections.");
                        printer.print("Winner: Show the election winner. Reset for a new election.");
                        printer.print("Exit: Exit the election.");
                        break;

                    case "Exit":
                        printer.print("Good Bye");
                        System.exit(0);
                        break;

                    default:
                        printer.print("Choose a valid option!");
                        break;
                }
            }
    }
}
