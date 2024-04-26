
package latihan1;

/**
 *
 * @author kristiana ketin renta
 * nim:2201010567
 * tgl : 2024-04-26
 */
public class mahasiswa {
    String Nim,Nama;
    
    void setNim(String nim){
        Nim = nim;
    }
    void setNama(String nama){
        Nama = nama;
    }
    String Getnim (){
        return Nim;
    }
    String Getnama(){
        return Nama;
    }
    void tampilhasil(){
        System.out.println("nama saya adalah :"+Getnama());
        System.out.println("nim saya adalah :"+Getnim());
    }
}
