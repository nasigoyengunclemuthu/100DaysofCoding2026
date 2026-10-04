import java.util.Scanner;

public class abuyy{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan nilai: ");
        int nilai = in.nextInt();

        if (nilai >= 75) {
            System.out.println("Lulus");
        } else {
            System.out.println("Tidak Lulus");
        }

        in.close();
    }
}
