import java.util.*;

public class PhoneBook {
    private Map<String, String> nameToNumber = new HashMap<>();
    private Map<String, String> numberToName = new HashMap<>();
    private TreeSet<String> names = new TreeSet<>();

    public int add(String name, String number) {
        if (nameToNumber.containsKey(name)) {
            return nameToNumber.size();
        }
        nameToNumber.put(name, number);
        numberToName.put(number, name);
        names.add(name);
        return nameToNumber.size();
    }

    public String findByNumber(String number) {
        return numberToName.get(number);
    }

    public String findByName(String name) {
        return nameToNumber.get(name);
    }

    public void printAllNames() {
        for (String name : names) {
            System.out.println(name);
        }
    }
}
