import jdk.internal.icu.lang.UCharacterDirection;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Massiv1 {




    public static void main(String[] args) {
        //Number1();
        // Number2();
        //Number3();
        // Number4();
        // Number5(5,2);
        Number6();


    }


    static void Number1() {

        int[] number1 = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        int A = number1.length;

        for (int i = 0; i < A; i++)

            if (number1[i] == 1) {
                number1[i] = 0;

            } else number1[i] = 1;

        for (int i = 0; i < A; i++) {
            System.out.println("[" + i + "]" + number1[i] + " ");
        }

    }

    static void Number2() {
        int[] number2 = new int[100];

        for (int i = 0; i < number2.length; i++) {


            System.out.println("[" + i + "]" + (i + 1));

        }
    }

    static void Number3() {

        int[] number3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};

        for (int i = 0; i < number3.length; i++)
            if (number3[i] < 6) {
                number3[i] = number3[i] * 2;
            }
        for (int i = 0; i < number3.length; i++) {

            System.out.println(number3[i]);

        }
    }

    public static void printDoubleArr(int[][] douleArr) {

        for (int i = 0; i < douleArr.length; ++i) {
            System.out.println(Arrays.toString(douleArr[i]));
        }

    }

    public static void Number4() {
        int[][] arr = new int[7][7];
        for (int i = 0; i < arr.length; ++i) {
            arr[i][i] = 1;
            arr[i][arr[i].length - 1 - i] = 1;
        }

        printDoubleArr(arr);
    }

    // Написать метод, принимающий на вход два аргумента: len и initialValue, и возвращающий одномерный массив типа int длиной len,
    // каждая ячейка которого равна initialValue;

    public static void Number5(int len, int initiaValue) {
        int[] num5 = new int[len];
        for (int i = 0; i < num5.length; i++) {
            System.out.println(num5[i] + initiaValue);
        }

    }

    //Задать одномерный массив и найти в нем минимальный и максимальный элементы
    public static void Number6() {
            int[] num6 = {1, 2, 5, 7, 9, -45, 21, -13};
            int max = num6[0];
            int min = num6[0];

            for (int i = 0; i < num6.length; i++) {
                if (num6[i] < min) {
                    min = num6[i];
                }

                if (num6[i] > max) {
                    max = num6[i];
                }
            }
            System.out.println(min);
            System.out.println(max);
        }

}



























        
                









