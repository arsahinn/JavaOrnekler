package kaydetma;

import java.util.Scanner;

public class Kaydetma {
    
    public static int cikarma(int a, int b) {
        
        return (a + b);
    }
    
    public static double bolme(int a, int b) {
        
        return ((double) a / b);
    }
    
    public static int toplama(int a, int b) {
        
        return (a + b);
    }
    
    public static int toplama(int a, int b, int c) {
        
        return (a + b + c);
    }
    
    public static int carpma(int a, int b) {
        
        return (a * b);
    }
    
    public static int carpma(int a, int b, int c) {
        
        return a * b * c;
    }
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        String islemler = "1. Toplama İşlemi\n"
                + "2. Çıkarma İşlemi\n"
                + "3. Çarpma İşlemi\n"
                + "4. Bölme İşlemi\n"
                + "Çıkış için q'ya basın.";
        System.out.println("****************************************");
        System.out.println(islemler);
        System.out.println("****************************************");
        
        while (true) {
            
            System.out.println("İsleminizi Seciniz : ");
            String islem = sc.nextLine();
            
            if (islem.equals("q")) {
                
                System.out.println("Program sonlandirikmaktadir...");
                break;
                
            } else if (islem.equals("1")) {
                
                System.out.println("Kac deger toplayacaksiniz ? (2 veya 3): ");
                
                int kacsayi = sc.nextInt();
                
                if (kacsayi == 2) {
                    
                    System.out.println("a:");
                    int a = sc.nextInt();
                    System.out.println("b:");
                    int b = sc.nextInt();
                    
                    System.out.println("Girilen sayilarin toplami :" + (toplama(a, b)));
                } else if (kacsayi == 3) {
                    
                    System.out.println("a:");
                    int a = sc.nextInt();
                    System.out.println("b:");
                    int b = sc.nextInt();
                    System.out.println("c:");
                    int c = sc.nextInt();
                    
                    System.out.println("Girilen sayilarin degeri : " + toplama(a, b, c));
                    
                } else {
                    
                    System.out.println("Bunun icin bir deger bulunmamaktadir...");
                }
                
            } else if (islem.equals("2")) {
                
                System.out.println("a:");
                int a = sc.nextInt();
                System.out.println("b:");
                int b = sc.nextInt();
                
                System.out.println("Girilen sayilarin degeri :" + cikarma(a, b));
                
            } else if (islem.equals("3")) {
                
                System.out.print("Kaç değer çarpacaksınız ? (2 veya 3): ");
                
                int kacsayi = sc.nextInt();
                
                if (kacsayi == 2) {
                    
                    System.out.println("a:");
                    int a = sc.nextInt();
                    System.out.println("b:");
                    int b = sc.nextInt();
                    
                    System.out.println("Girilen degerlerin carpimi :" + carpma(a, b));
                    
                } else if (kacsayi == 3) {
                    
                    System.out.println("a:");
                    int a = sc.nextInt();
                    System.out.println("b:");
                    int b = sc.nextInt();
                    System.out.println("c:");
                    int c = sc.nextInt();
                    
                    System.out.println("Girilen sayilarin carpimi : " + carpma(a, b, c));
                    
                } else {
                    
                    System.out.println("Bunun icin bir deger bulunmamaktadir...");
                }
                
            } else if (islem.equals("4")) {
                
                System.out.println("a:");
                int a = sc.nextInt();
                System.out.println("b:");
                int b = sc.nextInt();
                sc.nextLine();
                
                System.out.println("Girilen degerlerin bolumu :" + bolme(a, b));
                
            } else {
                
                System.out.println("Gecersiz islemde bulundunuz....");
            }
        }
        
    }
    
}
