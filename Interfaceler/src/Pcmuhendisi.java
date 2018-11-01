
public class Pcmuhendisi implements Imuhendis {

    private boolean askerlik;
    private boolean adli_sicil;

    public Pcmuhendisi(boolean askerlik, boolean adli_sicil) {
        this.askerlik = askerlik;
        this.adli_sicil = adli_sicil;
    }

    @Override
    public void askerlik_durumu_sorgula() {

        if (askerlik) {
            System.out.println("Askerligimi yaptım...");
        } else {

            System.out.println("Askerliğimi henuz yapmadım...");
        }

    }

    @Override
    public String mezuniyet_ortalmasi(double derece) {

        return "ortalamam " + derece;

    }

    @Override
    public void adli_sicil_sorgula() {

        if (adli_sicil) {
            System.out.println("Adli Sicil Kaydım Bulunuyor....");
        } else {

            System.out.println("Herhangı bir adli sicil kaydim bulunmuyor...");

        }
    }

    @Override
    public void is_tecrubesi(String[] array) {

        System.out.println("Bilgisayar Muh. Olarak Su Sirketlerde Calıstım....");

        for (int i = 0; i < array.length; i++) {

            System.out.println(array[i]);
        }

    }

}
