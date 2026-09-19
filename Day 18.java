import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan angka: ");
        int angka = input.nextInt();

        double hasil = angka; // konversi otomatis

        System.out.println("Hasil: " + hasil);

        input.close();
        int ipk = 10; //konversi otomatis tanpa input
        double a = ipk;

        System.out.println("ipk:"+a);
    }
}
