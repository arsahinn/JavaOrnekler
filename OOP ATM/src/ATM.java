
import java.util.Scanner;

public class ATM {

    public void calis(Hesap hesap) {

        Login login = new Login();

        Scanner sc = new Scanner(System.in);

        System.out.println("Bankamıza Hosgeldınız ....");
        System.out.println("**************************");
        System.out.println("Kullanıcı Gırısı");
        System.out.println("**************************");

        int giris_hakki = 3;

        while (true) {

            if (login.login(hesap)) {

                System.out.println("Giris Basiarli");
                break;
            } else {

                System.out.println("Grisi Basarisizz");

                giris_hakki -= 1;

                System.out.println("Kalan giris hakkınız : " + giris_hakki);

            }
            if (giris_hakki == 0) {
                System.out.println("Giris Hakkiniiz bitmistir");

                return;
            }
        }
        
        
        System.out.println("*********************************");
        String islemler = "1. Bakiye Görüntüle\n"
                          + "2. Para Yatırma\n"
                          + "3. Para Çekme\n"
                          + "Çıkış için q'ya basın";
        System.out.println(islemler);
        System.out.println("**********************************");
        
        
        while (true) {

            System.out.println("işlemi seciniz :");

            String islem = sc.nextLine();
            
            if (islem.equals("q")) {
                
                break;
                
            }
            else if (islem.equals("1")) {
                
                System.out.println("bakineiz :" + hesap.getBakiye());
                
            }
            else if (islem.equals("2")) {
                
                System.out.println("Ytırmak istediginiz tutar : ");
                
                int tutar = sc.nextInt();
                sc.nextLine();
                hesap.paraYatir(tutar);
            }
            else if (islem.equals("3")) {
                
                System.out.println("Cekmek istediginzi tutar :");
                int tutar = sc.nextInt();
                sc.nextLine();
                hesap.paraCek(tutar);
            }
            else {
            
                System.out.println("Gecersiz islem.....");
            
            }
            
        }
        

    }

}
