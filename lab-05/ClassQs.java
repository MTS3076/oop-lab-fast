package Lab05;

// union and intersection of two arrays
// sorting of array of string
/* can non-static methods access static fields?
    - Yes, static fields belong to the class itself, so they are accessible from both static and non-static contexts */
/* what are jagged arrays?
    - Where number of columns are not fixed in every row */

import java.util.Set;
import java.util.Arrays;
import java.util.HashSet;

public class ClassQs {
    public static void main(String[] args) {
        int arr1[] = {1,2,3,4,5};
        int arr2[] = {3,4,5,6,7};

        // Union
        Set<Integer> unionSet = new HashSet<>();
        for (int num : arr1) {
            unionSet.add(num);
        }
        for (int num : arr2) {
            unionSet.add(num);
        }
        System.out.println("Union: " + unionSet);

        // Intersection
        Set<Integer> intersectionSet = new HashSet<>();
        for (int num : arr1) {
            intersectionSet.add(num);
        }
        intersectionSet.retainAll(Arrays.asList(3, 4, 5, 6, 7)); // or convert arr2 to list
        System.out.println("Intersection: " + intersectionSet);

        //sorting
        String food[] = {"pizza", "steak", "fries", "ice cream"};
        Arrays.sort(food);
        System.out.println("Sorted Food Names:");
        for(String name : food) {
            System.out.println(name);
        }
    }
}
