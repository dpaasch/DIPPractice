package dippractice;

import java.util.Scanner;

public class ConsoleInput implements InputStrategy {

    public void inputMsg(String msg) {
        
        // Create a Scanner Object for keyboard input
        Scanner input = new Scanner(System.in);
        
        String inputMsg = input.nextLine();
        
    }
}
