
class Hayvan {

    private String isim;

    public Hayvan(String isim) {

        this.isim = isim;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String konus() {

        return "Hayvanlar Konusuyor....";

    }

}

class kedi extends Hayvan {

    public kedi(String isim) {
        super(isim);
    }

    @Override
    public String konus() {
        return this.getIsim() + " Miyavlıyor...";
    }

}

class Kopek extends Hayvan {

    public Kopek(String isim) {
        super(isim);
    }

    @Override
    public String konus() {
        return this.getIsim() + " Havlıyor....";
    }

}

class At extends Hayvan {

    public At(String isim) {
        super(isim);
    }

    @Override
    public String konus() {
        return this.getIsim() + " Kisşniyor...";
    }

}

public class Main {

    public static void konustur(Hayvan hayvan) {

        System.out.println(hayvan.konus());
    }
    public static void main(String[] args) {
        
        konustur(new kedi("Pammıh"));
        konustur(new Kopek("Karabas"));
        konustur(new At("SarıKız"));
        
    }

}
