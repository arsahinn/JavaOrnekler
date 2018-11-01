
public class test {

    public static void main(String[] args) {

        Sayisal sayisal1 = new Sayisal(30, 40, 20, 30);
        Sayisal sayisal2 = new Sayisal(40, 10, 50, 0);

        Sayisal birinci = birinci(sayisal1, sayisal2);

        EsitAgirlik esitagirlik1 = new EsitAgirlik(30, 20, 40, 2);
        EsitAgirlik esitAgirlik2 = new EsitAgirlik(40, 10, 50, 0);

        EsitAgirlik birinci2 = birinci(esitagirlik1, esitAgirlik2);

        System.out.println("Birinci Sayısal Öğrencinin Puanı: " + birinci.puanHesapla());
        System.out.println("Birinci Eşit Ağırlık Öğrencinin Puanı: " + birinci2.puanHesapla());

    }

    public static <E extends Aday> E birinci(E e1, E e2) {

        if (e1.puanHesapla() > e2.puanHesapla()) {

            return e1;

        } else {

            return e2;
        }

    }
}
