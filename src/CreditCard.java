import java.util.ArrayList;
import java.util.List;

public class CreditCard {
    private double limit;
    private double balance;

    private List<Purchase> purchaseList;

    public CreditCard(double limit) {
        this.limit = limit;
        this.balance = limit;
        this.purchaseList = new ArrayList<>();
    }

    public double getLimit() {
        return limit;
    }

    public double getBalance() {
        return balance;
    }

    public List<Purchase> getPurchaseList() {
        return purchaseList;
    }

    public boolean confirmPurchase(Purchase purchase) {
        if (this.balance > purchase.getPrice()){
            this.balance -= purchase.getPrice();
            this.purchaseList.add(purchase);
            return true;
        }

        return false;
    }
}
