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
        System.out.println("Panjang  : " + panjang);
        System.out.println("Lebar    : " + lebar);
    }

    public int hitungLuas() 
    {
        return panjang * lebar;
    }

    public int hitungKeliling() 
    {
        return 2 * (panjang + lebar);
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        // Penggunaan input untuk menentukan panjang array
        System.out.print("Masukkan jumlah persegi panjang yang akan dimasukkan: ");
        int jumlahPersegiPanjang = sc.nextInt();
        PersegiPanjang[] arrayOfPersegiPanjang = new PersegiPanjang[jumlahPersegiPanjang];

        int panjang, lebar;

        for (int i = 0; i < jumlahPersegiPanjang; i++) 
        {
            System.out.println("Persegi panjang ke-" + (i + 1));
            System.out.print("Masukkan Panjang : ");
            panjang = sc.nextInt();
            System.out.print("Masukkan Lebar   : ");
            lebar = sc.nextInt();
            arrayOfPersegiPanjang[i] = new PersegiPanjang(panjang, lebar);
            System.out.println();
        }

        // Cetak informasi tentang persegi panjang yang dimasukkan pengguna
        for (int i = 0; i < jumlahPersegiPanjang; i++) 
        {
            System.out.println("Persegi Panjang ke- " + (i + 1) + " :");
            arrayOfPersegiPanjang[i].cetakInfo();
            System.out.println("Luas     : " + arrayOfPersegiPanjang[i].hitungLuas());
            System.out.println("Keliling : " + arrayOfPersegiPanjang[i].hitungKeliling());
            System.out.println();
        }
    }
}