import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan umur: ");
        String teks = input.nextLine();

        int umur = Integer.parseInt(teks);

        System.out.println("Umur: " + umur);

        input.close();
    }
          }
