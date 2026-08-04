package Lab11;

import java.util.*;

public class GenericOperations {

    public static <T extends Number & Comparable<T>> void processList(List<T> list) {

        Collections.sort(list);

        double sum = 0;
        for (T num : list) {
            sum += num.doubleValue();
        }

        T max = Collections.max(list);

        System.out.println("Sorted List: " + list);
        System.out.println("Sum: " + sum);
        System.out.println("Max: " + max);
    }

    public static void main(String[] args) {

        List<Number> mixedList = new ArrayList<>();
        mixedList.add(10);
        mixedList.add(5.5);
        mixedList.add(20);
        mixedList.add(3.3);

        List<Double> tempList = new ArrayList<>();

        for (Number n : mixedList) {
            tempList.add(n.doubleValue());
        }

        processList(tempList);
    }
}
