import java.util.ArrayList;
import java.util.Objects;


public class Selector {

    private static final int SUCCESS = -1;

    private static final int REPEATED_VOTE = 2;
    private static final int REPEATED_VOTER = 3;

    private static final int MAX_QUEUE = 7;

//    enum Const {
//        SUCCESS(1), REPEATED_VOTE(2), REPEATED_VOTER(3), MAX_QUEUE(7)
//    }

    private String[] winners = {"", "", "", "", "", "", ""};

    private ArrayList<Ballot> Votes;

    // Seta o seletor caso não haja votos antigos

    public void Selector()
    {
        Votes = new ArrayList<>();
    }

    //DONE
    public String mostVoted()
    {
        String mostVoted = "";
        String key;
        int value;
        int flag = 0;

        ArrayList<Ballot> counter = new ArrayList<>();

        for(Ballot iBallotIT : Votes)
        {
            key = iBallotIT.getRestaurant();

            if (counter.isEmpty())
            {

                Ballot newBallot = new Ballot(null, key);
                newBallot.setVotes_number(1);
                counter.add(newBallot);

            } else {

                for(Ballot jBallotIT : counter)
                    if (key.equals(jBallotIT.getRestaurant())) {

                        flag = 1;

                        jBallotIT.increment();
                    }

                if(flag == 0)
                {
                    Ballot newBallot2 = new Ballot(null, key);
                    newBallot2.setVotes_number(1);
                    counter.add(newBallot2);
                }

            }

            flag = 0;
        }

        value = 0;
        for(Ballot mBallotIT : counter)
            if (mBallotIT.getVotes() > value)
            {
                value = mBallotIT.getVotes();
                mostVoted = mBallotIT.getRestaurant();
            }

        return mostVoted;
    }

    //DONE
    public int cleanList()
    {
        Votes.clear();
        return SUCCESS;
    }

    //DONE
    public int newVote(String name, String restaurant)
    {

        if(!verifyName(name))
            return REPEATED_VOTER;

        if(!verifyRestaurant(restaurant)) {
            return REPEATED_VOTE;
        }

        Ballot ballot = new Ballot(name, restaurant);
        Votes.add(ballot);

        return SUCCESS;
    }

    //DONE
    public boolean verifyRestaurant(String restaurant)
    {
        if(restaurant == "")
            return false;

        for(String winner : winners)
            if (Objects.equals(winner, restaurant))
                return false;

        return true;
    }

    //DONE
    public boolean verifyName(String name)
    {
        if(name == "")
            return false;

        for(Ballot eachvote : Votes)
            if (Objects.equals(eachvote.getName(), name))
                return false;

        return true;
    }

    //DONE
    public void pushQueue(String pusher)
    {
        for(int j = MAX_QUEUE - 1; j > 0; j--)
        {
            winners[j] = winners[j-1];
        }

        winners[0] = pusher;
    }

    //DONE
    public void setWinners(String[] winners) {
        this.winners = winners;
    }

    //DONE
    public String[] getWinners() {
        return winners;
    }

}
