package TTC.action.actionInterface;

import java.io.IOException;

/**
 * Interface for creating an optional parametr.
 */
public interface ActionInt {
    void run(String inputType, String ouputType) throws IOException;
    void run(String inputType) throws IOException;
}
