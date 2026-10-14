import java.util.Scanner;

public class abuy {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("masukkan nilai: ");
        int nilai = in.nextInt();

        if (nilai >= 85 && nilai <= 100) {
            System.out.println("A");
        } else if (nilai >= 75) {
            System.out.println("B");
        } else if (nilai >= 60) {
            System.out.println("C");
        } else if (nilai >= 0) {
            System.out.println("D");
        } else {
            System.out.println("Hebat nian kamu dapat nilai nya");
        }

        in.close();
    }
    }
