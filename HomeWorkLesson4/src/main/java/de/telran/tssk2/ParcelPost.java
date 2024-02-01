package de.telran.tssk2;

public class ParcelPost extends PostalOffice {
    public ParcelPost(String name, String sendersAddress, String addressRecipient) {
        super(name, sendersAddress, addressRecipient);
    }

    @Override
    public void deliver() {
        System.out.println("Посылку забирают службы доставки.");
    }

    @Override
    public void send() {
        System.out.println("Посылку приносят люди для дальнейшей отправки.");
    }
}