package dippractice;

import javax.swing.JOptionPane;

public class GUIInput implements InputStrategy {

    @Override
    public String inputMsg() {
        String inputMsg = JOptionPane.showInputDialog ("Enter the message to be input: ");   
        return inputMsg;
    }
}
