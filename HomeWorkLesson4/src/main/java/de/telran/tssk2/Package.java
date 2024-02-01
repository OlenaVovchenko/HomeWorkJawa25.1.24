package de.telran.tssk2;

public class Package extends PostalOffice {
    public Package(String name, String sendersAddress, String addressRecipient) {
        super(name, sendersAddress, addressRecipient);
    }

    @Override
    public void deliver() {
        System.out.println("Бандероль забирают службы доставки.");
    }

    @Override
    public void send() {
        System.out.println("Бандероль приносят люди для дальнейшей отправки.");
    }
}
