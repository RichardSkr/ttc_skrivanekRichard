package TTC.data.data;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Data {
    Scanner sc = new Scanner(System.in, StandardCharsets.UTF_8);
    DataActionImpl app = new DataActionImpl();
    private String input;
    private String ouput;

    public void run() throws IOException {
        System.out.println("For .txt input put the file path. For standard input enter int > 0");
        input = sc.nextLine();
        System.out.println("For .txt output put the file path. For standard output press enter");
        ouput = sc.nextLine();

        app.run(input,ouput);
    }
}
