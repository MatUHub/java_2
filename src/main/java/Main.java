import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();

    }

    //Задание №1
//Написать метод, возвращающий количество чётных элементов массива.
// countEvens([2, 1, 2, 3, 4]) → 3 countEvens([2, 2, 0]) → 3 countEvens([1, 3, 5]) → 0
    public static void task1() {
        Integer[] arr1 = {2, 1, 2, 3, 4};
        Integer[] arr2 = {2, 2, 0};
        Integer[] arr3 = {1, 3, 5};
        System.out.println("Задание №1");
        System.out.println("Элементы массива - " + Arrays.toString(arr1));
        System.out.println("Кол-во четных элементов - " + countEvents(arr1));
        System.out.println("Элементы массива - " + Arrays.toString(arr2));
        System.out.println("Кол-во четных элементов - " + countEvents(arr2));
        System.out.println("Элементы массива - " + Arrays.toString(arr3));
        System.out.println("Кол-во четных элементов - " + countEvents(arr3));
    }

    public static int countEvents(Integer[] arr) {
        int count = 0;
        for (int num : arr) {
            if (num % 2 == 0) {
                count += 1;
            }
        }
        return count;
    }

    //Задание №2
//Написать функцию, возвращающую разницу между самым большим и самым
// маленьким элементами переданного не пустого массива.

    public static void task2() {
        System.out.println();
        System.out.println("Задание №2");
        Integer[] arr1 = {2, 1, 2, 3, 4};
        Integer[] arr2 = {2, 2, 0};
        Integer[] arr3 = {1, 3, 5};
        System.out.println("Элементы массива - " + Arrays.toString(arr1));
        System.out.println("Разница между элементами - " + getDifferens(arr1));
        System.out.println("Элементы массива - " + Arrays.toString(arr2));
        System.out.println("Разница между элементами - " + getDifferens(arr2));
        System.out.println("Элементы массива - " + Arrays.toString(arr3));
        System.out.println("Разница между элементами - " + getDifferens(arr3));
    }

    public static int getDifferens(Integer[] arr) {
        return maxNum(arr) - minNum(arr);
    }

    public static int maxNum(Integer[] arr) {
        int max = arr[0];
        for (int num : arr) {
            if (max < num) max = num;
        }
        return max;
    }

    public static int minNum(Integer[] arr) {
        int min = arr[0];
        for (int num : arr) {
            if (min > num) min = num;
        }
        return min;
    }

    //Задание №3
    //Написать функцию, возвращающую истину, если в переданном
// массиве есть два соседних элемента, с нулевым значением.
    public static void task3() {
        System.out.println();
        System.out.println("Задание №3");
        Integer[] arr1 = {2, 1, 0, 3, 4};
        Integer[] arr2 = {2, 1, 0, 0, 4};
        Integer[] arr3 = {2, 0, 2, 0, 4};
        System.out.println("Элементы массива - " + Arrays.toString(arr1));
        System.out.println("Два элемента с нулевым значением - " + doubleZero(arr1));
        System.out.println("Элементы массива - " + Arrays.toString(arr2));
        System.out.println("Два элемента с нулевым значением - " + doubleZero(arr2));
        System.out.println("Элементы массива - " + Arrays.toString(arr3));
        System.out.println("Два элемента с нулевым значением - " + doubleZero(arr3));

    }

    public static boolean doubleZero(Integer[] arr) {
        int counter = 0;
        for (int num : arr) {
            if (counter == 2) return true;
            if (num == 0) counter += 1;
            else counter = 0;
        }
        return false;
    }
}
