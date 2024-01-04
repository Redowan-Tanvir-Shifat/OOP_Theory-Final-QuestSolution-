package Ques_3;

public class Main {

}
class CreditCard {
    private double credit_limit;
    private double credit_current;
    public CreditCard(double limit) {

        credit_limit = limit;
        credit_current = 0;
    }
}

class InvalidTxnException extends Exception{
    InvalidTxnException(String str) {
        super(str);
    }
}