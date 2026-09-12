import java.util.Scanner;

public class day10 {
  public static void main (String[]args){

    Scanner input=new Scanner(System.in);

    System.out.println("---DATA DIRI---");

    System.out.print("NAMA: ");
    String nama = input.nextLine();

    System.out.print("TANGGAL LAHIR: ");
    String tanggallahir = input.nextLine();

    System.out.print("JENIS KELAMIN: ");
    char jeniskelamin = input.next().charAt(0);

    System.out.print("TINGGI BADAN: ");
    double tinggi = input.nextDouble();

    System.out.print("UMUR: ");
    int umur = input.nextInt();

    System.out.println("---DATA DIRI---");
    System.out.println("NAMA: "+ nama);
    System.out.println("TANGGAL LAHIR: " + tanggallahir);
    System.out.println("JENIS KELAMIN: " + jeniskelamin);
    System.out.println("TINGGI BADAN: " + tinggi);
    System.out.println("UMUR: " + umur);

    input.close ();
    
    
    
  }
}
