import java.util.Scanner;

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

        int i, j, k;
        int num;
        String voted;
        String[] voteds = new String[7];

        /*------------------------------*/

        votingBox.Selector();



        num = votingBox.cleanList();

        i = votingBox.newVote("Juliano", "Sakaes");

        j = votingBox.newVote("Luiza", "Sakura");

        k = votingBox.newVote("Gui", "Sakura");

        k = votingBox.newVote("go", "kat");

        k = votingBox.newVote("Gu", "mix");

        k = votingBox.newVote("ui", "MOZ");

        k = votingBox.newVote("u", "fever");


        voted = votingBox.mostVoted();


        votingBox.pushQueue(voted);

        votingBox.pushQueue("1");
        votingBox.pushQueue("2");
        votingBox.pushQueue("3");
        votingBox.pushQueue(voted);
        votingBox.pushQueue("4");
        votingBox.pushQueue("5");



        voteds = votingBox.getWinners();

        for(int a = 0; a < 7; a++)
        {
            System.out.println(voteds[a] + " " + (a+1));
        }


        //System.out.println(num);

        System.out.println();
        write.print("mais votado:");

        System.out.println(voted);


        //   Begin true main logic
        while(true)
        {

            clearScreen();
            write.print("Type your option (New vote, Winner,  Exit): ");
            Option = rdline.read();

            switch (Option) {
                case "New vote":

                    voteScreen.setVotes(votingBox);

                    if(voteScreen.createVote() == -1)
                    {
                        write.print("You have successfully voted!");
                        votingBox = voteScreen.getVotes();
                    }
                    else if(voteScreen.createVote() == 2) {
                        write.print("You can't vote for this restaurant!");
                    }
                    else if (voteScreen.createVote() == 3) {
                        write.print("You have already voted!");
                    }

                    break;

                case "Winner":

                    winnnerScreen.setWinners(oldwinners);
                    winnnerScreen.setVotes(votingBox);
                    write.print("The winner is: ");
                    write.print(winnnerScreen.getWinner());

                    break;

                case "":
                    break;

                case "Exit":
                    write.print("");
                    System.exit(0);
                    break;
            }
        }
    }
}
