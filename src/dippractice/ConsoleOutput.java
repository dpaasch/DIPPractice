package dippractice;

public class ConsoleOutput implements OutputStrategy{
    @Override
    public void outputMsg(String msg) {
        System.out.println(msg);
        // validate for null msg using if ...
    }
}
