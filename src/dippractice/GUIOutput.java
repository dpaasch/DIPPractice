package dippractice;

import javax.swing.JOptionPane;

public class GUIOutput implements OutputStrategy {
    @Override
    public void outputMsg(String msg) {
        JOptionPane.showMessageDialog(null, msg);
    }
}
