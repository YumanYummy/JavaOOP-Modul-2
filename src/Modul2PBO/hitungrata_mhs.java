package Modul2PBO;
import java.util.Scanner;

public class hitungrata_mhs{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int Progdas, Kalkulus, Orkom;

        Average go = new Average();

        System.out.println("\n");
        System.out.println("Program Menghitung Nilai Rata-Rata: ");
        System.out.print("Masukkan Nilai Progdas Anda : ");
        Progdas = input.nextInt();
        System.out.print("Masukkan Nilai Kalkulus Anda : ");
        Kalkulus = input.nextInt();
        System.out.print("Masukkan Nilai Orkom Anda : ");
        Orkom = input.nextInt();
        go.setProgdas(Progdas); go.setOrkom(Orkom); go.setKalkulus(Kalkulus);
        go.seenilai();
        go.check();
    }

}