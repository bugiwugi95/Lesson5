import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;

public class HashSets {
    public static void main(String[] args) {
        File file = new File("text.set");
         getTextFromFile(String.valueOf(file));


    }


    private static void getTextFromFile(String file) {
        String line;
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
            while ((line = bufferedReader.readLine()) != null) {

                String[] words = line.split("[,.' ']");
                HashSet<String> hashSet = new HashSet<>();
                for (int i = 0; i < words.length; i++) {
                    hashSet.add(words[i]);

                }
                System.out.println(hashSet);
                System.out.println(hashSet.size());

            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
