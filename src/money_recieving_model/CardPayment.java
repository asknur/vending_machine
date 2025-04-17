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
        return false;
    }
}
