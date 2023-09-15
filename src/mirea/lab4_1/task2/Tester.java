package mirea.lab4_1.task2;

public class Tester {
    public static void main(String[] args) {
        // Создаем три экземпляра класса Phone
        Phone phone1 = new Phone("4564655646546", "iPhone", 0.4);
        Phone phone2 = new Phone("1231312312312", "Samsung");
        Phone phone3 = new Phone();

        // Выводим значения переменных объектов на консоль
        System.out.println("Phone 1: " + phone1.getNumber() + ", " + phone1.model + ", " + phone1.weight + " кг");
        System.out.println("Phone 2: " + phone2.getNumber() + ", " + phone2.model + ", " + phone2.weight + " кг");
        System.out.println("Phone 3: " + phone3.getNumber() + ", " + phone3.model + ", " + phone3.weight + " кг");

        // Принимаем звонки и отправляем сообщения
        phone1.receiveCall("Степан");
        phone2.receiveCall("Николай", "555-123-456");
        phone3.receiveCall("Владимир");

        phone1.sendMessage("111-222-333", "444-555-666");
        phone2.sendMessage("777-888-999");

    }
}
