public class Main {

    public static void clearScreen()
    {
        for(int tmp = 0; tmp < 50; tmp ++)
            System.out.println();
    }

    public static void main(String[] args) {


        /*-----------variables----------*/

        Selector votingBox = new Selector();
        Printer write = new Printer();
        Reader rdline = new Reader();
        NewVoteScreen voteScreen = new NewVoteScreen(votingBox);
        NewWinnerScreen winnnerScreen = new NewWinnerScreen(votingBox);

        String[] oldwinners = new String[7];
        String Option;

        /*------------------------------*/

        /*  Selector constructor  */
        votingBox.Selector();


        //   Begin true main logic
        while(true)
        {
            write.print("Type your option (New vote, Winner, Help, Exit): ");
            Option = rdline.read();

            switch (Option) {
                case "New vote":

                    voteScreen.setVotes(votingBox);
                    int flag = voteScreen.createVote();

                    if(flag == -1)
                    {
                        votingBox = voteScreen.getVotes();
                        write.print("You have successfully voted!");
                    }
                    else if(flag == 2) {
                        write.print("You can't vote for this restaurant!");
                    }
                    else if (flag == 3) {
                        write.print("You have already voted!");
                    }

                    break;

                case "Winner":

                    String win;

                    winnnerScreen.setWinners(oldwinners);

                    winnnerScreen.setVotes(votingBox);

                    win = winnnerScreen.getWinner();

                    oldwinners = winnnerScreen.getOldwinner();


                    if(win == "") {
                        write.print("There were no votes for this election!");
                    }
                    else {
                        write.print("The winner is: ");
                        write.print(win);
                    }

                    break;

                case "Help":
                    write.print("New vote: Type your name and the restaurant of your choice. You can't vote twice per election. You can't vote in a restaurant that won in the last 7 elections.");
                    write.print("Winner: Show the election winner. Reset for a new election.");
                    write.print("Exit: Exit the election.");
                    break;

                case "Exit":
                    write.print("Good Bye");
                    System.exit(0);
                    break;

                default:
                    write.print("Choose a valid option!");
                    break;
            }
        }
    }
}
