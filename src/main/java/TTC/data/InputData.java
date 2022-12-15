package TTC.data;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
/**
 * A class that handles numeric inputs.
 * Txt input format: 1,2,4,54,12,41,56,3,10,102,64,5,8,90,1,2,3,9,2,19,21
 *
 */
public class InputData {
    private final List<Integer> inputData;

    private String inputFile;

    public InputData() {
        inputData = new ArrayList<>();
    }

    private boolean isValid;

    /**
     * Standard input.
     */
    public void readLine() {
        Scanner sc = new Scanner(System.in, StandardCharsets.UTF_8);

        System.out.println("Enter the numbers separated by comma.");
        while (!isValid) {
            String numbers = sc.nextLine().trim();
            try {
                String[] array = numbers.split(",");
                for (String num : array) {
                    Integer.parseInt(num);
                }
                for (String num : array) {
                    inputData.add(Integer.parseInt(num));
                }
                isValid = true;
            } catch (Exception e) {
                System.out.println("Integers must be separated by comma.");
            }
        }
            sc.close();
    }

    /**
     * Reading nums from file.txt
     */
    public void readTxtFile() throws IOException {
        Scanner sc = new Scanner(new File(inputFile));

            while (sc.hasNext()) {
                sc.useDelimiter(",");
                try {
                    inputData.add(sc.nextInt());
                    isValid = false;
                } catch (InputMismatchException e) {
                    System.out.println("Check your input.txt format.\nCorrect format example: 1,2,5,9");
                }
            }
                sc.close();
        }


    public List<Integer> getInput() {
        return inputData;
    }

    public void setInputFile(String inputFile) {
        this.inputFile = inputFile;
    }
}
