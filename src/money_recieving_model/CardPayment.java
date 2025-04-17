package money_recieving_model;

import interfaces.MoneyAcceptor;

import java.util.Scanner;

public class CardPayment implements MoneyAcceptor {
    @Override
    public int getAmount() {
        return 200;
    }

    @Override
    public void setAmount(int amount) {

    }

    @Override
    public boolean paymentRecieve(int price) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите номер карты: ");
        int cardNum = sc.nextInt();
        System.out.println("Введите пороль: ");
        int cardPassword = sc.nextInt();
        return true;
    }
}
