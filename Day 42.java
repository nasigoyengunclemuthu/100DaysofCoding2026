import java.util.Scanner;

public class GajiBersih {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Nama karyawan: ");
        String nama = in.nextLine();

        System.out.print("Gaji pokok: Rp ");
        double gaji = in.nextDouble();

        double pajak;

        if (gaji >= 5000000) {
            pajak = gaji * 0.10;
        } else {
            pajak = gaji * 0.05;
        }

        double gajiBersih = gaji - pajak;

        System.out.println("=== SLIP GAJI ===");
        System.out.println("nama: " + nama);
        System.out.println("gaji pokok: Rp " + gaji);
        System.out.println("potongan pajak: Rp " + pajak);
        System.out.println("gaji bersih: Rp " + gajiBersih);

        in.close();
    }
          }
