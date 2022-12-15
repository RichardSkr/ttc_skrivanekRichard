package TTC.action;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

/**
 *  A class that takes care of the correct addition of parameters.
 */
public class Action {
    Scanner sc = new Scanner(System.in, StandardCharsets.UTF_8);

    ActionImpl app = new ActionImpl();

    private String input;

    private String output;

    private boolean isValid;

    public void run() throws IOException {
        System.out.println("For .txt input put the file path. For standard input enter the integer > 0.");
        while (!isValid) {
            input = sc.nextLine();
            if (input.contains("/input")) {
                isValid = true;
                app.setTxtInput(true);
            } else {
                try {
                    if(Integer.parseInt(input) >= 0){
                        isValid = true;
                        app.setTxtInput(false);
                    }
                } catch (Exception e) {
                    System.out.println("Enter valid number or path.");
                }
            }
        }
        while (isValid){
            System.out.println("For .txt output put the file path. For standard output press enter.");
            output = sc.nextLine();
            if(output.contains("/output") || output.isEmpty()) {
                isValid = false;
                app.run(input, output);
            }
        }
    }
}
