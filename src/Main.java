public class Main {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();

        // записи
        phoneBook.add("Петров", "+7-999-745-6695");
        phoneBook.add("Иванов", "+7-999-456-3268");
        phoneBook.add("Головина", "+7-999-452-2485");
        phoneBook.add("Масленников", "+7-999-412-3269");

        // Вывод фамилия+номер
        System.out.println("Петров: " + phoneBook.get("Петров"));
        System.out.println("Иванов: " + phoneBook.get("Иванов"));
        System.out.println("Головина: " + phoneBook.get("Головина"));
        System.out.println("Масленников: " + phoneBook.get("Масленников"));
    }
}
