
public class GelismisAbone {

    private String abone_isim;
    private int bakiye = 120;
    private String sehir;

    public GelismisAbone(String abone_isim, String sehir) {
        this.abone_isim = abone_isim;

        if (bakiye >= 0 && bakiye <= 120) {
            this.bakiye = bakiye;
        }

        this.sehir = sehir;
    }

    GelismisAbone(String ali_Rıza_ŞAHİN_, int i, String ankara) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public void dogalgaz_kullan(int miktar){
    
        if ((this.bakiye - miktar) < 0) {
            
            System.out.println("Yeterli Bakiye Yok.");
        }
        else {
        
            this.bakiye -= miktar;
            
            if (this.bakiye <= 0) {
                
                System.out.println("Bakiyeniz bitmistir. Lutfen en yakın abone merkezıne giderek kredi yukleyın" 
                + "Kredi limiti : 120 tl");
            }
            else {
            
                System.out.println("Yeni bakiye = " + bakiye);
            }
        }
    
    
    }
    public void bakiye_ogren(){
    
        System.out.println("Bakiye = " + bakiye);
    }

}
