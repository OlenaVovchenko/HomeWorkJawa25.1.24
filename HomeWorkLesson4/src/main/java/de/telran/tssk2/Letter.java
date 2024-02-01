package de.telran.tssk2;

public class Letter extends PostalOffice {
    public Letter(String name, String sendersAddress, String addressRecipient) {
        super(name, sendersAddress, addressRecipient);
    }

    @Override
    public void deliver() {
        System.out.println("Письмо доставляют службы доставки.");
    }

    @Override
    public void send() {
        System.out.println("Письмо отправляют люди родным, близким и в разные службы.");
    }
}