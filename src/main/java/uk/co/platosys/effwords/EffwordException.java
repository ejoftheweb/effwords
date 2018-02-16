package uk.co.platosys.effwords;

public class EffwordException extends Exception {
    public EffwordException (String msg){
        super (msg);
    }
    public EffwordException (String msg, Throwable cause){
        super (msg, cause);
    }
}
