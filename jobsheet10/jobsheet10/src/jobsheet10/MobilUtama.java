/**
 *
 * Created by 21343008- Maharani Safitri
 */
package jobsheet10;


public class MobilUtama {
    public static void main(String[] args) {
        Mobil1 Honda = new Mobil1 ();
        Honda.merk = "Civic";
        Honda.warna = "Hitam";
         Honda.tahunproduksi = 2020;
         System.out.println("Merek\t: " + Honda.merk);
         System.out.println("Warna\t: " + Honda.warna);
         System.out.println("Tahun\t: " + Honda.tahunproduksi);
         Honda.Maju();
         Honda.Maju();
         Honda.Mundur();
         
    }
}
