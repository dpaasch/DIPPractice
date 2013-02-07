package dippractice;
// this class is not flexible...DIPPractice calls ConsoleOutput object.
public class DIPPractice {

    public static void main(String[] args) {
       
        InputStrategy inputStrategy = new ConsoleInput();
        
        // OutputStrategy outputStrategy = new ConsoleOutput();
        OutputStrategy outputStrategy = new GUIOutput();
        MessageService msgService = new MessageService();

        // outputMsg delegates work to OutputStrategy
        msgService.outputMsg(outputStrategy,inputStrategy);

    }
}
     