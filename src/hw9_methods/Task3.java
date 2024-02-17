package hw9_methods;

public class Task3 {
    public static void main(String[] args) {
        //*Возвращаемся к задаче на расчет дней доставки банковской карты.
        //____________________________________________________________________________
        // Текст прошлого задания:
        //В банке для клиентов организовывается доставка карт на дом. Чтобы известить клиента о том,
        // когда будет доставлена его карта, нужно знать расстояние от офиса до адреса доставки.
        //
        //Правила доставки такие:
        //Доставка в пределах 20 км занимает сутки.
        //Доставка в пределах от 20 км до 60 км добавляет еще один день доставки.
        //Доставка в пределах от 60 км до 100 км добавляет еще одни сутки.
        //Свыше 100 км доставки нет.
        //То есть с каждым следующим интервалом доставки срок увеличивается на 1 день.
        //Напишите программу, которая выдает сообщение в консоль: «Потребуется дней: ... » + срок доставки.
        //Объявите целочисленную переменную
        //deliveryDistance = 95, которая содержит дистанцию до клиента.
        //____________________________________________________________________________
        //Ваша задача — доработать код, а именно написать метод,
        // который на вход принимает дистанцию и возвращает итоговое количество дней доставки.*//
        int deliveryDistance = 25;
        int deliveryDays = 1;
        calculateDeliveryTime(deliveryDistance, deliveryDays);
    }

    public static void calculateDeliveryTime(int deliveryDistance, int deliveryDays) {
        if (deliveryDistance < 20) {
            deliveryDays = 1;
            System.out.println("Если дистанция " + deliveryDistance + " км, то потребуется дней: " + deliveryDays + "\n");
        } else if (deliveryDistance >= 20 && deliveryDistance < 60) {
            deliveryDays = 2;
            System.out.println("Если дистанция " + deliveryDistance + " км то, потребуется дней: " + deliveryDays + "\n");
        }
        else if (deliveryDistance < 100 && deliveryDistance >= 60) {
            deliveryDays = 3;
            System.out.println("Если дистанция " + deliveryDistance + " км то, потребуется дней: " + deliveryDays + "\n");
        }  else {
            System.out.println("Доставки нет\n");}
    }
}
