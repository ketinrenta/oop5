
package latihan1;

/**
 *
 * @author kristiana ketin renta
 * nim : 2201010567
 * tgl : 2024-04-26
 */
public class hitungluassegi3 {
    double Alas,Tinggi,Luas;
    
    void setAlas( double nilai){
        Alas = nilai;
    }
    void setTinggi(double nilai){
        Tinggi = nilai;
    }
    double getAlas(){
        return Alas;
    }
    double getTinggi(){
        return Tinggi;
    }
    double HitungLsegi3(){
        double hsl = (Alas*Tinggi)/2;
        return hsl;
    }
    void tampilhasil(){
        System.out.println("Hitung Luas Segi Tiga");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Hitung Alas     : "+Alas);
        System.out.println("Hitung Tinggi   : "+Tinggi);
        System.out.println("Hitung Luas     : ");
        System.out.println(" Luas = Alas*Tinggi/2");
        System.out.println("    = "+Alas+"*"+Tinggi+"/2");
        System.out.println(" = "+Luas);
        
    }
}
