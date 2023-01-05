/**
 * Forum
 */
import java.util.Scanner;

public class Forum {
    public static void main(String[] args) {
        nilai();
    }

    public static void nilai() {
        Scanner input = new Scanner(System.in);

        int nilai=0;
        System.out.print("Masukan Nilai : ");
        nilai = input.nextInt();
        if (nilai > 70) {
            System.out.println("Selamat Anda Lulus!");
        }
        else {
            System.out.println("Maaf Anda tidak Lulus!");
        }

    }
    
}
