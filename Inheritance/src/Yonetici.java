
public class Yonetici extends Calisan {
    //subclass

    private int sorumlu_kisi; // Ekstra Ozellik

    public Yonetici(String isim, int maas, String departman, int sorumlu_kisi) {

        super(isim, maas, departman);

        this.sorumlu_kisi = sorumlu_kisi;

    }

    public void zamYap(int zam_miktari) {

        System.out.println("Çalısanlara " + zam_miktari + "tl zam yapildi");

    }

    public void bilgilerigoster() {

        super.bilgilerigoster();

        System.out.println("Sorumlu Kisi Sayisi :" + this.sorumlu_kisi);

    }

}
