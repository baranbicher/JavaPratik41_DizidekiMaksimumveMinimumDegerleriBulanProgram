# JavaPratik41_DizidekiMaksimumveMinimumDegerleriBulanProgram
En Yakın Min Max Değer Bulma
Dizideki Elemanların Max ve Min Değerlerini Bulan Program
      
      public class Main {
      public static void main(String[] args) {
        int[] list = {56, 34, 1, 8, 101, -2, -33};
      
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

        System.out.println("Minimum Değer " + min);
        System.out.println("Maximum Değer " + max);

    }
    }

Ödev
Dizideki elemanların girilen sayıdan küçük en yakın sayıyı ve en büyük en yakın sayıyı bulan programı yazınız.

