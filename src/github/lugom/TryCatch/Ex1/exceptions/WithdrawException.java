package github.lugom.TryCatch.Ex1.exceptions;

public class WithdrawException extends RuntimeException{
    private static final long serialVersionUID = 1L;

    public WithdrawException(){
        super();
    }
    public WithdrawException(String message) {
        super("Withdraw Error: " + message);
    }

}
