package de.telran.tssk2;
//Есть абстрактный класс ПочтовоеОтправление, в котором
// представлен набор характеристик:
//        наименование;
//        адрес отправителя;
//        адрес получателя;
//        и абстрактное поведение:
//        доставить;
//       отправить;
//        Реализуйте методы этого абстрактного класса в его потомках
//        Письмо, Бандероль, Посылка, Контейнер с учетом той
//        специфики, которая характерна для каждого типа почтовых
//        отправлений на Ваше усмотрение.

public class Main {
    public static void main(String[] args) {
        // Пример создания и использования объектов
        Letter letter = new Letter("Письмо", "Париж", "Берлин");
        letter.deliver();
        letter.send();

        Container container = new Container("N 1345", "склад по адресу...", "центр сортировки 564");
        container.deliver();
        container.send();

        Package packag = new Package("Бандероль", "Париж", "Амстердам");
        packag.deliver();
        packag.send();

        ParcelPost parcelPost = new ParcelPost("Посылка", "Париж", "Нью-Йорк");
        parcelPost.deliver();
        parcelPost.send();


    }
}
