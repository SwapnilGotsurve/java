class Payment {
    static int bal = 10000;

    void pay(int amount) {
        bal = bal - amount;
        System.out.println(amount + " paid. Balance is " + bal);
    }
}

class CreditCard extends Payment {

    @Override
    void pay(int amount) {
        System.out.println("Paid using Credit Card");
        super.pay(amount);
    }
}

class UPI extends Payment {

    @Override
    void pay(int amount) {
        System.out.println("Paid using UPI");
        super.pay(amount);
    }
}

public class Overriding {
    public static void main(String[] args) {

        CreditCard c1 = new CreditCard();
        c1.pay(500);

        UPI u1 = new UPI();
        u1.pay(100);
    }
}
