public class Purchase implements Comparable<Purchase>{
    private double price;
    private String description;

    public Purchase(String description, double price) {
        this.description = description;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "Item: " + description + "\n" +
                "Preço: R$" + price;
    }

    @Override
    public int compareTo(Purchase newPurchase) {
        return Double.compare(newPurchase.price, this.price);
    }
}
