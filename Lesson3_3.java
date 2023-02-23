// Задан целочисленный список ArrayList. 
// Найти минимальное, максимальное и среднее арифметичское этого списка.
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Lesson3_3 {
    public static void main(String[] args) {
        Random random = new Random();
        int len = 10;
        List<Integer> list = new ArrayList<>(len);
        for (int i = 0; i < len; i++) {
            list.add(random.nextInt(100));
        }



        int min = Collections.min(list);
        int max = Collections.max(list);
        int count = 0;
        int sum = 0;
        
        for (Integer i : list) {
            sum += i;
            count ++;
        }
        double sr_ar = sum / count;
        System.out.println(list.toString());
        System.out.println("Минимальное в массиве: " + min);
        System.out.println("Максимальное в массиве: " + max);
        System.out.println("Cредне-арифметическое: " + sr_ar);
    }  
}