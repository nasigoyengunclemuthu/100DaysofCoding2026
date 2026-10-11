import java.util.Scanner;

public class abuy {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan suhu: ");
        double suhu = in.nextDouble();

        if (suhu < 20) {
            System.out.println("Dingin");
        } else if (suhu >= 20 && suhu < 30) {
            System.out.println("Normal");
        } else {
            System.out.println("Panas");
        }

        in.close();
    }
          }
