
import java.util.Scanner;


public class test {

    public static void main(String[] args) {

        System.out.println("Beyblade Programina hosgeldiniz....");
        System.out.println("Cıkıs icin q'ya basınız....");
        
        Scanner scanner = new Scanner(System.in);
        
        while (true) {            
            System.out.println("Hangi beyblade i uretmek istiyorsun ? ");
            String islem = scanner.nextLine();
            if (islem.equals("q")) {
                System.out.println("Programdan cıkılıyor....");
                break;
            }
            else {
            
                BeybladeFabrikasi fabrika = new BeybladeFabrikasi();
                
                Beyblade beyblade = fabrika.beybladeUret(islem);
                
                if (beyblade == null) {
                    
                    System.out.println("Lutfen gecerli bir beyblade ismi giriniz...");
                }
                else{
                
                
                    beyblade.bilgileriGoster();
                    beyblade.saldir();
                    beyblade.kutsalCanavarOrtayaCikar();
                    
                }
            
            }
            
        }
        
        
        
    }

}
