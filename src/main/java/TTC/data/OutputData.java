package TTC.data;


import TTC.dataAction.OutputDataAction;

import java.util.ArrayList;
import java.util.List;

public class OutputData {
    List<Integer> outputData;
    public OutputData(){
        outputData = new ArrayList<>();
    }

    public void setOutputData(List<Integer> outputData) {
        this.outputData = outputData;
    }
}
