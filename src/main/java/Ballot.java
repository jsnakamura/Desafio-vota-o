public class Ballot {

    private String name;
    private String restaurant;
    private int votes_number = 0;


    public Ballot(String name, String restaurant) {
        this.name = name;
        this.restaurant = restaurant;
    }

    public String getName() { return this.name; }

    public String getRestaurant() { return restaurant; }

    public int getVotes_number() { return votes_number;}

    public void setVotes_number(int votes_number) { this.votes_number = votes_number; }
}
