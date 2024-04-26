
package latihan1;

/**
 *
 * @author kristiana ketin renta
 *  nim = 2201010567
 * tgl = 2024-04-26
 */
public class Latihan1 {
   
    aritmatika B = new aritmatika();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         aritmatika Amatik = new aritmatika();
        int hsltambah = 0;
        
        hsltambah = Amatik.tambah(3,5);
        System.out.println("hasil: "+hsltambah);
        
        hitungluassegi3 HLS3 = new hitungluassegi3();
        HLS3.setAlas(5);
        HLS3.setTinggi(9);
        double hsl = HLS3.HitungLsegi3();
        HLS3.tampilhasil();
        
        mahasiswa mhs = new mahasiswa();
        mhs.setNama("ketin");
        mhs.setNim("2201010567");
        mhs.tampilhasil();
    } 
    
}
