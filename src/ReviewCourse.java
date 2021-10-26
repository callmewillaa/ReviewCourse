import java.util.Scanner;

public class ReviewCourse {
    public static void main(String[] args) {
        // Tipe Data Primitive meliputi int, byte, float, double, char, boolean

        // Deklarasi Tipe Data Primitive pada Variael
        int angkaInteger;
        float angkaFloat;
        byte angkaByte;
        double angkaDouble;
        char hurufChar;
        boolean statusBoolean;

        // Assign value ke Tipe Data
        angkaInteger = 20;
        angkaFloat = 20f;
        angkaByte = 20;
        angkaDouble = 20;
        hurufChar = 'A';
        statusBoolean = true;

        // Cetak isi dari Variables
        System.out.println("Angka Integer adalah = " + angkaInteger);
        System.out.println("Angka Float adalah = " + angkaFloat);
        System.out.println("Angka Byte adalah = " + angkaByte);
        System.out.println("Angka Double adalah = " + angkaDouble);
        System.out.println("Angka Char adalah = " + hurufChar);
        System.out.println("Angka Boolean adalah = " + statusBoolean);

        /*....................................................................*/
        /// Tipe Data Non Primitive seperti String, Scanner

        // Deklarasi Tipe Data Non Primitive pada Variables
        String namaSaya;
        Scanner inputScanner;

        //Assign value ke Tipe Data Non Primitive STRING
        namaSaya = "Putri";

        // Cetak isi variable String namaSaya
        System.out.println("Nama Saya Adalah = " + namaSaya);

        // Tipe Data Scanner digunakan untuk menunggu inputan dari USER
        inputScanner = new Scanner(System.in);
        System.out.println("Masukkan Angka = ");

        // Input dari user ditampung dalam variable bertipe data Primitive
        // Dalam kasus ini inputan user berupa angka ditampung dalam tipe data Integer
        int inputanAngka;
        inputanAngka = inputScanner.nextInt();

        // Cetak isi dari variabel inputanAngka yang diperoleh dari USER
        System.out.println("Angka yang Anda Input Adalah = " + inputanAngka);

        // Input dari user ditampung dalam variable bertipe data Non Primitive STRING
        Scanner inputString;
        inputString = new Scanner(System.in);
        System.out.println("Masukkan nama kamu");
        String namaKamu;
        namaKamu = inputString.nextLine();

        // Cetak isi dari Varaible namaKamu yang diperoleh dari USER
        System.out.println("Nama Kamu Adalah = " + namaKamu);

    }
}
