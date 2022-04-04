package Modul2PBO;

public class Average {

    private int Progdas;
    private int Kalkulus;
    private int Orkom;
    private int check;
    private int seenilai;
    private double ratanilai;

    public int getProgdas() {
        return Progdas;
    }

    public void setProgdas(int Progdas) {
        this.Progdas = Progdas;
    }

    public int getKalkulus() {
        return Kalkulus;
    }

    public void setKalkulus(int Kalkulus) {
        this.Kalkulus = Kalkulus;
    }

    public int getOrkom() {
        return Orkom;
    }

    public void setOrkom(int Orkom) {
        this.Orkom = Orkom;
    }

    public double ratanilai(){
        return ratanilai = ( Progdas + Kalkulus + Orkom ) / 3.0 ;
    }

    public void check(){
        System.out.println("Nilai Rata-Rata Anda : " +ratanilai());
        if(ratanilai > 70){
            System.out.println("Selamat Anda Telah Lulus");
        }else{
            System.out.println("Mohon Maaf Anda Belum Lulus");
        }
    }

    public void seenilai(){
        System.out.println("\n");
        System.out.println("Nilai Anda: ");
        System.out.println("Nilai Progdas Anda: " + getProgdas());
        System.out.println("Nilai Kalkulus Anda: " + getKalkulus());
        System.out.println("Nilai Orkom Anda: " + getOrkom());
        System.out.println("\n");
    }
}
