package si_regpagi.pkg22166017.latihan19.saldotabungan;
/**
 *
 * @author User
 * Nama : Silky Afina Saly
 * NIM  : 22166017
 * Prodi: Sistem Informasi
 * Deskripsi Program: Program berisi program untuk menampilkan saldo tabungan
 */
public class SI_RegPagi22166017Latihan19SaldoTabungan {
    public static void main(String[] args) {
  
// deklarasi variabel
  double saldo_awal = 2500000;
  double bunga= 0.15; // bunga sebesar 15% setiap bulan
  
   
  // pengulangan sebanyak 6 kali
  for (int bulan=1; bulan <=6; bulan++){
   
  // menghitung saldo akhir
    double saldo_akhir = saldo_awal*(1+bunga); 
    System.out.printf("Saldo di bulan ke-%d = %.2f%n", bulan, saldo_akhir);
    saldo_awal= saldo_akhir;
   }
  System.out.println("(Developed by: Silky Afina Saly)");
}
    }
    


  
    

