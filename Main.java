import java.util.Scanner;
import java.util.Random;
public class Main {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Cuantas veces quieres tirar?");
        int tiradas = sc.nextInt();
        int[] freq = new int[12];

        Random rand = new Random();

        for (int i = 0; i < tiradas; i++) {
            int d1 = rand.nextInt(6);
            d1 += 1;
            int d2 = rand.nextInt(6);
            d2 += 1;
            ++freq[d1 + d2 - 2];
        }
        for (int i = 1; i < 12; i++) {
            System.out.println(i+1 + " ha sortit "+ freq[i]+ " vegades");
        }
    }
}