import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("===== MENU MAKANAN =====");
        System.out.println("1. Nasi Goreng");
        System.out.println("2. Mie Goreng");
        System.out.println("3. Ayam Geprek");
        System.out.println("4. Es Teh");

        System.out.print("Pilih menu: ");
        int pilih = in.nextInt();

        if (pilih == 1) {
            System.out.println("Anda memilih Nasi Goreng");
        } else if (pilih == 2) {
            System.out.println("Anda memilih Mie Goreng");
        } else if (pilih == 3) {
            System.out.println("Anda memilih Ayam Geprek");
        } else if (pilih == 4) {
            System.out.println("Anda memilih Es Teh");
        } else {
            System.out.println("Menu tidak tersedia");
        }

        in.close();
    }
          }
