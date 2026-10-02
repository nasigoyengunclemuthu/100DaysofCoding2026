import java.util.Scanner;

public class Logika {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan umur: ");
        int umur = in.nextInt();
        boolean jagopani=false;

        System.out.println("Dewasa dan <= 25: " + (umur >= 18 && umur <= 25));
        System.out.println("Di bawah 18 atau di atas 25: " + (umur < 18 || umur > 25));
        System.out.println(!jagopani);

        in.close();
    }
                                                   }
