import java.util.Scanner;

public class maill {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan angka: ");
        int a = in.nextInt();

        int b = a++;

        boolean hasil = a > 5 && b != 10;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("Hasil = " + hasil);

        in.close();
    }
}
