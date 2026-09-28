import java.util.Scanner;
public class incertmen_decrement{
  public static void main(String[]args ){
    Scanner in=new Scanner(System.in);
    int a = in.nextInt();
    int b =a++;
    int c=++a;
    int d=a--;
    int e=--a;
    System.out.println(b);
    System.out.println(c);
    System.out.println(d);
    System.out.println(e);
  }
      }
