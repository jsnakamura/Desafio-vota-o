import java.util.Scanner;

public class Reader {

    Scanner readline = new Scanner(System.in);
    private String readln;

    public String read()
        {
            readln = readline.nextLine();

            return readln;
        }


}
