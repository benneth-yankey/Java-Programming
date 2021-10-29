package src.main.java.strategy.payment_strategies;

public class AirtelTigo implements PaymentStrategy {

    @Override
    public void pay() {
        System.out.println("Paying with airteltigo service");
    }
    
}
