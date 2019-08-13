public class Main {

    public static void main(String[] args) {

        Selector teste = new Selector();

        teste.Selector();

        int i, j, k;
        int num;
        String voted;
        String[] votados;


        num = teste.cleanList();

        i = teste.newVote("Juliano", "Sakaes");

        j = teste.newVote("Luiza", "Sakura");

        k = teste.newVote("Gui", "Sakura");

        k = teste.newVote("go", "kat");

        k = teste.newVote("Gu", "mix");

        k = teste.newVote("ui", "MOZ");

        k = teste.newVote("u", "fever");


        voted = teste.mostVoted();


        teste.pushQueue(voted);

        teste.pushQueue("1");
        teste.pushQueue("2");
        teste.pushQueue("3");
        teste.pushQueue(voted);
        teste.pushQueue("4");
        teste.pushQueue("5");



        votados = teste.getWinners();

        for(int a = 0; a < 7; a++)
        {



            System.out.println(votados[a] + " " + (a+1));
        }










        //System.out.println(num);

        System.out.println("");
        System.out.println("mais votado:");

        System.out.println(voted);


    }
}
