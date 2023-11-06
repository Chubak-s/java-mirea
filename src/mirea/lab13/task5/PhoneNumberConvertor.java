package mirea.lab13.task5;

public class PhoneNumberConvertor {
    public static String convertPhoneNumber(String phoneNumber) {
        String convertedNumber = "";

        if (phoneNumber.startsWith("+")) {
            // Удаление символа "+" из строки
            phoneNumber = phoneNumber.substring(1);

            // Форматирование номера в формат +<Код страны><Три цифры>-<Три цифры>-<Четыре цифры>
            convertedNumber = "+" + phoneNumber.substring(0, phoneNumber.length() - 10) + "-"
                    + phoneNumber.substring(phoneNumber.length() - 10, phoneNumber.length() - 7) + "-"
                    + phoneNumber.substring(phoneNumber.length() - 7);
        } else if (phoneNumber.startsWith("8")) {
            // Удаление символа "8" из строки
            phoneNumber = phoneNumber.substring(1);

            // Форматирование номера в формат +7<Три цифры>-<Три цифры>-<Четыре цифры>
            convertedNumber = "+7-" + phoneNumber.substring(0, 3) + "-" + phoneNumber.substring(3, 6) + "-"
                    + phoneNumber.substring(6);
        } else {
            // Некорректный формат номера
            System.out.println("Некорректный формат номера");
        }

        return convertedNumber;
    }

    public static void main(String[] args) {
        String phoneNumber1 = "+79175655655";
        String convertedNumber1 = convertPhoneNumber(phoneNumber1);
        System.out.println(convertedNumber1); // +7-917-565-5655

        String phoneNumber2 = "+104289652211";
        String convertedNumber2 = convertPhoneNumber(phoneNumber2);
        System.out.println(convertedNumber2); // +10428-965-2211

        String phoneNumber3 = "89175655655";
        String convertedNumber3 = convertPhoneNumber(phoneNumber3);
        System.out.println(convertedNumber3); // +7-917-565-5655
    }
}
