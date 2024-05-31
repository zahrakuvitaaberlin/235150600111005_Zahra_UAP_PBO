package UAP;

import java.util.ArrayList;
import java.util.Scanner;

public class Data {
    public static ArrayList <Tanaman> tanaman = new ArrayList<>();
    public static ArrayList <Integer> lokasi = new ArrayList<>();
    public static Scanner in = new Scanner(System.in);

    public static void mulai(){
        System.out.println("Umur tanaman dalam bulan : ");
        int nilaiInput = in.nextInt();
        int hasil = nilaiInput*30;
           
        for (int i=0; i<3;i++){
            menanam();
        }
        System.out.println("Proses Perkembangan Tanaman");
            
        for (int i=0; i<3; i++){
            if (Data.tanaman.get(i).Status().equalsIgnoreCase("Hidup")){
                Data.tanaman.get(i).berkembang();
        } else if (Data.lokasi.contains(i)){
            continue;
            } else{
                Class tanamanMati = Data.tanaman.get(i).getClass();
                String nama = tanamanMati.getSimpleName();
                System.out.println("Tanaman " + nama + " sudah mati");
                Data.lokasi.add(i);
                menanam();
            } 
        }
    } 
    
    public static void menanam(){

    }
    public static void info(){

    }
}
