import java.util.Scanner;
public class PersegiPanjang {
    public int panjang;
    public int lebar;

    public PersegiPanjang(int p, int l) 
    {
        panjang = p;
        lebar = l;
    }

    public void cetakInfo() 
    {
        System.out.println("Panjang : " + panjang + ", Lebar : " + lebar);
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        // Penggunaan input untuk inisialisasi dan cetak informasi persegi panjang
        PersegiPanjang[] arrayOfPersegiPanjang = new PersegiPanjang[3];
        int panjang, lebar;

        for (int i = 0; i < 3; i++) 
        {
            System.out.println("Persegi panjang ke-" + (i + 1));
            System.out.print("Masukkan Panjang : ");
            panjang = sc.nextInt();
            System.out.print("Masukkan Lebar   : ");
            lebar = sc.nextInt();
            arrayOfPersegiPanjang[i] = new PersegiPanjang(panjang, lebar);
        }

        // Cetak informasi tentang persegi panjang yang dimasukkan pengguna
        for (int i = 0; i < 3; i++) 
        {
            System.out.print("Persegi Panjang ke-" + (i + 1) + ", ");
            arrayOfPersegiPanjang[i].cetakInfo();
        }
    }
}
