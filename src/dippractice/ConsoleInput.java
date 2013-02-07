package dippractice;

import java.util.Scanner;

public class ConsoleInput implements InputStrategy {

    @Override
    public String inputMsg() {
        
        // Create a Scanner Object for keyboard input
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the message to be input: ");        
        String inputMsg = input.nextLine();
        return inputMsg;     
    }
}
