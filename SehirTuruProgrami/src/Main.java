
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {

    public static void islemleri_bastir() {

        System.out.println("0 - İslemleri Goruntule..");
        System.out.println("1 - Bir sonraki sehire git..");
        System.out.println("2 - Bir önceki şehre git...");
        System.out.println("3 - Uygulamadan cık..");

    }

    public static void sehirleri_turla(LinkedList<String> sehirler) {

        ListIterator<String> iterator = sehirler.listIterator();

        int islem;

        islemleri_bastir();

        Scanner scanner = new Scanner(System.in);

        if (!iterator.hasNext()) {

            System.out.println("Herhangi bir sehir bulunmuyor...");

        }
        boolean cikis = false;
        boolean ileri = true;

        while (!cikis) {

            System.out.println("Bir islem seciniz :");

            islem = scanner.nextInt();

            switch (islem) {

                case 0:
                    islemleri_bastir();
                    break;
                case 1:
                    if (!ileri) {
                        if (iterator.hasNext()) {

                            iterator.next();
                        }
                        ileri = true;
                    }
                    if (iterator.hasNext()) {

                        System.out.println("Sehre gidiliyor :" + iterator.next());
                    } else {

                        System.out.println("Gidilecek sehir kalmadi...");

                    }
                    break;
                case 2:
                    if (ileri) {
                        if (iterator.hasPrevious()) {
                            iterator.previous();
                        }
                        ileri = false;
                    }
                    if (iterator.hasPrevious()) {

                        System.out.println("Sehre Gidiliyor : " + iterator.previous());
                    } else {

                        System.out.println("Sehir Turu Basladi .....");

                    }
                    break;
                case 3:
                    cikis = true;
                    System.out.println("uygulamadan cıkılıyor.....");
                    break;

            }
        }

    }

    public static void main(String[] args) {

        LinkedList<String> sehirler = new LinkedList<String>();

        sehirler.add("Ankara");
        sehirler.add("Eskisehir");
        sehirler.add("Afyon");

        sehirleri_turla(sehirler);
    }

}
