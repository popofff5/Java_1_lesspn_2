package ru.geekbrains.java1.lesson2;

public class Lesson2 {

    public static void main(String[] args) {
        int n = 1;
        switch (n) {
            case 1: n1(); break;
            case 2: n2(); break;
            case 3: n3(); break;
            case 4: n4(); break;
            case 5: n5(); break;

        }
    }

        public static void n1 () {
            int[] a = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};

            System.out.print("1. ");
            for (int i = 0; i < a.length; i++) {
                if (a[i] == 0) a[i] = 1;
                else if (a[i] == 1) a[i] = 0;
                System.out.print(a[i] + " ");
            }
        }

        public static void n2 () {
            int[] a = new int[8];
            System.out.print('\n' + "2. ");
            for (int i = 0; i < a.length; i++) {
                System.out.print((a[i] = i * 3) + " ");
            }

        }

        public static void n3 () {
            int[] a = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
            System.out.print('\n' + "3. ");
            for (int i = 0; i < a.length; i++) {
                if (a[i] < 6) a[i] *= 2;
                System.out.print(a[i] + " ");
            }
        }

        public static void n4 () {
            System.out.println('\n' + "4. ");
            int i, j;
            int[][] a = new int[5][5];
            for (i = 0; i < a.length; i++) {
                a[i][i] = 1;
                a[i][a.length - 1 - i] = 1;

            }
            for (i = 0; i < a.length; i++) {
                for (j = 0; j < a.length; j++) {
                    System.out.print(a[i][j] + " ");
                }
                System.out.println();
            }

        }

        public static void n5 () {
            int min, max, i;

            int[] a = {-65, 67, 1, -1, 2, -2, 3, -3, 10, -10, -66, 66,};
            max = a[0];
            min = a[0];
            for (i = 1; i < a.length; i++) {
                max = (a[i] > max) ? a[i] : max;
                min = (a[i] < min) ? a[i] : min;
            }
            System.out.printf("5. \n Минимальный элемент = %d, \n Максимальный элемент = %d", min, max);


        }

        /*public static void n6 (){
            int[] a = {1, 2, 3, 4, 5, 0, 7, 8};
            int sum1, sum2, i, j;
            sum1 = a[0];
            sum2 = 0;
            i = 1;
            for (j = i; j < a.length; j++) {
                sum2 += a[j];
            }
            if (sum1 != sum2)

        }

        public static void n7 (){

        }
*/

}
