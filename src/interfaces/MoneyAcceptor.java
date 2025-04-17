package interfaces;

public interface MoneyAcceptor {
    int getAmount();
    void setAmount(int amount);
    boolean paymentRecieve(int price);

}
