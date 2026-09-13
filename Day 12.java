import java.util.Scanner;

  public class biodata {
    public static void main(String[]args ) {

      Scanner input=new Scanner (System.in);

      System.out.println("BIODATA");
      System.out.print("MASUKAN NAMA ANDA :");
      String nama = input.nextLine();
      System.out.print("MASUKAN NIM ANDA :");
      String nim = input.nextLine();
      System.out.print("KELAS ANDA :");
      String kelas = input.nextLine();
      System.out.print("UMUR ANDA :");
      int umur = input.nextInt();
      System.out.print("MASUKAN IPK ANDA :");
      double ipk = input.nextDouble();

      System.out.println("====BIODATA KAMU====");
      System.out.printf("NAMA\t:%s%n",nama);
      System.out.printf("NIM\t:%s%n",nim);
      System.out.printf("KELAS\t:%s%n",kelas);
      System.out.printf("UMUR\t:%d%n",umur);
      System.out.printf("IPK\t:%.2f%n",ipk);
      
    }
  }
