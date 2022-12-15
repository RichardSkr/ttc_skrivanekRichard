package TTC.dataService;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InputData {
    private List<Integer> inputNumbers;

    public InputData(){
        inputNumbers = new ArrayList<>();
    }

    public void readLine(){
        Scanner sc = new Scanner(System.in, StandardCharsets.UTF_8);

        System.out.println("Enter numbers separated by comma.");
        String numbers = sc.nextLine().trim();

        String[] array = numbers.split(",");
        for(String num : array) {
            inputNumbers.add(Integer.parseInt(num));
        }
    }


}
