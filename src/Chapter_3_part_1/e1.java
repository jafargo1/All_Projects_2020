package Chapter_3_part_1;


import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.LinkedList;
import java.util.Random;
import java.util.Set;

public class e1 {

    public static int sum;

    public static void main(String[] args) {
        Random r = new Random();
        int[] random = new int[100];
        for (int i = 0; i < random.length; i++) {
            random[i] = r.nextInt(100) + 1;
        }
        for (int i = 0; i < random.length; i++) {
            System.out.println(random[i]);
        }
        final List<Integer> randomList = new LinkedList<>();
        for (int i : random) {
            randomList.add(i);
            sum = i + i;
        }
        System.out.println("+++++++++++++++++++");
        System.out.println("The Sum Is :" + sum);

    }

    private static void sortElements(Collection<int[]> values) {
        Set<int[]> set = new HashSet<int[]>(values);
        for (int[] is : set) {
            System.out.printf("Sorted Elements: %d ", values);
        }
        System.out.println();
    }

    // Calculate Sum of the elements
    // Calculate floating point average of the elements.
}
