import java.util.ArrayList;


public class Selector {

    private static final int SUCCESS = -1;
    private static final int ERR = 1;
    private static final int REPEATED_VOTE = 2;
    private static final int REPEATED_VOTER = 3;
    private static final int NO_VOTES = 4;

    private String[] Winners;

    /*
        Votes contém os votos de todos os votos do dia; NÃO PODE CONTER VOTOS ANTIGOS;
    */

    private ArrayList<Ballot> Votes;

    // Seta o seletor caso não haja votos antigos

    public void Selector()
    {
        Votes = new ArrayList<>();
        Winners = new String[7];


        //CUIDAR AQUI POIS DEVE SER FEITO NO MAIN
        for(int i = 0; i < 7; i++)
        {
            Winners[i] = "";
        }
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

                        value = jBallotIT.getVotes_number();
                        value = value + 1;

                        jBallotIT.setVotes_number(value);
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
            if (mBallotIT.getVotes_number() > value)
            {
                value = mBallotIT.getVotes_number();
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


        for(String iterator : Winners)
        {
            if(iterator.equals(restaurant))
                return REPEATED_VOTE;
        }

        for(Ballot iterator : Votes)
        {
            if(iterator.getName().equals(name))
                return REPEATED_VOTER;

        }

        Ballot ballot = new Ballot(name, restaurant);
        Votes.add(ballot);

        return SUCCESS;
    }

    //DONE
    public ArrayList<Ballot> getVotes()
    {
        return Votes;
    }

    //DONE
    public void setWinners(String[] winners) {
        Winners = winners;
    }

    //DONE
    public int pushQueue(String pusher)
    {
        for(int i = 6; i >=0; i--)
        {
            if(i == 0)
            {
                Winners[i] = pusher;
                return SUCCESS;
            }

            Winners[i] = Winners[i-1];
        }

        return ERR;
    }

    //DONE
    public String[] getWinners() {
        return Winners;
    }

    // Seta o arraylist de votos caso haja uma lista antiga
    public void setVote(ArrayList<Ballot> Voting)
    {
        this.Votes = Voting;
    }

    // ISSO AQUI VAI NO CONTROLADOR DE DADOS

    public ArrayList<Ballot> readOldVotes()
    {

        return Votes;
    }
}
