package com.dbserver;

import java.util.ArrayList;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;

public class Selector {

    private static final int SUCCESS = -1;
    private static final int ERR = 1;
    private static final int REPEATED_VOTE = 2;

    ArrayList<Vote> Votes = new ArrayList<Vote>();

    public Vote mostVoted()
    {

        return null;
    }

    public int cleanList()
    {
        Votes.clear();
        return SUCCESS;
    }

    public int newVote(String name, String restaurant, LocalDate date, LocalTime time)
    {


        for(Vote i : Votes)
        {
            if(i.getName() == name)
                return REPEATED_VOTE;
        }

        Vote ballot = new Vote(name, restaurant, date, time);
        Votes.add(ballot);

        return SUCCESS;
    }
}
