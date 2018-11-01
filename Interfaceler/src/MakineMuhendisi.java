
public class MakineMuhendisi implements Imuhendis , ICalisma {

    @Override
    public void calis() {
        
        System.out.println("Makine Muhendisi Calısıyor...");
    }

    private boolean askerlik;
    private boolean adli_sicil;

    public MakineMuhendisi(boolean askerlik, boolean adli_sicil) {
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

        if (array.length == 0) {
            System.out.println("Herhangi bir is terubem bulunmuyor....");
        } else {

            System.out.println("Makine Muhendisi olarak su sirketlerde caslıstım...");

            for (int i = 0; i < array.length; i++) {

                System.out.println(array[i]);
            }

        }

    }

    public void refereans_getir(String[] array) {

        if (array.length == 0) {

            System.out.println("Herhangi bir referansım bulunmamaktadır....");
        } else {

            System.out.println("Referanslarım....");

            for (int i = 0; i < array.length; i++) {

                System.out.println(array[i]);
            }

        }

    }

}
