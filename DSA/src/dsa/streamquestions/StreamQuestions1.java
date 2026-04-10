package dsa.streamquestions;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamQuestions1 {
    public static void main(String[] args) {
        // 1. Given a list of integers, find out all the even numbers that exists in the list using Stream Functions?
        List<Integer> list = Arrays.asList(10,15,8,49,25,98,32);
        list.stream().filter(num-> num%2==0).forEach(System.out::println);
        // 2. Given a list of integers, find out all the numbers starting with 1 using Stream functions?
        List<String> slist = list.stream().map(num-> num + "")
                .filter(str-> str.startsWith("1"))
                .toList();
        System.out.println(slist);
        //3. How to find duplicate elements in a given integers list in java using Stream functions?

         List<Integer> dupList = Arrays.asList(10,15,8,49,25,98,32,10,15);
            Set<Integer> set = new HashSet();
            dupList.stream() .filter(n -> !set.add(n)) .forEach(System.out::println);

         dupList.stream().filter(num-> dupList.indexOf(num) != dupList.lastIndexOf(num))
                 .distinct()
                 .forEach(System.out::println);

         // 4. Given the list of integers, find the first element of the list using Stream functions?
        list.stream()
                .findFirst()
                .ifPresent(System.out::println);
        // 5. Given a list of integers, find the total number of elements present in the list using Stream functions?
        long count =  list.stream()
                .count();
        System.out.println(count);
        //6. Given a list of integers, find the maximum value element present in it using Stream functions?
        int max =  list.stream()
                .max(Integer::compare)
                .get();
        System.out.println(max);
        //7. Given a String, find the first non-repeated character in it using Stream functions?
        String input = "Java articles are Awesome";

        Character result = input.chars()// Stream of String
                .mapToObj(s -> Character.toLowerCase(Character.valueOf((char) s))) // First convert to Character object and then to lowercase
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting())) //Store the chars in map with count
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue() == 1L)
                .map(entry -> entry.getKey())
                .findFirst()
                .get();
        System.out.println(result);

        /* or can also try using */

        input.chars().mapToObj(c -> (char) c)
                .filter(ch -> input.indexOf(ch) == input.lastIndexOf(ch))
                .findFirst().orElse(null);

        //8. Given a String, find the first repeated character in it using Stream functions?
        Character result1 = input.chars() // Stream of String
                .mapToObj(s -> Character.toLowerCase(Character.valueOf((char) s))) // First convert to Character object and then to lowercase
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting())) //Store the chars in map with count
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue() > 1L)
                .map(entry -> entry.getKey())
                .findFirst()
                .get();
        System.out.println(result);
        Set<Character> seenCharacters = new HashSet<>();
        input.chars()
                .mapToObj(c -> (char) c)
                .filter(c -> !seenCharacters.add(c))
                .findFirst()
                .orElse(null);

        //9. Given a list of integers, sort all the values present in it using Stream functions?
        list.stream()
                .sorted()
                .forEach(System.out::println);
        //10. Given a list of integers, sort all the values present in it in descending order using Stream functions?
        list.stream()
                .sorted(Collections.reverseOrder())
                .forEach(System.out::println);
        //11. Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
        Set<Integer> setData = new HashSet<>();
        boolean hasDuplicates = list.stream().anyMatch(num -> !setData.add(num));
        System.out.println(hasDuplicates);
        //12. How will you get the current date and time using Java 8 Date and Time API?
        System.out.println("Current Local Date: " + java.time.LocalDate.now());
        //Used LocalDate API to get the date
        System.out.println("Current Local Time: " + java.time.LocalTime.now());
        //Used LocalTime API to get the time
        System.out.println("Current Local Date and Time: " + java.time.LocalDateTime.now());
        //Used LocalDateTime API to get both date and time

        // 13. Write a Java 8 program to concatenate two Streams?
        List<Integer> list1 = Arrays.asList(1, 2, 3);
        List<Integer> list2 = Arrays.asList(4, 5, 6);
        List<Integer> concatenatedList = Stream.concat(list1.stream(), list2.stream())
                .collect(Collectors.toList());
        System.out.println(concatenatedList);
        // 14. Java 8 program to perform cube on list elements and filter numbers greater than 50.
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> resultList = numbers.stream()
                .map(num -> num * num * num) // Cube the number
                .filter(cube -> cube > 50) // Filter numbers greater than 50
                .toList();
        System.out.println(resultList);
        // 15. Write a Java 8 program to sort an array and then convert the sorted array into Stream?
        Integer[] arr = {5, 2, 8, 1, 3};
        Arrays.parallelSort(arr);
        Arrays.stream(arr).forEach(n -> System.out.print(n + " "));
        // 16. How to use map to convert object into Uppercase in Java 8?
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
        List<String> upperCaseNames = names.stream()
                .map(String::toUpperCase)
                .toList();
        System.out.println(upperCaseNames);
        // 17. How to convert a List of objects into a Map by considering duplicated keys and store them in sorted order?
//        List<Notes> noteLst = new ArrayList<>();
//        noteLst.add(new Notes(1, "note1", 11));
//        noteLst.add(new Notes(2, "note2", 22));
//        noteLst.add(new Notes(3, "note3", 33));
//        noteLst.add(new Notes(4, "note4", 44));
//        noteLst.add(new Notes(5, "note5", 55));
//
//        noteLst.add(new Notes(6, "note4", 66));
//
//
//        Map<String, Long> notesRecords = noteLst.stream()
//                .sorted(Comparator
//                        .comparingLong(Notes::getTagId)
//                        .reversed()) // sorting is based on TagId 55,44,33,22,11
//                .collect(Collectors.toMap
//                        (Notes::getTagName, Notes::getTagId,
//                                (oldValue, newValue) -> oldValue,LinkedHashMap::new));
//// consider old value 44 for dupilcate key
//// it keeps order
//        System.out.println("Notes : " + notesRecords);

        // 18. Write a Java 8 program to find the frequency of each element in a list using Stream functions?
        List<String> items = Arrays.asList("apple", "banana", "orange", "apple", "banana", "apple");
        Map<String, Long> frequencyMap = items.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(frequencyMap);

        // 19. How to find only duplicate elements with its count from the String ArrayList in Java8?
        List<String> itemList = Arrays.asList("apple", "banana", "orange", "apple", "banana", "apple");
        Map<String, Long> duplicateCountMap = itemList.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream()
                .filter(entry -> entry.getValue() > 1)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
        System.out.println(duplicateCountMap);
        //20. How to check if list is empty in Java 8 using Optional, if not null iterate through the list and print the object?
//        Optional.ofNullable(noteLst)
//                .orElseGet(Collections::emptyList) // creates empty immutable list: [] in case noteLst is null
//                .stream().filter(Objects::nonNull) //loop throgh each object and consider non null objects
//                .map(note -> Notes::getTagName) // method reference, consider only tag name
//                .forEach(System.out::println); // it will print tag names

        // 21. Write a Program to find the Maximum element in an array?
        int[] arr1 = {5, 2, 8, 1, 3};
        int maxElement = Arrays.stream(arr1).max().getAsInt();
        System.out.println("Maximum element in the array: " + maxElement);

        // 22. Write a program to print the count of each character in a String no spaces counting?
        String str = "hello world";
        Map<Character, Long> charCountMap = str.chars()
                .filter(c -> c != ' ') // Filter out spaces
                .mapToObj(c -> (char) c) // Convert int to Character
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(charCountMap);

        Map<String, Long> map = Arrays.stream(str.split(""))
                .map(String::toLowerCase)
                .collect(Collectors.groupingBy(str1 -> str1,LinkedHashMap::new, Collectors.counting()));
        System.out.println(map);

    }
}
