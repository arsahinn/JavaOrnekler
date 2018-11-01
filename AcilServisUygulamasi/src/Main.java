
import java.util.*;
import java.util.concurrent.PriorityBlockingQueue;

public class Main {

    public static void main(String[] args) {

        // Acil Servis Uygulaması
        /*
        Hastalar Acil Serviste şikayetlerine göre kuyrukta en önlere geçecek(PriorityQueue).
        
        Apandisit ----> En yüksek öncelik
        Yanık -------> Orta Öncelik
        Baş Ağrısı ---> En düşük öncelik
        
        
        new Hasta("Murat Bey","Yanık")
         */
        Queue<Hasta> acilServis = new PriorityBlockingQueue<Hasta>();

        acilServis.offer(new Hasta("Murat Bey", "Yanik"));
        acilServis.offer(new Hasta("Okan Bey", "Bas Agrısı"));
        acilServis.offer(new Hasta("Elif Hanim", "Apandisit"));
        acilServis.offer(new Hasta("Oguz Bey", "Yanik"));
        acilServis.offer(new Hasta("Merve Hanim", "Yanik"));
        acilServis.offer(new Hasta("Gizem Hanim", "Apandisit"));

        int i = 1;

        while (acilServis.isEmpty() != true) {

            System.out.println("***********************");
            System.out.println(i + " .sırada");
            System.out.println(acilServis.poll());
            System.out.println("***********************");
            i++;

        }

    }

}
