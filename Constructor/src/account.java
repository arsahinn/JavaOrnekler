public class account {
    
    private String hesapNo;
    private double bakiye;
    private String isim;
    
    private String email;
    
    private  String telefonNO;

    public account(){
    
        System.out.println("Kendi yazdıgımzı constructor");
    
    }
    
    public account(String hesapNo , double bakiye , String isim , String email , String telefonNo){
    
    this.hesapNo = hesapNo;
    this.bakiye = bakiye;
    this.isim = isim;
    this.email = email;
    this.telefonNO = telefonNo;
    
    }
    
    
    
    public void paraYatir(double miktar){
    
        bakiye += miktar;
        
        System.out.println("Yeni bakiye = " + bakiye);
        
    }
    
    public void paraCekme(double miktar){
    
        if (miktar > 1500) {
            System.out.println("Bir günden 1500 tlden fazla cekeemzsınız");
        }
        if (bakiye - miktar < 0) {
            System.out.println("yeterli Bakiye yok. Bakiye = " + bakiye );
        }
        else {
        
            bakiye -= miktar;
            
            System.out.println("Yeni Bakiye = " + bakiye);
        
        }
    
    }
    
    /**
     * @return the hesapNo
     */
    public String getHesapNo() {
        return hesapNo;
    }

    /**
     * @param hesapNo the hesapNo to set
     */
    public void setHesapNo(String hesapNo) {
        this.hesapNo = hesapNo;
    }

    /**
     * @return the bakiye
     */
    public double getBakiye() {
        return bakiye;
    }

    /**
     * @param bakiye the bakiye to set
     */
    public void setBakiye(double bakiye) {
        this.bakiye = bakiye;
    }

    /**
     * @return the isim
     */
    public String getIsim() {
        return isim;
    }

    /**
     * @param isim the isim to set
     */
    public void setIsim(String isim) {
        this.isim = isim;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the telefonNO
     */
    public String getTelefonNO() {
        return telefonNO;
    }

    /**
     * @param telefonNO the telefonNO to set
     */
    public void setTelefonNO(String telefonNO) {
        this.telefonNO = telefonNO;
    }
}
