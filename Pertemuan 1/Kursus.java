// Fazar Budiman (1217050056)
import java.util.ArrayList;
import java.util.Collections;
import java.util.Hashtable;
import java.util.Scanner;

class Manusia {
    String nama;
    int penghasilan;
};

class LembagaKursus {
    int minimumPenghasilan = 200000;
    ArrayList <String> skill = new ArrayList <String> ();
    ArrayList <String> skillDanMotivasi = new ArrayList <String> ();
    Hashtable <String, ArrayList> dataKursus = new Hashtable<>();

    void klasifikasiKursus(String nama, int penghasilan){
        if (penghasilan <= this.minimumPenghasilan) {
            skillDanMotivasi.add(nama);
        } else {
            skill.add(nama);
        }
        Collections.sort(skill);
        Collections.sort(skillDanMotivasi);
        dataKursus.put("Pelatihan Skill", skill);
        dataKursus.put("Pelatihan Skill dan Motivasi", skillDanMotivasi);
    }

    void pendataan(){
        System.out.println("Pendataan Pelatihan Warga Desa Mawar");
        System.out.println("=============================");
        Scanner in = new Scanner(System.in);

        System.out.print("Jumlah warga = ");
        int jumlah = in.nextInt();

        for (int i = 0; i < jumlah; i++) {
            Manusia warga  = new Manusia();
            System.out.print((i + 1) + ". Nama : ");
            warga.nama = in.next();
            System.out.print("   Penghasilan (bulan) : ");
            warga.penghasilan = in.nextInt();
            klasifikasiKursus(warga.nama, warga.penghasilan);
        }
    }

    void Pengumuman(){
        System.out.println("\nPENGUMUMAN PELATIHAN WARGA DESA MAWAR");
        System.out.println("========================================");
        System.out.println("Pelatihan Skill => " + dataKursus.get("Pelatihan Skill"));
        System.out.println("Pelatihan Skill dan Motivasi => " + dataKursus.get("Pelatihan Skill dan Motivasi"));
    }
}

public class Kursus {
    public static void main(String[] args) {
        LembagaKursus lembagaKursus = new LembagaKursus();
        lembagaKursus.pendataan();
        lembagaKursus.Pengumuman();
    }
}