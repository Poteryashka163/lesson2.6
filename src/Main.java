import java.util.*;

public class Main {
    public static void main(String[] args) {
            // Задание 1
//        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
//        for (Integer num : nums) {
//            if (num % 2 != 0) {
//                System.out.println(num);
//            }
//        }
//    }
            // Задание 2
//        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
//        Set<Integer> evenNums = new TreeSet<>();
//        for (Integer num : nums) {
//            if (num % 2 == 0) {
//                evenNums.add(num);
//            }
//        }
//        for (Integer evenNum : evenNums) {
//            System.out.println(evenNum);
//        }
//    }
        // Задание 3
//                List<String> words = Arrays.asList("apple", "banana", "cherry", "apple", "banana", "grape");
//                Set<String> uniqueWords = new HashSet<>(words);
//                for (String word : uniqueWords) {
//                    System.out.println(word);
//                }
        // Задание 4
        List<String> strings = new ArrayList<>(List.of("один", "два", "два", "три", "три", "три"));
        Map<String, Integer> wordCount = new HashMap<>();
        for (String word : strings) {
            if (wordCount.containsKey(word)) {
                wordCount.put(word, wordCount.get(word) + 1);
            } else {
                wordCount.put(word, 1);
            }
        }
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }



}}



