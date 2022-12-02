/**
 * TP1
 */

import java.util.Scanner;

class TP1 {

    public static void main(String[] args) {
        ramalan();
    }

    public static void ramalan() {
        Scanner input = new Scanner(System.in);

        String name, coupleName;
        int age, coupleAge;
        double count,result;

        System.out.println("Selamat Datang Di Program Ramalan Cupu");
        System.out.println("+++++++++++++++++++++++++++++++++++++++\n");

        System.out.println("Data Anda : ");
        System.out.println("❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️");
        System.out.print("Masukan Nama Anda : ");
        name = input.next();
        System.out.print("Masukan Umur Anda : ");
        age = input.nextInt();
        System.out.print("\n");

        System.out.println("Data Pasangan Anda : ");
        System.out.println("❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️");
        System.out.print("Masukan Nama Pasangan Anda : ");
        coupleName = input.next();
        System.out.print("Masukan Umur Pasangan Anda : ");
        coupleAge = input.nextInt();
        System.out.print("\n");

        System.out.printf("%s [%d] tahun", name, age);
        System.out.print("\n\n");
        System.out.println("  ❤️❤️❤️    ❤️❤️❤️");
        System.out.println(" ❤️❤️❤️❤️❤️  ❤️❤️❤️❤️❤️");
        System.out.println("❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️");
        System.out.println(" ❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️");
        System.out.println("   ❤️❤️❤️❤️❤️❤️❤️❤️");
        System.out.println("     ❤️❤️❤️❤️");
        System.out.println("      ❤️❤️\n\n");

        System.out.printf("%s [%d] tahun", coupleName, coupleAge);
        System.out.print("\n");

        System.out.print("Tekan Enter untuk melihat hasil ramalan...");
        input.nextLine();
        System.out.print("\n");

        count = Math.random()*(50-100+1)+100/1.1;
        result = (int)(Math.round(count*100))/100.0;
        System.out.println("Kecocokan anda dengan pasangan anda adalah : "+result+"%");
        System.out.println("Terima kasih karena anda telah menggunakan jasa ramalan kami.. ^^v");
        
    }



    public static void gudang() {
        Scanner input = new Scanner(System.in);

        String name, productName;
        double buyPrice, sellPrice;
        int productNumber;

        System.out.print("Masukan nama anda : ");
        name = input.nextLine();

        System.out.print("\n");
        System.out.println("Stok Gudang Input Barang");
        System.out.println("##########################\n\n");

        System.out.println("Selamat Datang " + name);
        System.out.print("\n");

        System.out.print("Masukan nama barang yang mau ditambah : ");
        productName = input.nextLine();
        System.out.print("\n");

        System.out.print("Masukan jumlah barang yang mau ditambah : ");
        productNumber = input.nextInt();
        System.out.print("\n");

        System.out.print("Masukan harga beli untuk barang tersebut : ");
        buyPrice = input.nextDouble();
        System.out.print("\n");

        System.out.print("Masukan harga jual untuk barang tersebut : ");
        sellPrice = input.nextDouble();
        System.out.print("\n");

        System.out.println("Stok Gudang Rincian Barang");
        System.out.println("##########################\n\n");

        System.out.println("Nama Barang     : " + productName);
        System.out.println("Jumlah barang   : " + productNumber);
        System.out.println("Harga Beli      : Rp." + String.format("%.2f", buyPrice));
        System.out.println("Harga Jual      : RP." + String.format("%.2f", sellPrice));
    }

    public static void testWrite() {
        System.out.println("Hello World");
    }
}