//Реализовать алгоритм сортировки слиянием

import java.util.Arrays;
import java.util.Random;

public class Lesson3_1 {

    public static void main(String[] args) {

        int arr[] = new int[10];
        Random rand = new Random();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(100);
        }

        System.out.println("Исходный массив:");
        System.out.println(Arrays.toString(arr));
        System.out.println("");

        int[] arrCopy = Arrays.copyOf(arr, arr.length);

        sortMerge(arr, arrCopy, 0, arr.length - 1);

      }


    public static void sortMerge(int[] arr, int[] arrCopy, int start, int stop) {
        if (stop == start) {
            return;
        }

        int mid = ((start + stop)/2);

        sortMerge(arr, arrCopy, start, mid);
        sortMerge(arr, arrCopy, mid + 1, stop);

        merge(arr, arrCopy, start, mid, stop);
    }

    public static void merge(int[] arr, int[] arrCopy, int start, int mid, int stop) {
        int index1Start = start;
        int index2Start = start;
        int middle = mid + 1;

        while (index2Start <= mid && middle <= stop) {
            if (arr[index2Start] <= arr[middle]) {
                arrCopy[index1Start] = arr[index2Start];
                index1Start++;
                index2Start++;
            }
            else {
                arrCopy[index1Start] = arr[middle];
                index1Start++;
                middle++;
            }
        }

        while (index2Start <= mid) {
            arrCopy[index1Start] = arr[index2Start];
            index1Start++;
            index2Start++;
        }

        for (index2Start = start; index2Start <= stop; index2Start++) {
            arr[index2Start] = arrCopy[index2Start];
        } System.out.println("Сортировка массива:");
        System.out.println(Arrays.toString(arr));
    }
}

