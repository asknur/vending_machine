package money_recieving_model;

import interfaces.MoneyAcceptor;

public class CardPayment implements MoneyAcceptor {

    @Override
    public int getAmount() {
        return 0;
    }

    @Override
    public void setAmount(int amount) {

    }

    @Override
    public boolean paymentRecieve(int price) {
        return false;
    }
}
