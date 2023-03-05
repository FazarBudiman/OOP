import java.util.Scanner;

class Manusia {
    String nama;
    int penghasilan;
};

class LembagaKursus {
    int minimumPenghasilan = 200000;

    String klasifikasiKursus(String nama, int penghasilan){
        if (penghasilan <= this.minimumPenghasilan) {
            return nama + " => Pelatihan Skill dan Motivasi";
        } else {
            return nama + " => Pelatihan Skill";
        }
    }

    String[]  pendataan(){
        System.out.println("Pendataan Pelatihan Warga Desa Mawar");
        System.out.println("=============================");
        Scanner in = new Scanner(System.in);

        System.out.print("Jumlah warga = ");
        int jumlah = in.nextInt();
        
        String[] data = new String[jumlah];
        for (int i = 0; i < data.length; i++) {
            Manusia warga  = new Manusia();
            System.out.print((i + 1) + ". Nama : ");
            warga.nama = in.next();
            System.out.print("   Penghasilan : ");
            warga.penghasilan = in.nextInt();
            data[i] = klasifikasiKursus(warga.nama, warga.penghasilan);
        }
        return data;
    }

    void Pengumuman(String[] hasil){
        System.out.println("\nPENGUMUMAN PELATIHAN WARGA DESA MAWAR");
        System.out.println("========================================");
        for (int i = 0; i < hasil.length; i++) {
            System.out.println((i + 1) + ". " + hasil[i]);
        }
    }
}




public class Kursus {
    public static void main(String[] args) {
        LembagaKursus lembagaKursus = new LembagaKursus();
        String[] data = lembagaKursus.pendataan();
        lembagaKursus.Pengumuman(data);
    }
}