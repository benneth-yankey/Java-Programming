public class Trade {
    private String ID;
    private Symbol symbol;
    private int quantity;
    private float price;

    public Trade(String ID, Symbol symbol, int quantity, float price) {
        this.ID = ID;
        this.symbol = symbol;
        this.quantity = quantity;
        this.price = price;
    }

    public Trade(String ID, Symbol symbol, int quantity) {
        this.ID = ID;
        this.symbol = symbol;
        this.quantity = quantity;
    }

    public void setPrice(float price) {
        if (price > -1) {
            this.price = price;
        }
    }

    public int getQuantity() {
        return quantity;
    }

    public float getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Trade [ID=" + ID + ", price=" + price + ", quantity=" + quantity + ", symbol=" + symbol + "]";
    }
}