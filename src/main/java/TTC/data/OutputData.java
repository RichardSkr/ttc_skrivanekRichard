package TTC.data;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * A class that handles numeric outputs.
 * txt output format: Odd numbers: [1, 41, 3, 5, 1, 3, 9, 19, 21]
 */
public class OutputData {
    List<Integer> outputData;

    private boolean isEven;

    String outputFile;

    public OutputData() {
        outputData = new ArrayList<>();
    }

    /**
     * Standard print.
     */
    public void printOutput() {
        if(isEven) {
            System.out.println("Even numbers: " + outputData);
        }else {
            System.out.println("Odd numbers: " + outputData);
        }
    }

    /**
     * Writing to file.txt
     */
    public void writeOutput() throws IOException {
        PrintWriter pw = new PrintWriter(outputFile);
        if(isEven) {
            pw.write("Even numbers: " + outputData);
        }else {
            pw.write("Odd numbers: " + outputData);
        }
        pw.close();
    }

    public void createOutputData(List<Integer> inputData) {
        if (inputData.size() % 2 == 0) {
            outputData = inputData.stream()
                    .filter(num -> num % 2 == 0)
                    .collect(Collectors.toList());
            isEven = true;
        }else {
                outputData = inputData.stream()
                        .filter(num -> num % 2 != 0)
                        .collect(Collectors.toList());
                isEven = false;
        }
    }

    public void setOutputFile(String outputFile) {
        this.outputFile = outputFile;
    }
}
