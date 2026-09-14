import java.util.Scanner;

  public class biodata {
    public static void main(String[]args ) {

      Scanner in=new Scanner (System.in);
      String nama = in.nextLine();
      int umur = in.nextInt();
      in.nextInt();
      String hobi = in.nextLine();
      double ipk = in.nextDouble();

      System.out.printf("Nama saya %s umur saya %d dan saya hobi %s , makanya ipk sya %f",nama,umur,hobi,ipk);
      
    }
  }
