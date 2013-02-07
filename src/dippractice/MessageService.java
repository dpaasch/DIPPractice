package dippractice;

public class MessageService {
    
    // Constant representing a single message
//    private static final String MSG = "Hello";

//    public void outputMsg() {
//        //Very Rigid - only ouputs to console
//        //Fragile - changing to JOption pane could break other code
//        //Not Portable - can't use something other than console
//        System.out.println(MSG);
//        // JOptionPane.showMessageDialog(null,MSG);
//    }
    // This method still does not meet the DIP...Still rigid because ConsoleOutput
    // is concrete (hard dependency).
//    public void outputMsg(ConsoleOutput out) {
//        out.outputMsg(MSG);
//    } 
    
    //Anticipating change, going to want different ways to output
    //Any OutputStrategy class can now be used, because it's an abstraction. 
    //This is now a high level class that is flexible, not rigid, not fragile
    public void outputMsg(OutputStrategy out,InputStrategy in) {
        out.outputMsg(in.inputMsg());
//        String msg = in.inputMsg();
//        out.outputMsg(msg);
    }
}
