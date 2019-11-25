import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Main {

    private static Random random = new Random();

    private static void taskOne() {
        List<Integer> integerList = new ArrayList<>();
        for (int i = 0; i < 12; i++) {
            integerList.add(random.nextInt(100));
        }
        Collections.sort(integerList);

        System.out.println(integerList); // print original
        for (int i = 2; i < integerList.size(); i++) {
            integerList.remove(i);
        }
        System.out.println(integerList); // print modified
    }

    private static void taskTwo() {
        List<Integer> integerList = new ArrayList<>();
        for (int i = 0; i < 12; i++) {
            integerList.add(random.nextInt(6) + 10);
        }
        int originalSize = integerList.size();

        System.out.println(integerList); // print original
        for (int i = 3; i < originalSize; i += 4) {
            integerList.add(i+1, random.nextInt(6) + 20);
        }
        System.out.println(integerList); // print modified
    }

    public static void main(String[] args) {
        taskOne();
        taskTwo();
    }

}
