public class PhoneBook {

    private final java.util.HashMap<String, java.util.List<String>> phoneBookMap;
    public PhoneBook() {
        phoneBookMap = new java.util.HashMap<>();
    }

    // Добавление в список
    public void add(String Name, String Number) {
        phoneBookMap.computeIfAbsent(Name, key -> new java.util.ArrayList<>()).add(Number);
    }
    // Поиск
    public java.util.List<String> get(String SurName) {
        return phoneBookMap.getOrDefault(SurName, new java.util.ArrayList<>());
    }
}
