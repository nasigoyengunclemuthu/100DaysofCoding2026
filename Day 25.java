import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        final double PI = 3.14;

        System.out.print("Masukkan jari-jari: ");
        int r = input.nextInt();

        double luas = PI * r * r;

        System.out.println("Luas lingkaran: " + luas);

        input.close();
    }
}
