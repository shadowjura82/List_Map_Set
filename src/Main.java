import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        Task1();
        System.out.println("\nЗадание 2");
        Task2();
        System.out.println("Задание 3");
        Task3();
        System.out.println("Задание 4");
        Task4();
    }

    public static void Task1() {
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        for (Integer num : nums) if (num % 2 != 0) System.out.print(num + " ");
    }

    public static void Task2() {
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 20, 3, 4, 4, 5, 5, 6, 7));
        SortedSet<Integer> newSet = new TreeSet<>();
        for (Integer num : nums) if (num % 2 == 0) newSet.add(num);
        System.out.println(newSet);
    }

    public static void Task3() {
        List<String> list = new ArrayList<>(List.of("один", "один", "два", "три", "четыре", "четыре", "четыре", "пять"));
        Set<String> set = Set.copyOf(list);
        System.out.println(set);
    }

    public static void Task4() {
        List<String> strings = new ArrayList<>(List.of("один", "два", "два", "три", "три", "три"));
        Map<String, Integer> result = new HashMap<>();
        for (String string : strings) result.put(string, Collections.frequency(strings, string));
        System.out.println(result);
    }
}