
import javax.print.DocFlavor;

public class Hasta implements Comparable<Hasta> {

    private String isim;
    private String Sikayet;

    private int oncelik;

    public Hasta(String isim, String Sikayet) {
        this.isim = isim;
        this.Sikayet = Sikayet;

        if (Sikayet.equals("Apandisit")) {
            this.oncelik = 3;
        } else if (Sikayet.equals("Yanik")) {
            this.oncelik = 2;
        } else {

            this.oncelik = 1;
        }
    }

    @Override
    public String toString() {
        String bilgiler = " Hasta Adı : " + isim
                + "\nŞikayet : " + Sikayet
                + "\nÖncelik : " + oncelik;

        return bilgiler;
    }

    @Override
    public int compareTo(Hasta hasta) {

        if (this.oncelik > hasta.oncelik) {

            return -1;
        } else if (this.oncelik < hasta.oncelik) {

            return 1;
        } else {

            return 0;
        }
    }

}
