package src.main.java.strategy.payment_strategies;

public class MTN implements PaymentStrategy {

    @Override
    public void pay() {
        System.out.println("Paying with mtn service");
    }
    
}