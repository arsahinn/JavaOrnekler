
public class Sayisal extends Aday {

    public Sayisal(int turkce, int matematik, int edebiyat, int fizik) {
        super(turkce, matematik, edebiyat, fizik);
    }

    @Override
    int puanHesapla() {

        return getTurkce() * 5 + getMatematik() * 5 + getEdebiyat() * 1 + getFizik() * 4;
    }

}
