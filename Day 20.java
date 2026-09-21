import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan umur: ");
        int umur = input.nextInt();

        String teks = String.valueOf(umur);

        System.out.println("String: " + teks);

        input.close();
    }
}
