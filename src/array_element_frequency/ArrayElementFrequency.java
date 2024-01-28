package array_element_frequency;

import java.util.HashMap;
import java.util.Map;

public class ArrayElementFrequency {

    public static void main(String[] args) {
        String[] inputArray = {"Apple", "Banana", "Banana", "Cherry", "Apple"};
        Map<String, Integer> result = calculateElementFrequency(inputArray);
        System.out.println("Output: " + result);
    }

    /**
     * Question-4 Frequency of Array Elements
     * Write a function that takes a String array as parameter and returns a map object that contains each element of array as key and their occurrence counts as value.
     * For calculating occurrence, array elements should be checked by regarding case sensitivity.
     * Order is not important.
     * EXAMPLE:
     * Input: {"Apple", "Banana", "apple", "Cherry", "Apple"}
     * Output: returning map elements: {Apple=2, apple=1, Cherry=1, Banana=1}
     *
     */

    public static Map<String, Integer> calculateElementFrequency(String[] array) {
        Map<String, Integer> frequencyMap = new HashMap<>();

        for (String element : array) {
            frequencyMap.put(element, frequencyMap.getOrDefault(element, 0) + 1);
        }

        return frequencyMap;
    }
}
