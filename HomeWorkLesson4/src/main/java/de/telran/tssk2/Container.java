package de.telran.tssk2;

public class Container extends PostalOffice {
    public Container(String name, String sendersAddress, String addressRecipient) {
        super(name, sendersAddress, addressRecipient);
    }

    @Override
    public void deliver() {
        System.out.println("Сюда складывают письма при доставке.");
    }

    @Override
    public void send() {
        System.out.println("Отсюда забирают письма для дальнейшего распределения.");
    }
}