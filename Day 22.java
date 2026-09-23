import java.util.Scanner;

public class tukarnilai{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai a: ");
        int a = input.nextInt();

        System.out.print("Masukkan nilai b: ");
        int b = input.nextInt();

        int sementara = a;
        a = b;
        b = sementara;

        System.out.println("Setelah ditukar:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        input.close();
    }
  }
