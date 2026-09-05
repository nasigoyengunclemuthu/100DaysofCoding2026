public class day4 {
  public static void main(String[] agrs){
    //tipe data numerik bilangan bulat 
    byte umur = 18;
    short tahun = 2026;
    int nilai = 95;
    long manusia = 1000000000L;

    // byte untuk menyimpan angka bulat yang kecil (-128 - 127) 
    System.out.println("umur\t:" + umur);

      // short untuk menyimpan angka bulat lebih besar dri byte (-32.768 - 32.767) 
      System.out.println("tahun\t:" + tahun);

    // int ini adalah yang paling umum digunakan dalam java karna angka nya sering di pakai hari hari (-2,5m - 2,4m) 
    System.out.println("nilai\t:" + nilai);

    // long untuk menyimpan angka bulat yang paling besar 
    System.out.println("manusia\t:" + manusia);
  }
}
