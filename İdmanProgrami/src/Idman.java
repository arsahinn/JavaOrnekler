
public class Idman {

    private int burbee_sayisi;
    private int pushup_sayisi;
    private int situp_sayisi;
    private int squat_sayisi;

    public Idman(int burbee_sayisi, int pushup_sayisi, int situp_sayisi, int squat_sayisi) {
        this.burbee_sayisi = burbee_sayisi;
        this.pushup_sayisi = pushup_sayisi;
        this.situp_sayisi = situp_sayisi;
        this.squat_sayisi = squat_sayisi;
    }

    public int getBurbee_sayisi() {
        return burbee_sayisi;
    }

    public void setBurbee_sayisi(int burbee_sayisi) {
        this.burbee_sayisi = burbee_sayisi;
    }

    public int getPushup_sayisi() {
        return pushup_sayisi;
    }

    public void setPushup_sayisi(int pushup_sayisi) {
        this.pushup_sayisi = pushup_sayisi;
    }

    public int getSitup_sayisi() {
        return situp_sayisi;
    }

    public void setSitup_sayisi(int situp_sayisi) {
        this.situp_sayisi = situp_sayisi;
    }

    public int getSquat_sayisi() {
        return squat_sayisi;
    }

    public void setSquat_sayisi(int squat_sayisi) {
        this.squat_sayisi = squat_sayisi;
    }

    //Kendi yazdigimiz metodlar buradan basliyor.....
    public void hareketYap(String hareketTuru, int sayi) {

        if (hareketTuru.equals("Burbee")) {

            burbeeYap(sayi);

        } else if (hareketTuru.equals("Pushup")) {

            pushupYap(sayi);

        } else if (hareketTuru.equals("Situp")) {

            situpYap(sayi);

        } else if (hareketTuru.equals("Squat")) {

            squatYap(sayi);

        } else {

            System.out.println("Gecersiz Hareket.....");

        }

        //Kosul icerisinde belirledigimiz metodları tanimliyoruz....
    }

    public void burbeeYap(int sayi) {

        if (burbee_sayisi == 0) {

            System.out.println("Yapacak burbee kalmadi...");
        }
        if (burbee_sayisi - sayi < 0) {

            System.out.println("Hedefledigin burbee sayısını gectin Tebrikler...");
            burbee_sayisi = 0;
            System.out.println("Kalan Burbee sayısı : " + burbee_sayisi);
        } else {

            burbee_sayisi -= sayi;
            System.out.println("Kalan Burbee sayisi : " + burbee_sayisi);

        }
    }

    public void pushupYap(int sayi) {

        if (pushup_sayisi == 0) {

            System.out.println("Yapacak pushup sayisi kalmadi ...");
        }
        if (pushup_sayisi - sayi < 0) {

            System.out.println("Hedefledıgın pushup sayısının gectın tebrikler ");
            pushup_sayisi = 0;
            System.out.println("Kalan Pushup sayisi : " + pushup_sayisi);

        } else {

            pushup_sayisi -= sayi;

            System.out.println("Kalan Pushup Sayisi : " + pushup_sayisi);

        }

    }

    public void situpYap(int sayi) {

        if (situp_sayisi == 0) {

            System.out.println("Yapacak situp sayisi kalmamıstır");
        }
        if (situp_sayisi - sayi < 0) {

            System.out.println("Hdeflediginden fazla situp sayısı yaptın tebrikler...");
            situp_sayisi = 0;
            System.out.println("Kalan situp sayisi : " + situp_sayisi);
        } else {

            situp_sayisi -= sayi;
            System.out.println("Kalan situp sayisi : " + situp_sayisi);

        }

    }

    public void squatYap(int sayi) {

        if (squat_sayisi == 0) {

            System.out.println("Yapacak squat kalmamıstır ....");
        }
        if (squat_sayisi - sayi < 0) {
            System.out.println("Hdefledıgınden daha fazla yaptınız tebrikler");
            squat_sayisi = 0;
            System.out.println("Kalan squat sayısı : " + squat_sayisi);

        } else {

            squat_sayisi -= sayi;
            System.out.println("Kalan squat sayisi : " + squat_sayisi);

        }

    }
    
    public boolean İdmanBittiMi(){
    
    
        return (burbee_sayisi == 0) && (pushup_sayisi == 0) && (situp_sayisi == 0) && (squat_sayisi == 0);
    
    }

}
