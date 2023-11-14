package org.example;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        task1(new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7)));
        task2(new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7)));
        task3(new ArrayList<>(List.of("яблоко", "яблоко", "ананас", "банан", "ананас")));
        task4(new ArrayList<>(List.of("один", "два", "два", "три", "три", "три")));
    }

    public static void task1(List<Integer> nums) {
        for (Integer num : nums) {
            if (num % 2 > 0) {
                System.out.print(num + " ");
            }
        }
        System.out.println();
    }

    public static void task2(List<Integer> nums) {
        Collections.sort(nums);
        Set<Integer> numSet = new HashSet<>();
        for (Integer num : nums) {
            if (num % 2 == 0 && !numSet.contains(num)) {
                System.out.print(num + " ");
                numSet.add(num);
            }
        }
        System.out.println();
    }

    public static void task3(List<String> strings) {
        Set<String> fruits = new HashSet<>(strings);
        System.out.print(fruits);
        System.out.println();
    }

    public static void task4(List<String> strings) {
        Map<String, Integer> repeat = new HashMap<>();
        for (String string : strings) {
            if (repeat.containsKey(string)) {
                Integer currentRepeat = repeat.get(string);
                repeat.put(string, currentRepeat + 1);
            } else {
                repeat.put(string, 1);
            }
        }
        System.out.println(repeat);
    }
}


