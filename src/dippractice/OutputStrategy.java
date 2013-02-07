package dippractice;

/**
 * Derived an interface from ConsoleOutput.  No dependency on anything concrete.
 */
public interface OutputStrategy {
    // We should always write this as public abstract, even though it is NOT
    // required by NetBeans but is by Mr. Lombardo.
    public abstract void outputMsg(String msg);
    
}
