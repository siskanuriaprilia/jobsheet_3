import java.util.Scanner;
public class PersegiPanjang {
    public int panjang;
    public int lebar;

     // Konstruktor dengan dua parameter untuk inisialisasi panjang dan lebar
     public PersegiPanjang(int p, int l)
    {
    panjang = p;
    lebar = l;
    }

    public void cetakInfo() 
    {
        System.out.println("Panjang: " + panjang + ", Lebar: " + lebar);
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        // Membuat array of PersegiPanjang dengan 100 elemen
        PersegiPanjang[] myArrayOfPersegiPanjang = new PersegiPanjang[100];
        
        // Inisialisasi setiap elemen dalam array
        for (int i = 0; i < myArrayOfPersegiPanjang.length; i++) 
        {
            myArrayOfPersegiPanjang[i] = new PersegiPanjang();
        }

        // Penggunaan input untuk inisialisasi dan cetak informasi persegi panjang
        PersegiPanjang[] arrayOfPersegiPanjang = new PersegiPanjang[3];

        for (int i = 0; i < 3; i++) 
        {
            arrayOfPersegiPanjang[i] = new PersegiPanjang();

            System.out.println("Persegi panjang ke-" + (i + 1));
            System.out.print("Masukkan panjang : ");
            arrayOfPersegiPanjang[i].panjang = sc.nextInt();
            System.out.print("Masukkan lebar   : ");
            arrayOfPersegiPanjang[i].lebar = sc.nextInt();
        }

        // Akses elemen ke-5 dari array dan atur properti panjangnya
        myArrayOfPersegiPanjang[5].panjang = 20;

        // Cetak informasi tentang persegi panjang ke-5
        System.out.println("Panjang persegi panjang ke-5: " + myArrayOfPersegiPanjang[5].panjang);

        // Cetak informasi tentang persegi panjang yang dimasukkan pengguna
        for (int i = 0; i < 3; i++) {
            System.out.print("Persegi panjang ke-" + (i + 1) + ": ");
            arrayOfPersegiPanjang[i].cetakInfo();
        }
    }
}