public class BanckAccount {
    private String  Accountnumber;
    private float  balnce;
    private String  CustomerName;
    private String email;
    private String Phonenumber;


    public BanckAccount(){

        this("234324",23423432,"khalil","khali@gmail.com","0343234");
        System.out.println("default constractor");
    }
    public BanckAccount(String Accountnumber , float balnce , String CustomerName , String email , String PhoneNumber)
    {
        this.balnce=balnce;
        this.Accountnumber=Accountnumber;
        this.email=email;
        this.Phonenumber=PhoneNumber;
        this.CustomerName=CustomerName;

    }

    public String getAccountnumber() {
        return Accountnumber;
    }

    public float getBalnce() {
        return balnce;
    }

    public String getCustomerName() {
        return CustomerName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhonenumber() {
        return Phonenumber;
    }

    public void setAccountnumber(String accountnumber) {
        Accountnumber = accountnumber;
    }

    public void setBalnce(float balnce) {
        this.balnce = balnce;
    }

    public void setCustomerName(String customerName) {
        CustomerName = customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhonenumber(String phonenumber) {
        Phonenumber = phonenumber;
    }

    public  void depositFunds( double funds){

        this.balnce+=funds;

    }
    public void  whitdrawFunds(double amount){
        if(amount>balnce) {
            System.out.println("funds unavailable");

        }
        else
            balnce-=amount;



    }

}
