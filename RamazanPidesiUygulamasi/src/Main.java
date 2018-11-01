
import java.util.*;

public class Main {

    //Ramazan Pidesi Uygulamsi
    //Fırından 1(dahil) ile 10(dahil) arasi pide cıkacak . Kuyruktakiler pideyi almaya calısacak..
    public static void main(String[] args) throws InterruptedException {

        System.out.println("Ramazan Pidesi Uygulamasi ....");

        Random random = new Random();

        Queue<String> pide_kuyrugu = new LinkedList<String>();

        pide_kuyrugu.offer("Murat");
        pide_kuyrugu.offer("Hasan");
        pide_kuyrugu.offer("Okan");
        pide_kuyrugu.offer("Ayşe");
        pide_kuyrugu.offer("Merve");
        pide_kuyrugu.offer("Ezgi");
        pide_kuyrugu.offer("Gizem");
        pide_kuyrugu.offer("Mehmet");
        pide_kuyrugu.offer("Oğuz");
        pide_kuyrugu.offer("Azer");

        int pide_sayisi = 1 + random.nextInt(10);

        System.out.println("Pide cıkıyor...");

        System.out.println("Cıkan Pide sayisi : " + pide_sayisi);

        Thread.sleep(30000);

        while (pide_sayisi != 0) {

            System.out.println(pide_kuyrugu.poll() + " Pideyi aldi...");
            pide_sayisi--;
            Thread.sleep(30000);

        }
        System.out.println("Pide kalmadi...");

    }

}
