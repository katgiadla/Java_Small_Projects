package packageSort;

public class ZeroElementsException extends Exception {
    public ZeroElementsException(){super("Your array is empty!");}
    public ZeroElementsException(Throwable err){
        super("Your array is empty!", err);
    }
}
