import java.lang.reflect.Method;
import java.util.Scanner;


public class TK2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean run = true;
        boolean askUserCondition = true;
        String answare;

        do {
            if (run) {
                numbers();
            }
            do{
                System.out.print("Anda ingin mengulang [y/t] : ");
                answare = input.nextLine();
                askUserCondition = answare.toLowerCase().equals("t") ? false : true;
                run = askUserCondition;
                if (askUserCondition == true) {
                    break;
                }
                
            }while (askUserCondition);
        }while (run);
    }

    public static void numbers() {
        Scanner input = new Scanner(System.in);

        String name, nim;
        int limit;
        boolean condition = true;
        int number = 1;
        int total = 0;

        System.out.print("Masukan Nama Anda [1..25] : ");
        name = input.nextLine();
        System.out.print("\n");
        if (name.length() < 1) {
            System.out.print("Nama minimal 1 karakter");
        }
        else if (name.length() > 25) {
            System.out.print("Nama maksimal 25 karakter");
        }
        else {
            System.out.print("Masukan NIM anda [harus 10 karakter] : ");
            nim = input.nextLine();
            if (nim.length() != 10) {
                System.out.print("NIM Anda kurang atau lebih dari 10 karakter");
            }
            else {
                System.out.println("\n");
                System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n");
                System.out.println("Registrasi Sukses.,");
                System.out.println("Selamat data " + name + " [ : " + nim + " ].. ^^v\n" );
                System.out.println("Mari belajar macam-macam deret bilangan..\n");
                System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n");

                System.out.print("Masukan Sembarang Angka [5..20] : ");
                limit = input.nextInt();
                System.out.println("\n");
                if (limit < 5 || limit > 20) {
                    System.out.print("Angka yang diinput minimal 5 dan maksimal 20");
                }
                else {
                    System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n");
                    System.out.println("Deret Bilangan");
                    System.out.println("################\n");

                    System.out.println(limit + " Bilangan Genap : ");
                    even(limit);
                    System.out.println(limit + " Bilangan Ganjil : ");
                    odd(limit);
                    System.out.println(limit + " Bilangan Fibonacci : ");
                    fibonacci(limit);

                }

            }
        }
    }

    public static void even(int limit) {
        boolean condition = true;
        int number = 1, total = 0, resultEven = 0;

        while (condition) {
            if (number % 2 == 0) {
                System.out.print(number + " ");
                resultEven += number;
                total++;
                if (total == limit) condition = false;
            }
            number++;
        }
        System.out.println("Hasil penjumlahan bilangan Genap = " + resultEven);
    }

    public static void odd (int limit) {
        boolean condition = true;
        int number = 1, total = 0, resultEven = 0;

        while (condition) {
            if (number % 2 == 1) {
                System.out.print(number + " ");
                resultEven += number;
                total++;
                if (total == limit) condition = false;
            }
            number++;
        }
        System.out.println("Hasil penjumlahan bilangan Ganjil = " + resultEven);
    }

    public static void fibonacci (int limit) {
        boolean condition = true;
        int total = 1, temp = 1, result = 1, show = 1, resultFibo = 0;

        while (condition) {
            if(total == 3){
                result = 2;
                temp = 1;
            }else{
                if(total > 3){
                    show = result+temp;
                    temp = result; 
                    result = show;
                }
            }
            System.out.print(result + " ");
            resultFibo += result;
            total++;
            if (total == limit) condition = false;
            
            result++;
        }
        System.out.println("Hasil penjumlahan bilangan Fibonnaci = " + resultFibo);
    }

}
