import javafx.collections.transformation.SortedList;

import java.util.*;

public class TestCollection {

    private static long getRunningTime(Set<Integer> set) {
        long start = System.currentTimeMillis();

        for (int i = 0; i < 14_000_000; i++) {
            set.add(i);
        }

        long end = System.currentTimeMillis();

        return end - start;
    }

    private static long getRunningTimeMap(Map<Integer, String> map) {
        long start = System.currentTimeMillis();

        for (int i = 0; i < 14_000_000; i++) {
            map.put(i, "Element " + i);
        }

        long end = System.currentTimeMillis();

        return end - start;
    }

    private static long getRemoveTime(Set<Integer> set) {

        for (int i = 0; i < 14_000_000; i++) {
            set.add(i);
        }

        long start = System.currentTimeMillis();
        set.remove(7_000_000);
        long end = System.currentTimeMillis();

        return end - start;
    }

    private static long getRemoveTimeMap(Map<Integer, String> map) {

        for (int i = 0; i < 14_000; i++) {
            map.put(i, "Element " + i);
        }

        long start = System.currentTimeMillis();
        map.remove(7_000);
        long end = System.currentTimeMillis();

        return end - start;
    }

    private static long getIndexTimeMap(Map<Integer, String> map) {

        for (int i = 0; i < 14_000; i++) {
            map.put(i, "Element " + i);
        }

        long start = System.currentTimeMillis();
        //System.out.println(start);
        map.get(7_000);
        long end = System.currentTimeMillis();
        //System.out.println(end);
        return end - start;
    }

    public static void main(String[] args) {

        Set<Integer> hashSet = new HashSet<>();
        Set<Integer> linkedHashSet = new LinkedHashSet<>();
        Map<Integer, String> linkedHashMap = new LinkedHashMap<>();

        //System.out.println("Время выполнения операции поиска по индексу LinkedHashMap = " + getIndexTimeMap(linkedHashMap));
        //System.out.println("Время выполнения операции удаления HashSet = " + getRemoveTime(hashSet));
        //System.out.println("Время выполнения операции удаления LinkedHashSet = " + getRemoveTime(linkedHashSet));
        //System.out.println("Время выполнения операции удаления LinkedHashMap = " + getRemoveTimeMap(linkedHashMap));


        //System.out.println("Время выполнения операции добавления HashSet = " + getRunningTime(hashSet));
        //System.out.println("Время выполнения операции добавления LinkedHashSet = " + getRunningTime(linkedHashSet));
        //System.out.println("Время выполнения операции добавления LinkedHashMap = " + getRunningTimeMap(linkedHashMap));


    }
}
