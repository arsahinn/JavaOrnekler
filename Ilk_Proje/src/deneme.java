
import java.io.File;
import java.util.Scanner;
import jdk.nashorn.internal.parser.TokenType;

public class deneme {

    /*
    public static int ebobBulma(int sayi1 , int sayi2){
    
        int ebob = 1;
        
        for (int i = 1; i <= sayi1 && i <= sayi2; i++) {
            
            if ((sayi1 % i == 0) && (sayi2 % i == 0)) {
                
                ebob = i;
            }
        }
        return ebob;
    
    }

   
    public static boolean asalMi(int sayi) {

        for (int i = 2; i < sayi; i++) {

            if (sayi % 2 == 0) {
                return false;
            }

        }
        return true;

    }

    
    public static boolean asalMi(int sayi) {

        for (int i = 2; i < sayi; i++) {

            if (sayi % i == 0) {

                return false;
            }
        }
        return true;

    }

    

    public static void skorhesaplama(String isim, int puan) {

        System.out.println(isim + " Adlı oyuncunun " + puan + " puanı var");
    }

    public static void skorhesaplama(int puan) {

        System.out.println("İsimsiz oyuncunun " + puan + " puanı var");
    }

    public static void selamlama(String isim) {

        System.out.println("Merhaba Nasilsiniz...");
        System.out.println("Selamlar...." + isim);

    }

    public static void faktoriyel() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen bir sayi giriniz :");
        int sayi = scanner.nextInt();

        int faktoriyel = 1;

        while (sayi > 0) {

            faktoriyel *= sayi;

            sayi--;
        }
        System.out.println("Fak :" + faktoriyel);

    }

    public static void toplama(int a, int b) {

        System.out.println("Toplmaları = " + (a + b));
    }

    public static void toplama(int a, int b, int c) {

        System.out.println("Toplamları = " + (a + b + c));

    }

    public static int test(int a, int b) {

        return (a + b);

    }

    public static int ikiilecarp(int a) {

        return (a * 2);
    }

    public static int ikiiletopla(int a) {

        return (a + 2);
    }

    public static int dortilecarp(int a) {
        return (a * 4);
    }
     */
    public static void main(String[] args) {
        /*
        int a = 10;
        int b = a * 2;
        int c = a * b * 2;

        int toplam = a + b + c;

        toplam = toplam - 5;
       
        System.out.println("Toplam =" + toplam);
         */

        // byte -> short -> int -> long 
        /*
        short i = 100;
        byte j = 2;
        int k = 4;
        
        long d = i+j+k;
        System.out.println(d);
        
        
        String a = " Merhaba ";
      
        int b = 35;
        
        String c = b+a;
        System.out.println(c);
         
        
        Scanner scanner = new Scanner(System.in);
        
        int yas = scanner.nextInt();
        scanner.nextLine(); //dummy
        String isim = scanner.nextLine();
        
        System.out.println("yasınız " + yas);
        System.out.println("isminiz " +isim);
        
        
        // kullanıcıdan aldıgımız boy ve kılo degerlerıne gore kullanıcının beden kitle indeksini bulunuz 
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Kilonuzu giriniz : ");
        
        int kilo = scanner.nextInt();
        
        System.out.println("Boyunuz giriniz : ");
        
        double boy = scanner.nextDouble();
        
        double bki = kilo / (boy * boy);
        
        System.out.println("beden kitle indeksiniz : " + bki);
     
        
            Scanner scanner = new Scanner(System.in);
            
            System.out.println("lutfen kilonuzu giriniz :");
            
            int kilo = scanner.nextInt();
            
            System.out.println("Lutfen boyunuzu gırınız :");
            
            double boy = scanner.nextDouble();
            
            double bki = kilo / (boy * boy);
            
            System.out.println("Beden kitle indeksiniz :" + bki);
       
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Araciniz km de kac kurus yakiyor : ");
        
        double kurus = scanner.nextDouble();
        
        System.out.println("Araciniz kac km yol yaptı :");
        
        int km = scanner.nextInt();
        
        System.out.println("Toplam odemeniz gereken :" + (kurus*km) + "tl'dir....");
         
        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen birinici sayiyi giriniz :");
        
        int birinci_sayi = scanner.nextInt();
        
        System.out.println("Lutfen ikinci sayiyi giriniz :");
        
        int ikinci_sayi = scanner.nextInt();
        
        System.out.println("degistirilmeden once.....");
        System.out.println("Brinci Sayi :" + birinci_sayi + " İknici sayi :" + ikinci_sayi);
        
        int gecici = birinci_sayi;
        birinci_sayi = ikinci_sayi;
        ikinci_sayi = gecici;
        
        System.out.println("Degistirildikten sonra .....");
        
        System.out.println("Birinci sayi :" + birinci_sayi + " İkinci sayi :" + ikinci_sayi);
      
        
         Scanner scanner = new Scanner(System.in);
         
         System.out.println("Birinci Kenar : ");
         int a = scanner.nextInt();
         System.out.println("İkinci Kenar :");
         int b = scanner.nextInt();
         
         double h = Math.sqrt(a * a + b * b);
         
         System.out.println("Hipotenus :" + h);
         
     
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Lutfen bir sayi girinizi : ");
        int sayi = scanner.nextInt();
        
        if (sayi < 0) {
            
            System.out.println("Girdiginiz bir sayi negatif bir sayidir....");
            
        }
        else if (sayi > 0) {
            
            System.out.println("Girdiginiz bir sayi pozitiftir.....");
        }
        else{
            System.out.println("Girdiginiz bu deger notrdur......");
        }
         
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Lutfen sınav notunuzu gırınız :");
        
        int not = scanner.nextInt();
        
        if (not >= 90) {
            
            System.out.println("AA");
            
        }
        if (not >= 70 ) {
            
            System.out.println("CC");
        }
        else{
        
            System.out.println("Dersden kaldiniz......");
        }
         
        Scanner scanner = new Scanner(System.in);

        int islem = scanner.nextInt();

        switch (islem) {

            case 1:
                System.out.println("1.islem");
                break;
            case 2:
                System.out.println("2.islem");
                break;
            case 3:
                System.out.println("3.islem");
                break;
            default:
                System.out.println("Gecersiz islem.....");
                break;
        }
         
        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen Otamatimizdan yapacaginiz islemi seciniz :");

        int sayi = scanner.nextInt();

        switch (sayi) {
            case 1:
                System.out.println("Leziz bir cikolata sectiniz..");
                break;
            case 2:
                System.out.println("Leziz bir biskuvi sectiniz..");
                break;
            case 3:
                System.out.println("harika bir mal dostum buuu...");
                break;
            default:
                System.out.println("Malesef sectiginiz elimiz de kalmamistir tekrar deneyiniz...");
                break;
        }
         
        Scanner scanner = new Scanner(System.in);

        System.out.println("Birinci sayi :");
        int a = scanner.nextInt();
        System.out.println("İkinci sayi :");
        int b = scanner.nextInt();
        System.out.println("Ucuncu sayi :");
        int c = scanner.nextInt();

        int maks = -1;

        if (a >= b && a >= c) {

            maks = a;

        } else if (b >= a && b >= c) {

            maks = b;

        } else {
            maks = c;
        }

        System.out.println("Maksimum saiy : " + maks);
         
        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen kilonu giriniz :");
        int kilo = scanner.nextInt();
        System.out.println("Lutfen boyunuzu giriniz (örnegin : 1,72) :");
        double boy = scanner.nextDouble();

        double bki = (kilo / (boy * boy));

        if (bki <= 18.5) {

            System.out.println("Zayif");
        } else if (bki >= 18.5 && bki <= 25) {

            System.out.println("Normal");
        } else if (bki >= 25 && bki <= 30) {

            System.out.println("Fazla Kilolu");
        } else {

            System.out.println("Obez");
        }
        System.out.println("Sonuc deger :" + bki);
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("vize 1 :");
        int vize1 = scanner.nextInt();
        System.out.println("vize 2 :");
        int vize2 = scanner.nextInt();
        System.out.println("Finalnot :");
        int finalnot = scanner.nextInt();

        System.out.println("Okul Ortalamaniz :");
        double ortalama = scanner.nextDouble();

        double toplamnot = (vize1 * 3 / 10.0) + (vize2 * 3 / 10.0) + (finalnot * 4 / 10.0);

        if (toplamnot >= 90) {

            System.out.println("AA aldınız...");
        } else if (toplamnot >= 85) {
            System.out.println("BA aldınız...");
        } else if (toplamnot >= 80) {
            System.out.println("BB aldınız...");
        } else if (toplamnot >= 75) {
            System.out.println("CB aldınız...");
        } else if (toplamnot >= 70) {
            System.out.println("CC aldınız...");
        } else if (toplamnot >= 65) {
            System.out.println("DC aldınız...");
        } else if (toplamnot >= 60) {
            System.out.println("DD aldınız...");

            if (ortalama < 2.5) {

                System.out.println("DD aldınız ve Not ortalamanız düşük. Bu dersi tekrardan almayı düşünebilirsiniz.");

            }
        } else if (toplamnot >= 55) {
            System.out.println("FD aldınız ve Kaldınız...");
        } else {
            System.out.println("FF aldınız ve Kaldınız...");
        }
         
        
        for (int i = 0; i < 5 ; i++ ) {
            
            System.out.println("i = " + i);
        }
         
        for(int i = 10; i >= 0 ; i-- ){
        
            System.out.println("i = " + i);
        
        }
         
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Bir sayi giriniz :");
        
        int faktoriyer = 1;
        int sayi = scanner.nextInt();
        
        for (int i = 1; i <= sayi; i++) {
            
            faktoriyer *= i;
            System.out.println("faktoriyer =" + faktoriyer + "i =" + i);
        }
         
        int i = 0;
        int j = 10;
        
                
        for (; i < 10 && j > 0; i++ , j--){
    
        System.out.println("i =" + i);
        System.out.println("j =" + j);
    }
         
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Lutfen bir sayi giriniz :");
        int sayi = scanner.nextInt();
        
        int fak = 1;
        
        while (sayi > 0) {            
            
            fak *= sayi;
            sayi--;
        }
         
        Scanner scanner = new Scanner(System.in);
        int bakiye = 1000;

        String islemler = "1.islem : bakiye ogrenme\n"
                + "2.islem : Para cekme\n"
                + "3.islem : Para yatırma\n"
                + "Cıkıs icin q ' a basın";

        System.out.println("*************");
        System.out.println(islemler);
        System.out.println("*************");

        while (true) {

            System.out.println("islem seciniz :");
            String islem = scanner.nextLine();

            if (islem.equals("q")) {

                System.out.println("Program kapanıyor....");
                break;
            } else if (islem.equals("1")) {

                System.out.println("Bakiyeniz :" + bakiye);
            } else if (islem.equals("2")) {
                System.out.println("Cekmek istediginiz tutar : ");
                int tutar = scanner.nextInt();
                scanner.nextLine();

                if (bakiye - tutar < 0) {

                    System.out.println("Yeterli bakiyeniz mevcut degildir...." + bakiye);
                } else {

                    bakiye -= tutar;
                    System.out.println("Yeni bakiyeniz :" + bakiye);
                }
            } else if (islem.equals("3")) {

                System.out.println("Yatirmak istediginiz tutar :");
                int tutar = scanner.nextInt();
                scanner.nextLine();

                bakiye += tutar;

                System.out.println("Yeni Bakiyeniz :" + bakiye);

            } else {
                
                System.out.println("Gecersiz islem...........");

            }

        }
         
        
        for (int i = 1; i <= 10; i++) {
            
            System.out.println("************************");
            for (int j = 1; j <= 10; j++) {
                
                System.out.println(i + "x" + j + " = " + (i * j));
                
            }
            System.out.println("*************************");
        }
         
        Scanner scanner = new Scanner(System.in);

        int giris_hakki = 3;

        String sys_kullanici_adi = "Ali Rıza";
        String sys_parola = "12345" ;

        System.out.println("**************");
        System.out.println("Hosgeldiniz Ali Rıza BEYY");
        System.out.println("***************");

        while (true) {
            
            System.out.println("Kullanici adi : ");
            String kullanici = scanner.nextLine();
            System.out.println("Kullanici Parolasi : ");
            String parola = scanner.nextLine();
            
            if (kullanici.equals(sys_kullanici_adi) && parola.equals(sys_parola) ) {
                
                System.out.println("Hosgeldiniz ," + kullanici);
                break;
                
            }
            else if (kullanici.equals(sys_kullanici_adi) && !parola.equals(sys_parola)) {
                
                System.out.println("parolaniz yanlis tekrar deneyeniz...");
                giris_hakki -= 1;
                
                System.out.println("Giris Hakki :" + giris_hakki);
                
            }
            else if (!kullanici.equals(sys_kullanici_adi) && parola.equals(sys_parola)) {
                
                System.out.println("Kullanici adinizi yanlis girdiniz....");
                giris_hakki -= 1;
                System.out.println("Giris Hakkiniz :" + giris_hakki);
                
            }
            else {
            
                System.out.println("Kullanici adiniz ve Parolanizi Yanlıs Girdiniz...");
                giris_hakki -= 1;
                System.out.println("Giris Hakkiniz : " + giris_hakki);
                
            }
            if (giris_hakki == 0) {
                
                System.out.println("Giris Hakkiniz bitmistir. Tekrar Bekleriz...");
                break;
            }

        }
         
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Bankamıza Hosgendiniz..**Faiz Oranı: %6**");
        
        System.out.println("Yatirmak istediginiz tutar : ");
        int anapara = scanner.nextInt();
        
        System.out.println("Paranizi kac yil vadeli yatirmak istiyorsunuz..");
        int vade = scanner.nextInt();
        
        double toplampara = anapara;
        double faizoranı = 0.06;
        
        for (int i = 1; i <= vade; i++) {
            
            toplampara = (toplampara * faizoranı) + toplampara;
            
            System.out.println(i + ".yilinin sonunda toplam para :" + (int)toplampara);
                    
                    
        }
         
        
  
        selamlama("Ali Rıza ŞAHİN");
        
        
        toplama(14, 21, 12);
         
        
        toplama(10, 12, 20);
         
        
        System.out.println("Cikti degeri : " + test(12 , 13 , 15));
         
        
        System.out.println(test(2, 3));
         
        Scanner scanner = new Scanner(System.in);
        String myString = scanner.next();
        int myInt = scanner.nextInt();
        scanner.close();

        System.out.println("myString is: " + myString);
        System.out.println("myInt is: " + myInt);
         
        
         Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        // Complete this line
        // Complete this line
        a = 42;

        System.out.println(a);
        // Complete this line
        // Complete this line
        
         
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n > 20) {

            System.out.println("Not Weird");
        } 
        
        
        else{
        
            System.out.println("Weird");
        }
         
        
        
        System.out.println("Cıktı : " + test(12, 10));
         
        
        //System.out.println("Cıktımız : " + (dortilecarp(ikiilecarp(ikiiletopla(8)))));
        
        //selamlama("Ali Rıza");
        
        toplama(12 , 12, 34);
        toplama(12, 20);
         
        skorhesaplama("Ali Rıza", 90);
        skorhesaplama(100);
         
        for (int i = 2; i < 1000; i++) {

            if (asalMi(i)) {
                System.out.println(i);
            }
        }
         
        
        for (int i = 2; i < 1000; i++) {
            
            if (asalMi(i)) {
                System.out.println(i);
            }
        }
         
        Scanner sc = new Scanner(System.in);

        System.out.println("Lutfen birinci sayiyi giriniz :");
        int birinci_sayi = sc.nextInt();

        System.out.println("Lutfen ikinci sayiyi giriniz :");
        int ikinci_sayi = sc.nextInt();

        System.out.println("İki sayinin ebobu :" + ebobBulma(birinci_sayi, ikinci_sayi));
         */
        
        
    }
}
