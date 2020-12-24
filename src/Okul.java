import okul.Ogrenci;
import okul.Sinif;

import java.util.LinkedList;
import java.util.List;

public class Okul {
    public static List<Ogrenci> ogrenciler = new LinkedList<>();
    public static List<Sinif> siniflar = new LinkedList<>();

        public static void main(String[] args) {
            init();
            ogrenciYerlerstir();
            ogrecileriYazdir();
    }

    public static void init(){

        //siniflari olustur
        siniflar.add(new Sinif(1,6));
        siniflar.add(new Sinif(2,7));
        siniflar.add(new Sinif(3,8));
        siniflar.add(new Sinif(4,9));
        siniflar.add(new Sinif(5,10));

        //ögrencileri olustur
        ogrenciler.add(new Ogrenci("Hans","Muller",6));
        ogrenciler.add(new Ogrenci("Peter","Kneubuehler",6));
        ogrenciler.add(new Ogrenci("Marco","Geiger",7));
        ogrenciler.add(new Ogrenci("Stefan","Bruehlmann",7));
        ogrenciler.add(new Ogrenci("Martin","Ruegg",8));
        ogrenciler.add(new Ogrenci("Urs","Mohler",8));
        ogrenciler.add(new Ogrenci("Roger","Schneider",9));
        ogrenciler.add(new Ogrenci("Reto","Gehrig",9));
        ogrenciler.add(new Ogrenci("Simon","Berger",10));
        ogrenciler.add(new Ogrenci("Lars","Meier",10));

        /* ogrencileri konsoldan girmek icin
        String adi = null;
        String soyadi = null;
        int yasi = 0;
        for (int i = 1; i <= 10; i++) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Ogrenci ["+i+"] Adi: ");
            adi = sc.nextLine();
            System.out.print("Ogrenci ["+i+"] Soyadi: ");
            soyadi = sc.nextLine();
            System.out.print("Ogrenci ["+i+"] Yasi: ");
            yasi = sc.nextInt();
            ogrenciler.add(new Ogrenci(adi,soyadi,yasi));
            adi = null;
            soyadi = null;
            yasi = 0;
         */
        }

    // Ogrencileri yaslarina göre siniflara yerlestirme
    public static void ogrenciYerlerstir(){

            for (int j = 0; j < ogrenciler.size(); j++) {
                switch (ogrenciler.get(j).getYas())
                {
                    case 6:
                        siniflar.get(0).ogrenciEkle(ogrenciler.get(j));
                        break;
                    case 7:
                        siniflar.get(1).ogrenciEkle(ogrenciler.get(j));
                        break;
                    case 8:
                        siniflar.get(2).ogrenciEkle(ogrenciler.get(j));
                        break;
                    case 9:
                        siniflar.get(3).ogrenciEkle(ogrenciler.get(j));
                        break;
                    case 10:
                        siniflar.get(4).ogrenciEkle(ogrenciler.get(j));
                }
            }
    }

    public static void ogrecileriYazdir(){
        for (int i = 0; i < siniflar.size(); i++) {
            siniflar.get(i).toString();
        }
    }


    }



