import java.util.HashMap;
import java.util.Scanner;

public class countWord {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string : ");
        String name = sc.nextLine();
        HashMap<String, Integer> wordCountMap = new HashMap<>();
        String[] words = name.split("\\s+");

        for (String word : words) 
        {
            if (wordCountMap.containsKey(word)) 
            {
                int count = wordCountMap.get(word);
                wordCountMap.put(word, count + 1);
            } 
            else 
            {
                wordCountMap.put(word, 1);
            }
        }

        System.out.println("Word count:");
        for (String word : wordCountMap.keySet()) 
        {
            System.out.printf("%s: %d%n", word, wordCountMap.get(word));
        }
    }
}
