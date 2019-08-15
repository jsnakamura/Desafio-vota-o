public class Main {


    public static void main(String[] args) {


        /*-----------variables----------*/

        Selector selector = new Selector();
        Printer write = new Printer();
        Reader rdline = new Reader();
        NewVoteScreen voteScreen = new NewVoteScreen(selector);
        NewWinnerScreen winnnerScreen = new NewWinnerScreen(selector);

        //String[] oldwinners = new String[7];

        String[] oldwinners = {"titi", "tata", "Hello", "Ok", "Sakaes", "Enodo", "kkk"};
        String Option;

        /*------------------------------*/

        /*  Selector constructor  */
        selector.Selector();

//        for(int i = 0; i < 7; i++)
//        {
//            oldwinners[i] = "";
//        }

//        selector.setWinners(oldwinners);


        //TESTS
        selector.setWinners(oldwinners);

        selector.pushQueue("ola");
        selector.pushQueue("ola");
        selector.pushQueue("ola");
        String[] test = selector.getWinners();

        for(String i: test)
            write.print(i);


        //   Begin true main logic
//        while(true)
//            {
//                write.print("Type your option (New vote, Winner, Help, Exit): ");
//                Option = rdline.read();
//
//                switch (Option) {
//                    case "New vote":
//
//                        voteScreen.setVotes(selector);
//                        int flag = voteScreen.createVote();
//
//                        if(flag == -1)
//                        {
//                            selector = voteScreen.getVotes();
//                            write.print("You have successfully voted!");
//                        }
//                        else if(flag == 2) {
//                            write.print("You can't vote for this restaurant!");
//                        }
//                        else if (flag == 3) {
//                            write.print("You have already voted!");
//                        }
//
//                        break;
//
//                    case "Winner":
//
//                        String win;
//
//                        winnnerScreen.setWinners(oldwinners);
//
//                        winnnerScreen.setVotes(selector);
//
//                        win = winnnerScreen.getWinner();
//
//                        oldwinners = winnnerScreen.getOldwinner();
//
//
//                        if(win == "") {
//                            write.print("There were no votes for this election!");
//                        }
//                        else {
//                            write.print("The winner is: ");
//                            write.print(win);
//                        }
//
//                        break;
//
//                    case "Help":
//                        write.print("New vote: Type your name and the restaurant of your choice. You can't vote twice per election. You can't vote in a restaurant that won in the last 7 elections.");
//                        write.print("Winner: Show the election winner. Reset for a new election.");
//                        write.print("Exit: Exit the election.");
//                        break;
//
//                    case "Exit":
//                        write.print("Good Bye");
//                        System.exit(0);
//                        break;
//
//                    default:
//                        write.print("Choose a valid option!");
//                        break;
//                }
//            }
    }
}
