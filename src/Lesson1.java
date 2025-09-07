import java.math.BigInteger;
import java.util.Arrays;

public class Lesson1 {
    public static void main(String[] args) {
        BigInteger number; //инициализация

        number = new BigInteger("12345"); //ссылка на объект в памяти


        //массивы
        int[] numbers = new int[100]; //массив размера 100 элементов (все нули)
        String[] argses = new String[1]; // нуль
        boolean[] bits = new boolean[0]; //false

        int[] numbers2 = new int[] {1, 2, 3, 4, 5}; //массив размера 5
        boolean[] bits2 = new boolean[] {true, false};
        char[] digits = {
                '0', '1', '2', '3', '4'
        };

        System.out.println(numbers2.length);
        System.out.println(numbers2[0]);
        System.out.println(numbers2[numbers2.length - 1]);
        //System.out.println(numbers2[5]); //выход за пределы массива

    System.out.println("------------");

    //многомерные
    int[][] matrix1 = new int[2][2];
    int[][] matrix2 = {{1, 2}, {3, 4}};
    int[][] triangle = {
            {1, 2, 3, 4, 5},
            {6, 7, 8, 9},
            {10, 11, 12},
            {13, 14},
            {15}
    };
    int secondRowLength = triangle[1].length;
    System.out.println(secondRowLength);

    //сравнение массивов
    int[] a = {1, 2, 3};
    int[] b = {4, 5, 6};

    boolean equals1 = a == b; //ссылаются ли переменные на один и тот же объект? (сравнение ссылки)
    // boolean equals2 = a.equals(b);
        // не работает для массивов, но также сравнивает ссылки как equals1
    boolean equals3 = Arrays.equals(a, b); // сравнение содержимого ОДНОМЕРНЫХ массивов
    // boolean equals4 = Arrays.deepEquals(a, b);
        // сравнение содержимого МНОГОМЕРНЫХ массивов

    // печать массивов
    System.out.println("------------");

    System.out.println(a);
    System.out.println(Arrays.toString(a));
    // System.out.println(Arrays.deepToString(a);
        // такая же логика как с deepEquals
    }
}