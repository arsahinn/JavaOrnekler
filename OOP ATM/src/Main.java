
public class Main {

    public static void main(String[] args) {

        //Object Oriented (Nesne Yonelimli) ATM Programıi
        
        //Login Class'ı Kullanııcı girisini Kontrol edecek
        
        //Hesap Class'i Hesap islemlerini Yapacak
        
        //ATM ise atmmemizi calistiracak
        
        ATM atm = new ATM ();
        
        Hesap hesap = new Hesap("Ali Rıza" , "12345" , 2000);
        
        
        atm.calis(hesap);
        
        System.out.println("Programdan cikiliyor..");
        
    }

}
