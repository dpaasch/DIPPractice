package dippractice;
/* This class is not flexible because DIPPractice calls either the console or
 * GUI objects.
 */

public class DIPPractice {

    public static void main(String[] args) {

        // Create new ConsoleInput/ConsoleOutput objects
        // InputStrategy inputStrategy = new ConsoleInput();
        // OutputStrategy outputStrategy = new ConsoleOutput();
        
        // Create new GUIInput/GUIOutput objects
        InputStrategy inputStrategy = new GUIInput();
        OutputStrategy outputStrategy = new GUIOutput();
        
        // Create new MessageService object
        MessageService msgService = new MessageService();

        // outputMsg delegates work to OutputStrategy
        msgService.outputMsg(outputStrategy, inputStrategy);
    }
}