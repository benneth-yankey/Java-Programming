package src.main.java.strategy;

import src.main.java.strategy.payment_strategies.PaymentStrategy;

public class WestHillsMall {
    private final PaymentStrategy paymentService;
    private String id = "123456";

    public WestHillsMall(PaymentStrategy paymentService) {
        this.paymentService = paymentService;
    }

    public String getID() {
        return id;
    }

    public void shop() {
        System.out.println("Shopping couple of items");
        System.out.println("Bought TV, Refrigerator");
    }

    public void pay() {
        paymentService.pay();
    }
}
