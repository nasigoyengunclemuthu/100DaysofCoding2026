import java.util.Scanner;

public class Nilai {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan nilai: ");
        int nilai = in.nextInt();

        if (nilai >= 80) {
            System.out.println("A");
        } else if (nilai >= 70) {
            System.out.println("B");
        } else if (nilai >= 60) {
            System.out.println("C");
        } else {
            System.out.println("D");
        }

        in.close();
    }
}
