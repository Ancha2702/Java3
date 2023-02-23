// Дан произвольный список целых чисел. Удалить из него чётные числа.
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class Lesson3_2 {

    public static void main(String[] args) {
        Random rand = new Random();
        int len = 15;
        List<Integer> list = new ArrayList<>(len);
        for (int i = 0; i < len; i++) {
            list.add(rand.nextInt(100));
        }
        System.out.println(list.toString());

        for (Iterator<Integer> iterator = list.iterator(); iterator.hasNext();) {
            Integer number = iterator.next();
            if (number % 2 == 0) {
                iterator.remove();
            }
        }
        System.out.println(list.toString());
    }
}
