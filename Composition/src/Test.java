
public class Test {

    public static void main(String[] args) {
        
        Resolution resolution = new Resolution(1920, 1080);
        Monitor monitor = new Monitor("VSJL7", "Samsung", "21,5", resolution);
        Kasa kasa = new Kasa("Shadow-Blade", "Shadow", "Temperli Cam");
        Anakart anakart = new  Anakart("B250-PRO", "Samnsung", 10, "Win-10");
        Bilgisayar Pc = new Bilgisayar(monitor, kasa, anakart);
        
        Pc.getKasa().bilgisayari_ac();
        Pc.getMonitor().monitoru_kapat();
        Pc.getAnakart().isletim_sistemi_yukle("Ubuntu 16.64");
        
    }

}
