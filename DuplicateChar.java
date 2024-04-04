import java.util.HashSet;
import java.util.Set;

public class DuplicateChar {
    public static void main(String[] args) {
        String input = "hello my name is Ishwar khedkar";
        Set<Character> seenCharacters = new HashSet<>();
        Set<Character> duplicateCharacters = new HashSet<>();

        input = input.toLowerCase();

        for (char c : input.toCharArray()) 
        {
            if (seenCharacters.contains(c)) 
            {
                duplicateCharacters.add(c);
            } 
            else 
            { 
                seenCharacters.add(c);
            }
        }

        // Print the duplicate characters
        System.out.println("Duplicate characters:");
        for (char c : duplicateCharacters) 
        {
            System.out.println(c);
        }
    }
}
