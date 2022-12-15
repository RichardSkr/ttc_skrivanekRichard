package TTC.data.data;

import java.io.IOException;

public interface DataActionInt {
    void run(String inputType, String ouputType) throws IOException;
    void run(String inputType) throws IOException;
}
