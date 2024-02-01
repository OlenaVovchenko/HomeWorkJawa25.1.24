package de.telran.tssk2;

public abstract class PostalOffice {
    protected String name;
    protected String sendersAddress;
    protected String addressRecipient;

    public PostalOffice(String name, String sendersAddress, String addressRecipient) {
        this.name = name;
        this.sendersAddress = sendersAddress;
        this.addressRecipient = addressRecipient;
    }

    public abstract void deliver();

    public abstract void send();
}
