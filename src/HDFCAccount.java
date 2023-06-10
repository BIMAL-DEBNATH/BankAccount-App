import java.util.UUID;

public class HDFCAccount implements BankAccountInterface{
    private  String name;
    private  String AccountNo; // random ans unique uuid Number;
    private double Balance;
    private String passWord;
    final double rateOfInterest=6.1;

    public HDFCAccount() {
    }

    public HDFCAccount(String name,  double balance, String passWord) {
        this.name = name;
        this.AccountNo = String.valueOf(UUID.randomUUID());
        this.Balance = balance;
        this.passWord = passWord;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccountNo() {
        return AccountNo;
    }

    public void setAccountNo(String accountNo) {
        AccountNo = accountNo;
    }

    public double getBalance() {
        return Balance;
    }

    public void setBalance(double balance) {
        Balance = balance;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }


    @Override
    public String fetchBalance(String password) {

        if(this.passWord.equals(password)){
            return "Your account balance is : "+ this.Balance;
        }
        return "Incorrect Password";
    }

    @Override
    public double addMoney(double amount) {


        this.Balance+=amount;
        return this.Balance;

    }

    @Override
    public String withdrawMoney(String password, double amount) {

        if(this.passWord.equals(password)){
            if(this.Balance>=amount){
                this.Balance-=amount;
                return "Your money has been withdrawn.  The remaining Amount is : "+this.Balance;
            }else{
                return " Insufficient Amount";
            }
        }
        return "Incorrect password";
    }

    @Override
    public String changePassword(String newPassword, String oldPassword) {
        if(this.passWord.equals(oldPassword)){
            this.passWord=newPassword;
            return " Congratulation ! your password has beem Updated !!";
        }
        return "Incorrect password";
    }

    @Override
    public double calculateInterest(int years) {

        return (this.Balance*rateOfInterest*years)/100;
    }
}
