import java.util.Scanner;

public class abuy {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan umur: ");
        int umur = in.nextInt();

        if (umur >= 18) {
            System.out.println("Dewasa");

            if (umur >= 21) {
                System.out.println("Umur 21 tahun atau lebih");
            }
        } else {
            System.out.println("Belum dewasa");
        }

        in.close();
    }
}
