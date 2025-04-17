package money_recieving_model;

import interfaces.MoneyAcceptor;

public class CardPayment implements MoneyAcceptor {
    private int amount;

    @Override
    public int getAmount() {
        return amount;
    }

    @Override
    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public boolean paymentRecieve(int price) {
        if (amount >= price) {
            amount = amount - price;
            return true;
        } else {
            System.out.println("Не достаточно средств!");
            return false;
        }
    }
}
