import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan angka desimal: ");
        double angka = input.nextDouble();

        int hasil = (int) angka; // konversi manual

        System.out.println("Hasil int: " + hasil);

        input.close();
    }
}
