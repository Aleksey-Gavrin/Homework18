import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Результат выполнения задания 1:");
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        printOddNums(nums);
        System.out.println();
        System.out.println();
        System.out.println("Результат выполнения задания 2:");
        printEvenNums(nums);
        System.out.println();
        List<String> strings = new ArrayList<>(List.of("один", "два","два", "три", "три", "три"));
        System.out.println("Результат выполнения задания 3:");
        printUniqueWords(strings);
        System.out.println();
        System.out.println("Результат выполнения задания 4:");
        printWordsMatches(strings);
    }

       /* Задание 1
        Напишите код, с помощью которого можно напечатать только нечетные числа в консоль. Код должен работать с любой
        последовательностью и объемом списка чисел.
        В качестве отладочной информации можете использовать список чисел:
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7))*/

    public static void printOddNums (List<Integer> listOfNums) {
        for (Integer num: listOfNums) {
            if (num % 2 != 0) {
                System.out.print(num + ", ");
            }
        }
    }

    /*Задание 2
    Напишите код, с помощью которого можно напечатать только четные числа без повторений в порядке возрастания.
    Код должен работать с любой последовательностью и объемом списка чисел.
    В качестве отладочной информации можете использовать список чисел:
    List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7))*/

    public static void printEvenNums (List<Integer> listOfNums) {
        Set<Integer> sortedNums = new TreeSet<>();
        for (Integer num: listOfNums) {
            if (num % 2 == 0) {
                sortedNums.add(num);
            }
        }
        System.out.println(sortedNums);
    }

    /*Задание 3
    Напишите код, который выводит в консоль все уникальные слова из списка слов, в котором могут встречаться дубли.
    Код должен работать с любой последовательностью и объемом списка слов.
    В качестве отладочной информации возьмите произвольный набор слов или текст, в котором встречаются повторения.*/

    public static void printUniqueWords (List<String> strings) {
        Set<String> uniqueWords = new HashSet<>(strings);
        System.out.println(uniqueWords);
    }

    /*Задание 4
    Напишите код, который выводит в консоль количество дублей для каждого уникального слова. Код должен работать
    с любой последовательностью и объемом списка слов.
    В качестве отладочной информации используйте:
    List<String> strings = new ArrayList<>(List.of("один", "два","два", "три", "три", "три"));*/

    public static void printWordsMatches (List<String> strings) {
        Map<String,Integer> mapWordsMatches = new HashMap<>();
        for (String str: strings) {
            if (mapWordsMatches.containsKey(str)) {
                Integer wordCount = mapWordsMatches.get(str);
                mapWordsMatches.put(str, wordCount + 1);
            } else {
                mapWordsMatches.put(str, 1);
            }
        }
        for (Map.Entry<String,Integer> entry: mapWordsMatches.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}