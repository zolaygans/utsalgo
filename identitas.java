import java.util.Random;

public class PerkenalanDiri {

  public static void main(String[] args) {

    String[] hobies = {"Bermain Game","Travelling","Memasak"};

    String nama = "Sandi Winata";
    String prodi = "Ilmu Komputer";
    String nim = "I.2310247";
    String fakultas = "FILKOM";
    
    System.out.println("Halo!");
    System.out.println("Perkenalkan nama saya " + nama); 
    
    System.out.println("Saya adalah mahasiswa " + prodi + " dengan NIM " + nim);
    System.out.println("di Fakultas " + fakultas);
    
    System.out.println("Beberapa hobi saya:");
    for(String hobi : hobies) {
      System.out.println("- " + hobi);
    }

  }

}
