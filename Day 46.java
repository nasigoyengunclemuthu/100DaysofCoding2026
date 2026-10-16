import java.util.Scanner;

public class abi {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

       
        System.out.println("=== PROGRAM NAMA HARI===");
    
        System.out.println("1. Senin");
        System.out.println("2. Selasa");
        System.out.println("3. Rabu");
        System.out.println("4. Kamis");
        System.out.println("5. Jumat");
        System.out.println("6. Sabtu");
        System.out.println("7. Minggu");
       

        System.out.print("Masukkan nomor hari: ");
        int hari = in.nextInt();

        switch (hari) {
            case 1:
                System.out.println("Hari senin");
                break;
            case 2:
                System.out.println("Hari selasa");
                break;
            case 3:
                System.out.println("Hari rabu");
                break;
            case 4:
                System.out.println("Hari kamis");
                break;
            case 5:
                System.out.println("Hari jumat");
                break;
            case 6:
                System.out.println("Hari sabtu");
                break;
            case 7:
                System.out.println("Hari minggu");
                break;
            default:
                System.out.println("Cuma 7 hari ji nd ad hari ke 8 sampe seterusnya!");
        }

        in.close();
    }
                                   }
