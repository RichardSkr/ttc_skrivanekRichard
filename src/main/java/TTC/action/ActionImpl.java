package TTC.action;

import TTC.data.InputData;
import TTC.data.OutputData;
import TTC.action.actionInterface.ActionInt;

import java.io.IOException;

/**
 * Program hierarchy and optional parametr.
 */
public class ActionImpl implements ActionInt {
    InputData dataIn = new InputData();

    OutputData dataOut = new OutputData();

    private Boolean txtInput;

    @Override
    public void run(String inputType, String outputType) throws IOException{
           if(txtInput) {
               dataIn.setInputFile(inputType);
               dataIn.readTxtFile();
           }else {
               dataIn.readLine();
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

    public void setTxtInput(Boolean txtInput) {
        this.txtInput = txtInput;
    }
}
