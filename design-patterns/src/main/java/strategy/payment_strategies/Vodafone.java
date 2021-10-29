package src.main.java.strategy.payment_strategies;

public class Vodafone implements PaymentStrategy {

    @Override
    public void pay() {
        System.out.println("Paying with vodafone service");
    }
    
}
