package dsa.streamquestions;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

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
        //Given a list of integers, sort all the values present in it in descending order using Stream functions?
        list.stream()
                .sorted(Collections.reverseOrder())
                .forEach(System.out::println);
    }
}
