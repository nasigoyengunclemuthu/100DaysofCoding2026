import java.util.Scanner;

public class abuy {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("=== MENU MAKANAN ===");
        System.out.println("1. Ular goreng");
        System.out.println("2. Buaya bakar");
        System.out.println("3. Es darah ayam");

        System.out.print("Pilih menu: ");
        int pilih = in.nextInt();

        switch (pilih) {
            case 1:
                System.out.println("Anda memilih Ular goreng");
                break;

            case 2:
                System.out.println("Anda memilih Buaya bakar");
                break;

            case 3:
                System.out.println("Anda memilih Es darah ayam");
                break;

            default:
                System.out.println("sold out");
        }

        in.close();
    }
                  }
