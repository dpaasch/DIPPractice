package dippractice;

/**
 * Derived an interface from ConsoleOutput.  No dependency on anything concrete.
 */

public interface InputStrategy {
    
    public abstract void inputMsg(String msg);
}
