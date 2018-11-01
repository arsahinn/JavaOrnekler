
public class Main {

    public static void main(String[] args) {

        Pcmuhendisi muhendis1 = new Pcmuhendisi(true,true);
        
        muhendis1.askerlik_durumu_sorgula();
        muhendis1.adli_sicil_sorgula();
        System.out.println(muhendis1.mezuniyet_ortalmasi(3.17));
      //  String[] tecrube = {"Vestel","Havelsan","Turksat"};
        
       // muhendis1.is_tecrubesi(tecrube);
        
        System.out.println("************************************");
        
        MakineMuhendisi muhendisi2 = new MakineMuhendisi(true, false);
        
        String[] tecrube = {};
        
        String[] referans = {"Ali Rıza ŞAHİN" , "Serhat Say"};
        
        muhendisi2.adli_sicil_sorgula();
        muhendisi2.askerlik_durumu_sorgula();
        System.out.println(muhendisi2.mezuniyet_ortalmasi(2.15));
        muhendisi2.is_tecrubesi(tecrube);
        muhendisi2.refereans_getir(referans);
        muhendisi2.calis();
        
        
        
        
    }
}
