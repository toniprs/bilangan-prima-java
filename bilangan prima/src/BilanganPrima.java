
import java.util.Scanner;

public class BilanganPrima {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i, j, min, max;
        boolean prima;
        System.out.print("Masukkan Nilai Batas X = ");
        min = input.nextInt();
        System.out.print("Masukkan Nilai Batas Y = ");
        max = input.nextInt();
        
        

        System.out.println("========================================");
        System.out.println(" Bilangan Prima antara " + min + "-" + max + " :");

        for (i = min; i <= max; i++) {
            prima = false;
            if (i == 2) {
                prima = true;
            } else {
                for (j = 2; j < i; j++) {
                    if (i % j == 0) {
                        prima = false;
                        break;
                    } else {
                        prima = true;
                    }
                }
            }

            if (prima) {
                System.out.printf(i + ",");
            }
        }
    }
}
