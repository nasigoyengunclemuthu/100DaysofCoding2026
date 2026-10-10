import java.util.Scanner;
public class abuy{
  public static void main(String[]args){
    Scanner in = new Scanner (System.in);

    System.out.println("===KALKULATOR===");
    System.out.println("1 TAMBAH(+)");
    System.out.println("2 KURANG(-)");
    System.out.println("3 KALI (*)");
    System.out.println("4 BAGI(/)");
    System.out.println("5 SISA BAGI(%)");

    System.out.print("Pilih operasi:"/n);
    int pilih=in.nextInt();
    System.out.print("angka pertama:"/n);
    int a=in.nextInt();
    System.out.print("angka kedua:"/n);
    int b=in.nextInt();

    if (pilih==1){
      System.out.println("hasil:"+(a+b));
    }else if(pilih==2){
      System.out.println("hasil:"+(a-b));
    }else if(pilih==3){
      System.out.println("hasil:"+(a*b));
    }else if(pilih==4){
      System.out.println("hasil:"+(a/b));
    }else if(pilih==5){
      System.out.println("hasil:"+(a%b));
    }else {
      System.out.println("cuma 1 sampai 5 ");
    }
      
    
  }
  }
