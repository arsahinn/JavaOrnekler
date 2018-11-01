
public class Main {

    public static void main(String[] args) throws InterruptedException {

        System.out.println("Sabiha Gokcen Havalimanına Hosgeldiniz....");

        String sartlar = "Yurtdışı Çıkış Kuralları...\n"
                + "Herhangi bir siyasi yasağınızın bulunmaması gerekiyor...\n"
                + "15 Tl harç bedelinizi tam olarak yatırmanız gerekiyor...\n"
                + "Gideceğiniz ülkeye vizenizin bulunması gerekiyor...";
        String messege = "Yurtdısı sartlarından hepsini saglamanız lazım....";

        while (true) {

            System.out.println("********************************");
            System.out.println(sartlar);
            System.out.println("********************************");

            Yolcu yolcu = new Yolcu();

            System.out.println("Harc bedeli kontrol ediliyor....");

            Thread.sleep(3000);

            if (yolcu.yurtdisiHarciKontrol() == false) {

                System.out.println(messege);
                continue;
            }

            System.out.println("Siyasi yasak kontrol ediliyor...");
            Thread.sleep(3000);

            if (yolcu.siyasiYasakKontrol() == false) {

                System.out.println(messege);
                continue;
            }

            System.out.println("Vize durumu Kontrol Ediliyor...");
            Thread.sleep(3000);

            
            if (yolcu.vizeDurumuKontrol() == false) {
                
                System.out.println(messege);
                continue;
            }
            
            System.out.println("İşlemleriniz tamam!! Yurtdısına cıkabılırsınızzz......");
        }

    }
}
