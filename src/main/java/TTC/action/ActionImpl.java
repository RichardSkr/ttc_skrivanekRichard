package TTC.data.data;

import TTC.data.InputData;
import TTC.data.OutputData;

import java.io.IOException;

public class DataActionImpl implements DataActionInt {
    InputData dataIn = new InputData();
    OutputData dataOut = new OutputData();

    public void inputAction() throws IOException {
        //načtení txt
        dataIn.setInputFile("/Users/richardskrivanek/Desktop/input.txt");
        dataIn.readTxtFile();
        //nastavení inputDat v outputu
        dataOut.createOutputData(dataIn.getInput());
        dataOut.printOutput();

        dataOut.setOutputFile("/Users/richardskrivanek/Desktop/output.txt");
        dataOut.writeOutput();
    }

    @Override
    public void run(String inputType, String outputType) throws IOException{
           if(inputType.contains("/input.txt")) {
               dataIn.setInputFile(inputType);
               dataIn.readTxtFile();
           }else {
               try {
                   if (Integer.parseInt(inputType) >= 0) {
                       dataIn.readLine();
                   }
               } catch (NumberFormatException ex) {
                   System.out.println("Enter valid number or path.");
               }
           }

           dataOut.createOutputData(dataIn.getInput());

           if(outputType.isEmpty()){
               dataOut.printOutput();
           }else {
               dataOut.setOutputFile(outputType);
               dataOut.writeOutput();
               System.out.println("Data was written successfully.");
           }
    }

    @Override
    public void run(String inputType) throws IOException{
        run(inputType, "");
    }
}
