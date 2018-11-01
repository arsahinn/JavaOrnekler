
public class EsitAgirlik extends Aday {

    public EsitAgirlik(int turkce, int matematik, int edebiyat, int fizik) {
        super(turkce, matematik, edebiyat, fizik);
    }

    @Override
    int puanHesapla() {

        return getTurkce() * 5 + getMatematik() * 5 + getEdebiyat() * 4 + getFizik() * 1;
    }

}
