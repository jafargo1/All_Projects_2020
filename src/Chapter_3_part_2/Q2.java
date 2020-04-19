package Chapter_3_part_2;


import java.io.File;
import java.io.IOException;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;


public class Q2 {

    public static void main(String[] args) throws IOException {
        Map<Character, Integer> characters = new TreeMap<Character, Integer>();
        Scanner scanner = null;

        try {
            scanner = new Scanner(new File("E:/text.txt"), "utf-8");

            while (scanner.hasNext()) {
                char[] line = scanner.nextLine().toLowerCase().toCharArray();

                for (Character character : line) {
                    if (Character.isLetter(character)) {
                        if (characters.containsKey(character)) {
                            characters.put(character, characters.get(character) + 1);
                        } else {
                            characters.put(character, 1);
                        }
                    }
                }
            }
        } finally {
            if (scanner != null) {
                scanner.close();
            }
        }

        if (!characters.isEmpty()) {
            for (Map.Entry<Character, Integer> entry : characters.entrySet()) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
        }
    }
}
