import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] list = {45, 78, 95, 62, 32, 65, -96};
        int min = list[0];
        int max = list[0];

        for (int i : list) {
            if (i < min) {
                min = i;
            }
            if (i > max) {
                max = i;
            }
        }
        System.out.println("Minimum Değeri: " + min);
        System.out.println("Maximum Değeri: " + max);

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        Scanner input = new Scanner(System.in);

        int[] number = {15, 12, 788, 1, -1, -778, 2, 0};


        System.out.print("Sayı Girin: ");
        int sum = input.nextInt();
        Arrays.sort(number);
        int minimum = sum;
        int maximum = sum;

        for (int i : number) {
            if (i > sum) {
                maximum = i;
                break;
            }

        }
        System.out.println(maximum);

        for (int i = number.length-1; i >= 0; i--) {
            if (number[i] < sum) {
                minimum = number[i];
                break;
            }

        } System.out.println(minimum);


    }
}