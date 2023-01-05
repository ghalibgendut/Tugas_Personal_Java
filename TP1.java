
/**
 * TP1
 */

import java.util.Scanner;

class TP1 {

    public static void main(String[] args) {
        ramalan();
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

    public static void ramalan() {
        Scanner input = new Scanner(System.in);

        String name, coupleName;
        int age, coupleAge, size;
        double count, result;

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

        size = 4;
        for (int m = 0; m < size; m++) {
            for (int n = 0; n <= 4 * size; n++) {
                double pos1 = Math.sqrt(Math.pow(m - size, 2) + Math.pow(n - size, 2));
                double pos2 = Math.sqrt(Math.pow(m - size, 2) + Math.pow(n - 3 * size, 2));

                if (pos1 < size + 0.5 || pos2 < size + 0.5) {
                    System.out.print('*');
                } else {
                    System.out.print(' ');
                }
            }
            System.out.print(System.lineSeparator());
        }
        // for loop to print the lower part of Heart
        for (int m = 1; m <= 2 * size; m++) {
            for (int n = 0; n < m; n++) {
                System.out.print(' ');
            }
            for (int n = 0; n < 4 * size + 1 - 2 * m; n++) {
                System.out.print("*");
            }
            System.out.print(System.lineSeparator());
        }
        System.out.print("\n\n");

        System.out.printf("%s [%d] tahun", coupleName, coupleAge);
        System.out.print("\n");

        System.out.print("Tekan Enter untuk melihat hasil ramalan...");
        input.nextLine();
        System.out.print("\n");

        count = Math.random() * (50 - 100 + 1) + 100 / 1.1;
        result = (int) (Math.round(count * 100)) / 100.0;
        System.out.println("Kecocokan anda dengan pasangan anda adalah : " + result + "%");
        System.out.println("Terima kasih karena anda telah menggunakan jasa ramalan kami.. ^^v");

    }

    public static void testWrite() {
        System.out.println("Hello World");
    }
}